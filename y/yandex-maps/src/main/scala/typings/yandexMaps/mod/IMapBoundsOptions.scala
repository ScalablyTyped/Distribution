package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapBoundsOptions
  extends StObject
     with IMapPositionOptions {
  
  var preciseZoom: js.UndefOr[Boolean] = js.undefined
  
  var zoomMargin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
}
object IMapBoundsOptions {
  
  inline def apply(): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapBoundsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapBoundsOptions] (val x: Self) extends AnyVal {
    
    inline def setPreciseZoom(value: Boolean): Self = StObject.set(x, "preciseZoom", value.asInstanceOf[js.Any])
    
    inline def setPreciseZoomUndefined: Self = StObject.set(x, "preciseZoom", js.undefined)
    
    inline def setZoomMargin(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    inline def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    inline def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "zoomMargin", js.Array(value*))
  }
}
