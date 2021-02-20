package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.divide
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import typings.tuyaPanelKit.tuyaPanelKitStrings.swiper
import typings.tuyaPanelKit.tuyaPanelKitStrings.warp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGroupProps extends StObject {
  
  var children: ReactNode = js.native
  
  var size: js.UndefOr[large | normal | small | Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swiperConfig: js.UndefOr[CarouselProps] = js.native
  
  var `type`: js.UndefOr[warp | swiper | divide] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object BarGroupProps {
  
  @scala.inline
  def apply(): BarGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupProps]
  }
  
  @scala.inline
  implicit class BarGroupPropsMutableBuilder[Self <: BarGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSwiperConfig(value: CarouselProps): Self = StObject.set(x, "swiperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiperConfigUndefined: Self = StObject.set(x, "swiperConfig", js.undefined)
    
    @scala.inline
    def setType(value: warp | swiper | divide): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
