package typings.tuyaPanelKit.mod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewPagerAndroidProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.CurrentIndex
import org.scalablytyped.runtime.StObject
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
  implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    @scala.inline
    def setCarouselChange(value: /* index */ Double => Unit): Self = StObject.set(x, "carouselChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCarouselChangeUndefined: Self = StObject.set(x, "carouselChange", js.undefined)
    
    @scala.inline
    def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
    
    @scala.inline
    def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
    
    @scala.inline
    def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
    
    @scala.inline
    def setDotWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotWrapperStyleNull: Self = StObject.set(x, "dotWrapperStyle", null)
    
    @scala.inline
    def setDotWrapperStyleUndefined: Self = StObject.set(x, "dotWrapperStyle", js.undefined)
    
    @scala.inline
    def setDots(value: ElementType[_] | (js.Function1[/* params */ CurrentIndex, ReactNode])): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsFunction1(value: /* params */ CurrentIndex => ReactNode): Self = StObject.set(x, "dots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    @scala.inline
    def setHasDots(value: Boolean): Self = StObject.set(x, "hasDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDotsUndefined: Self = StObject.set(x, "hasDots", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setOnMomentumScrollEnd(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    @scala.inline
    def setOnScrollBeginDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    @scala.inline
    def setOnScrollEndDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    @scala.inline
    def setPageStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyleNull: Self = StObject.set(x, "pageStyle", null)
    
    @scala.inline
    def setPageStyleUndefined: Self = StObject.set(x, "pageStyle", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    @scala.inline
    def setUseViewPagerOnAndroid(value: Boolean): Self = StObject.set(x, "useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseViewPagerOnAndroidUndefined: Self = StObject.set(x, "useViewPagerOnAndroid", js.undefined)
  }
}
