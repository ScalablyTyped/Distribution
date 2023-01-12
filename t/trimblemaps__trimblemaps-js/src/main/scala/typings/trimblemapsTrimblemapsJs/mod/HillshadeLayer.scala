package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.hillshade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HillshadeLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_HillshadeLayer: js.UndefOr[HillshadeLayout] = js.undefined
  
  @JSName("paint")
  var paint_HillshadeLayer: js.UndefOr[HillshadePaint] = js.undefined
  
  @JSName("type")
  var type_HillshadeLayer: hillshade
}
object HillshadeLayer {
  
  inline def apply(id: String): HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[HillshadeLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HillshadeLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: HillshadeLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: HillshadePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: hillshade): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
