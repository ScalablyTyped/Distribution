package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.raster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_RasterLayer: js.UndefOr[RasterLayout] = js.undefined
  
  @JSName("paint")
  var paint_RasterLayer: js.UndefOr[RasterPaint] = js.undefined
  
  @JSName("type")
  var type_RasterLayer: raster
}
object RasterLayer {
  
  inline def apply(id: String): RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[RasterLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: RasterLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: RasterPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
