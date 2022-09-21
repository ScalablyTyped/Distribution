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
  
  /**
    * @language zh-CN
    * @description 是否自动播放
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Auto play
    * @defaultValue false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自动播放间隔时间(ms)
    * @defaultValue 2000
    */
  /**
    * @language en-US
    * @description Auto play interval (ms)
    * @defaultValue 2000
    */
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当内容范围比滚动视图本身大时，是否弹性拉动一截
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description When the content range is larger than the scrolling view itself, is it elastic to pull a section
    * @defaultValue true
    */
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 轮播图切换事件
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Carousel chart switching event
    * @defaultValue () => {}
    */
  var carouselChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前激活的指示点样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The currently active indicator style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 指示点样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Indicator point style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 指示点的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Indicates the style of the point
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var dotWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义指示点
    * @types React.ElementType | ((params: { dotStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>; dotWrapperStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>; dotActiveStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>; currentIndex: number; count: number;}) => React.ReactNode)
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/carousel/dot.js#L33">defaultDot</a>
    */
  /**
    * @language en-US
    * @description Custom indicator point
    * @types React.ElementType | ((params: { dotStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>;dotWrapperStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>;dotActiveStyle: <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>; currentIndex: number; count: number;}) => React.ReactNode)
    * @defaultValue <a target="_blank" href="https://github.com/tuya/tuya-panel-kit/blob/master/src/components/carousel/dot.js#L33">defaultDot</a>
    */
  var dots: js.UndefOr[ElementType[Any] | (js.Function1[/* params */ CurrentIndex, ReactNode])] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否有指示点
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is there an indication point
    * @defaultValue true
    */
  var hasDots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否循环播放
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Do you want to loop?
    * @defaultValue false
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当滚动结束时调用
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Called when the momentum scroll ends ( scroll which occurs as the ScrollView glides to a stop )
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  var onMomentumScrollEnd: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any, Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 用户开始拖动滚动视图时调用
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Called when the user begins to drag the scroll view
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  var onScrollBeginDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any, Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 用户停止拖动滚动视图时调用
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Called when the user stops dragging the scroll view and it either stops or begins to glide
    * @types (event: <a target="_blank" href="https://reactnative.dev/docs/0.60/scrollview#onscroll">NativeSyntheticEvent<NativeScrollEvent></a>, state: any) => void
    * @defaultValue () => {}
    */
  var onScrollEndDrag: js.UndefOr[
    js.Function2[/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any, Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 轮播页样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the carousel page
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var pageStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前激活的索引
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description current selected index
    * @defaultValue 0
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 viewPager（安卓的实现机制）
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to use viewpager (Android implementation mechanism)
    * @defaultValue true
    */
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
    
    inline def setDots(value: ElementType[Any] | (js.Function1[/* params */ CurrentIndex, ReactNode])): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsFunction1(value: /* params */ CurrentIndex => ReactNode): Self = StObject.set(x, "dots", js.Any.fromFunction1(value))
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setHasDots(value: Boolean): Self = StObject.set(x, "hasDots", value.asInstanceOf[js.Any])
    
    inline def setHasDotsUndefined: Self = StObject.set(x, "hasDots", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any) => Unit): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction2(value))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnScrollBeginDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any) => Unit): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction2(value))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ Any) => Unit): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction2(value))
    
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
