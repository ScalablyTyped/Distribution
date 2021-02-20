package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapBoundsOptions extends IMapPositionOptions {
  
  var preciseZoom: js.UndefOr[Boolean] = js.native
  
  var zoomMargin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
}
object IMapBoundsOptions {
  
  @scala.inline
  def apply(): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapBoundsOptions]
  }
  
  @scala.inline
  implicit class IMapBoundsOptionsMutableBuilder[Self <: IMapBoundsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreciseZoom(value: Boolean): Self = StObject.set(x, "preciseZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreciseZoomUndefined: Self = StObject.set(x, "preciseZoom", js.undefined)
    
    @scala.inline
    def setZoomMargin(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "zoomMargin", js.Array(value :_*))
  }
}
