package typings.three

import typings.three.srcMathColorMod.Color
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScenesFogMod {
  
  @JSImport("three/src/scenes/Fog", "Fog")
  @js.native
  open class Fog protected ()
    extends StObject
       with FogBase {
    /**
      * The color parameter is passed to the {@link THREE.Color | Color} constructor to set the color property
      * @remarks
      * Color can be a hexadecimal integer or a CSS-style string.
      * @param color
      * @param near Expects a `Float`
      * @param far Expects a `Float`
      */
    def this(color: ColorRepresentation) = this()
    def this(color: ColorRepresentation, near: Double) = this()
    def this(color: ColorRepresentation, near: Double, far: Double) = this()
    def this(color: ColorRepresentation, near: Unit, far: Double) = this()
    
    /**
      * Fog color.
      * @remarks If set to black, far away objects will be rendered black.
      */
    /* CompleteClass */
    var color: Color = js.native
    
    /**
      * The maximum distance at which fog stops being calculated and applied.
      * @remarks Objects that are more than **far** units away from the active camera won't be affected by fog.
      * @defaultValue `1000`
      * @remarks Expects a `Float`
      */
    var far: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Fog}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isFog: `true` = js.native
    
    /**
      * Optional name of the `Fog` object
      * @remarks _(doesn't need to be unique)_.
      * @defaultValue `""`
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The minimum distance to start applying fog.
      * @remarks Objects that are less than **near** units from the active camera won't be affected by fog.
      * @defaultValue `1`
      * @remarks Expects a `Float`
      */
    var near: Double = js.native
    
    /**
      * Return Fog data in JSON format.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  trait FogBase extends StObject {
    
    /**
      * Fog color.
      * @remarks If set to black, far away objects will be rendered black.
      */
    var color: Color
    
    /**
      * Optional name of the `Fog` object
      * @remarks _(doesn't need to be unique)_.
      * @defaultValue `""`
      */
    var name: String
    
    /**
      * Return Fog data in JSON format.
      */
    def toJSON(): Any
  }
  object FogBase {
    
    inline def apply(color: Color, name: String, toJSON: () => Any): FogBase = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FogBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FogBase] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
