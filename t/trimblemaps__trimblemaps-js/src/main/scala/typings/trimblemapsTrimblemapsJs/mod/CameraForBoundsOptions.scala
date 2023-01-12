package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraForBoundsOptions
  extends StObject
     with CameraOptions {
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[PointLike] = js.undefined
  
  var padding: js.UndefOr[Double | PaddingOptions] = js.undefined
}
object CameraForBoundsOptions {
  
  inline def apply(): CameraForBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraForBoundsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraForBoundsOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPadding(value: Double | PaddingOptions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
