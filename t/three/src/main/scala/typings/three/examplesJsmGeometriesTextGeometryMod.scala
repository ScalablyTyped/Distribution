package typings.three

import typings.three.anon.Options
import typings.three.examplesJsmLoadersFontLoaderMod.Font
import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.srcThreeMod.ExtrudeGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesTextGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/TextGeometry", "TextBufferGeometry")
  @js.native
  open class TextBufferGeometry protected () extends TextGeometry {
    /**
      * Create a new instance of {@link TextGeometry}
      * @param text The text that needs to be shown.
      * @param parameters Object that can contain the following parameters. @see {@link TextGeometryParameters} for defaults.
      */
    def this(text: String) = this()
    def this(text: String, parameters: TextGeometryParameters) = this()
  }
  
  @JSImport("three/examples/jsm/geometries/TextGeometry", "TextGeometry")
  @js.native
  open class TextGeometry protected () extends ExtrudeGeometry {
    /**
      * Create a new instance of {@link TextGeometry}
      * @param text The text that needs to be shown.
      * @param parameters Object that can contain the following parameters. @see {@link TextGeometryParameters} for defaults.
      */
    def this(text: String) = this()
    def this(text: String, parameters: TextGeometryParameters) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    @JSName("parameters")
    val parameters_TextGeometry: Options = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `TextGeometry`
      */
    @JSName("type")
    val type_TextGeometry: String | typings.three.threeStrings.TextGeometry = js.native
  }
  
  trait TextGeometryParameters
    extends StObject
       with ExtrudeGeometryOptions {
    
    var font: Font
    
    /**
      * Thickness to extrude text.
      * Expects a `Float`.
      * @defaultValue `50`
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the text
      * Expects a `Float`.
      * @defaultValue `100`
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object TextGeometryParameters {
    
    inline def apply(font: Font): TextGeometryParameters = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextGeometryParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextGeometryParameters] (val x: Self) extends AnyVal {
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
