package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.large
import typings.yandexMaps.yandexMapsStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[Left] = js.undefined
  
  var size: js.UndefOr[small | large | auto] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zoomDuration: js.UndefOr[Double] = js.undefined
  
  var zoomStep: js.UndefOr[Double] = js.undefined
}
object Size {
  
  inline def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    inline def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    inline def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: small | large | auto): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
    
    inline def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
    
    inline def setZoomStep(value: Double): Self = StObject.set(x, "zoomStep", value.asInstanceOf[js.Any])
    
    inline def setZoomStepUndefined: Self = StObject.set(x, "zoomStep", js.undefined)
  }
}
