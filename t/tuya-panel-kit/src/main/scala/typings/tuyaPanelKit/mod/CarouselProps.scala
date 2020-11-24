package typings.tuyaPanelKit.mod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewPagerAndroidProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.CurrentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps extends ViewPagerAndroidProps {
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var autoplayInterval: js.UndefOr[Double] = js.native
  
  var bounces: js.UndefOr[Boolean] = js.native
  
  var carouselChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dotWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dots: js.UndefOr[ElementType[_] | (js.Function1[/* params */ CurrentIndex, ReactNode])] = js.native
  
  var hasDots: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var onMomentumScrollEnd: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.native
  
  var onScrollBeginDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.native
  
  var onScrollEndDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.native
  
  var pageStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
  
  var useViewPagerOnAndroid: js.UndefOr[Boolean] = js.native
}
object CarouselProps {
  
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutoplayInterval(value: Double): Self = this.set("autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplayInterval: Self = this.set("autoplayInterval", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = this.set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounces: Self = this.set("bounces", js.undefined)
    
    @scala.inline
    def setCarouselChange(value: /* index */ Double => Unit): Self = this.set("carouselChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCarouselChange: Self = this.set("carouselChange", js.undefined)
    
    @scala.inline
    def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotActiveStyle: Self = this.set("dotActiveStyle", js.undefined)
    
    @scala.inline
    def setDotActiveStyleNull: Self = this.set("dotActiveStyle", null)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setDotStyleNull: Self = this.set("dotStyle", null)
    
    @scala.inline
    def setDotWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("dotWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotWrapperStyle: Self = this.set("dotWrapperStyle", js.undefined)
    
    @scala.inline
    def setDotWrapperStyleNull: Self = this.set("dotWrapperStyle", null)
    
    @scala.inline
    def setDotsFunction1(value: /* params */ CurrentIndex => ReactNode): Self = this.set("dots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDots(value: ElementType[_] | (js.Function1[/* params */ CurrentIndex, ReactNode])): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setHasDots(value: Boolean): Self = this.set("hasDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDots: Self = this.set("hasDots", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = this.set("onMomentumScrollEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMomentumScrollEnd: Self = this.set("onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = this.set("onScrollBeginDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScrollBeginDrag: Self = this.set("onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = this.set("onScrollEndDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScrollEndDrag: Self = this.set("onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setPageStyle(value: StyleProp[ViewStyle]): Self = this.set("pageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageStyle: Self = this.set("pageStyle", js.undefined)
    
    @scala.inline
    def setPageStyleNull: Self = this.set("pageStyle", null)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setUseViewPagerOnAndroid(value: Boolean): Self = this.set("useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseViewPagerOnAndroid: Self = this.set("useViewPagerOnAndroid", js.undefined)
  }
}
