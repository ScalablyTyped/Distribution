package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.large
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.medium
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import typings.yandexMaps.yandexMapsStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustMapMargin extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  
  var collapseOnBlur: js.UndefOr[Boolean] = js.native
  
  var float: js.UndefOr[none | left | right] = js.native
  
  var floatIndex: js.UndefOr[Double] = js.native
  
  var popupAnimate: js.UndefOr[Boolean] = js.native
  
  var popupFloat: js.UndefOr[auto | left | right] = js.native
  
  var popupWidth: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
  
  var size: js.UndefOr[auto | small | medium | large] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object AdjustMapMargin {
  
  @scala.inline
  def apply(): AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustMapMargin]
  }
  
  @scala.inline
  implicit class AdjustMapMarginMutableBuilder[Self <: AdjustMapMargin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    @scala.inline
    def setCollapseOnBlur(value: Boolean): Self = StObject.set(x, "collapseOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseOnBlurUndefined: Self = StObject.set(x, "collapseOnBlur", js.undefined)
    
    @scala.inline
    def setFloat(value: none | left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setPopupAnimate(value: Boolean): Self = StObject.set(x, "popupAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupAnimateUndefined: Self = StObject.set(x, "popupAnimate", js.undefined)
    
    @scala.inline
    def setPopupFloat(value: auto | left | right): Self = StObject.set(x, "popupFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupFloatUndefined: Self = StObject.set(x, "popupFloat", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSize(value: auto | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
