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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarouselProps
  extends StObject
     with ViewPagerAndroidProps {
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  var carouselChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var dotWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var dots: js.UndefOr[ElementType[js.Any] | (js.Function1[/* params */ CurrentIndex, ReactNode])] = js.undefined
  
  var hasDots: js.UndefOr[Boolean] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var onMomentumScrollEnd: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.undefined
  
  var onScrollBeginDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.undefined
  
  var onScrollEndDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any, Unit]
  ] = js.undefined
  
  var pageStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var useViewPagerOnAndroid: js.UndefOr[Boolean] = js.undefined
}
object CarouselProps {
  
  inline def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  
  extension [Self <: CarouselProps](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
    
    inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setCarouselChange(value: /* index */ Double => Unit): Self = StObject.set(x, "carouselChange", js.Any.fromFunction1(value))
    
    inline def setCarouselChangeUndefined: Self = StObject.set(x, "carouselChange", js.undefined)
    
    inline def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
    
    inline def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
    
    inline def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
    
    inline def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
    
    inline def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
    
    inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
    
    inline def setDotWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setDotWrapperStyleNull: Self = StObject.set(x, "dotWrapperStyle", null)
    
    inline def setDotWrapperStyleUndefined: Self = StObject.set(x, "dotWrapperStyle", js.undefined)
    
    inline def setDots(value: ElementType[js.Any] | (js.Function1[/* params */ CurrentIndex, ReactNode])): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsFunction1(value: /* params */ CurrentIndex => ReactNode): Self = StObject.set(x, "dots", js.Any.fromFunction1(value))
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setHasDots(value: Boolean): Self = StObject.set(x, "hasDots", value.asInstanceOf[js.Any])
    
    inline def setHasDotsUndefined: Self = StObject.set(x, "hasDots", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction2(value))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnScrollBeginDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction2(value))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ js.Any) => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction2(value))
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setPageStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pageStyle", value.asInstanceOf[js.Any])
    
    inline def setPageStyleNull: Self = StObject.set(x, "pageStyle", null)
    
    inline def setPageStyleUndefined: Self = StObject.set(x, "pageStyle", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setUseViewPagerOnAndroid(value: Boolean): Self = StObject.set(x, "useViewPagerOnAndroid", value.asInstanceOf[js.Any])
    
    inline def setUseViewPagerOnAndroidUndefined: Self = StObject.set(x, "useViewPagerOnAndroid", js.undefined)
  }
}
