package typings.three

import typings.three.anon.BevelEnabled
import typings.three.fontLoaderMod.Font
import typings.three.threeMod.ExtrudeGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/TextGeometry", "TextBufferGeometry")
  @js.native
  open class TextBufferGeometry protected () extends TextGeometry {
    def this(text: String, parameters: TextGeometryParameters) = this()
  }
  
  @JSImport("three/examples/jsm/geometries/TextGeometry", "TextGeometry")
  @js.native
  open class TextGeometry protected () extends ExtrudeGeometry {
    def this(text: String, parameters: TextGeometryParameters) = this()
    
    var parameters: BevelEnabled = js.native
  }
  
  trait TextGeometryParameters extends StObject {
    
    var bevelEnabled: js.UndefOr[Boolean] = js.undefined
    
    var bevelOffset: js.UndefOr[Double] = js.undefined
    
    var bevelSegments: js.UndefOr[Double] = js.undefined
    
    var bevelSize: js.UndefOr[Double] = js.undefined
    
    var bevelThickness: js.UndefOr[Double] = js.undefined
    
    var curveSegments: js.UndefOr[Double] = js.undefined
    
    var font: Font
    
    var height: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object TextGeometryParameters {
    
    inline def apply(font: Font): TextGeometryParameters = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextGeometryParameters]
    }
    
    extension [Self <: TextGeometryParameters](x: Self) {
      
      inline def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
      
      inline def setBevelEnabledUndefined: Self = StObject.set(x, "bevelEnabled", js.undefined)
      
      inline def setBevelOffset(value: Double): Self = StObject.set(x, "bevelOffset", value.asInstanceOf[js.Any])
      
      inline def setBevelOffsetUndefined: Self = StObject.set(x, "bevelOffset", js.undefined)
      
      inline def setBevelSegments(value: Double): Self = StObject.set(x, "bevelSegments", value.asInstanceOf[js.Any])
      
      inline def setBevelSegmentsUndefined: Self = StObject.set(x, "bevelSegments", js.undefined)
      
      inline def setBevelSize(value: Double): Self = StObject.set(x, "bevelSize", value.asInstanceOf[js.Any])
      
      inline def setBevelSizeUndefined: Self = StObject.set(x, "bevelSize", js.undefined)
      
      inline def setBevelThickness(value: Double): Self = StObject.set(x, "bevelThickness", value.asInstanceOf[js.Any])
      
      inline def setBevelThicknessUndefined: Self = StObject.set(x, "bevelThickness", js.undefined)
      
      inline def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
      
      inline def setCurveSegmentsUndefined: Self = StObject.set(x, "curveSegments", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
