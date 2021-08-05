package typings.swiper.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.swiper.anon.keyinSwiperEventvoid
import typings.swiper.swiperStrings.auto
import typings.swiper.swiperStrings.column
import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.coverflow
import typings.swiper.swiperStrings.cube
import typings.swiper.swiperStrings.fade
import typings.swiper.swiperStrings.flip
import typings.swiper.swiperStrings.horizontal
import typings.swiper.swiperStrings.row
import typings.swiper.swiperStrings.slide
import typings.swiper.swiperStrings.vertical
import typings.swiper.swiperStrings.wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiperOptions extends StObject {
  
  var a11y: js.UndefOr[A11yOptions | Boolean] = js.undefined
  
  var allowSlideNext: js.UndefOr[Boolean] = js.undefined
  
  var allowSlidePrev: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
    */
  var allowTouchMove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true and slider wrapper will adopt its height to the height of the currently active slide
    *
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  
  var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.undefined
  
  // Breakpoints
  var breakpoints: js.UndefOr[NumberDictionary[SwiperOptions]] = js.undefined
  
  var breakpointsInverse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used loop mode and slidesPerColumn
    */
  var centerInsufficientSlides: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, then active slide will be centered, not always on the left side.
    */
  var centeredSlides: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, then active slide will be centered without adding gaps at the beginning and end of slider.
    * Required centeredSlides: true. Not intended to be used with loop or pagination
    *
    * @default false
    */
  var centeredSlidesBounds: js.UndefOr[Boolean] = js.undefined
  
  // Namespace
  var containerModifierClass: js.UndefOr[String] = js.undefined
  
  // Components
  var controller: js.UndefOr[ControllerOptions | Boolean] = js.undefined
  
  var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.undefined
  
  // CSS Scroll Snap
  /**
    * When enabled it will use modern CSS Scroll Snap API.
    * It doesn't support all of Swiper's features, but potentially should bring a much better performance in simple configurations.
    *
    * @default false
    */
  var cssMode: js.UndefOr[Boolean] = js.undefined
  
  var cubeEffect: js.UndefOr[CubeEffectOptions] = js.undefined
  
  /**
    * Could be 'horizontal' or 'vertical' (for vertical slider).
    *
    * @default 'horizontal'
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Tranisition effect. Could be "slide", "fade", "cube", "coverflow" or "flip"
    *
    * @default 'slide'
    */
  var effect: js.UndefOr[slide | fade | cube | coverflow | flip] = js.undefined
  
  var fadeEffect: js.UndefOr[FadeEffectOptions] = js.undefined
  
  var flipEffect: js.UndefOr[FlipEffectOptions] = js.undefined
  
  /**
    * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
    */
  var followFinger: js.UndefOr[Boolean] = js.undefined
  
  // Freemode
  var freeMode: js.UndefOr[Boolean] = js.undefined
  
  var freeModeMinimumVelocity: js.UndefOr[Double] = js.undefined
  
  var freeModeMomentum: js.UndefOr[Boolean] = js.undefined
  
  var freeModeMomentumBounce: js.UndefOr[Boolean] = js.undefined
  
  var freeModeMomentumBounceRatio: js.UndefOr[Double] = js.undefined
  
  var freeModeMomentumRatio: js.UndefOr[Double] = js.undefined
  
  var freeModeMomentumVelocityRatio: js.UndefOr[Double] = js.undefined
  
  var freeModeSticky: js.UndefOr[Boolean] = js.undefined
  
  // Grab Cursor
  var grabCursor: js.UndefOr[Boolean] = js.undefined
  
  var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.undefined
  
  /**
    * Swiper height (in px). Parameter allows to force Swiper height.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var height: js.UndefOr[Double] = js.undefined
  
  var history: js.UndefOr[HistoryNavigationOptions | Boolean] = js.undefined
  
  /**
    * Enable to release Swiper events for swipe-to-go-back work in iOS UIWebView
    */
  var iOSEdgeSwipeDetection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Area (in px) from left edge of the screen to release touch events for swipe-to-go-back in iOS UIWebView
    */
  var iOSEdgeSwipeThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether Swiper should be initialised automatically when you create an instance.
    * If disabled, then you need to init it manually by calling mySwiper.init()
    *
    * @default true
    */
  var init: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Index number of initial slide.
    *
    * @default 0
    */
  var initialSlide: js.UndefOr[Double] = js.undefined
  
  var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.undefined
  
  var `lazy`: js.UndefOr[LazyOptions | Boolean] = js.undefined
  
  /**
    * Set to false if you want to disable long swipes
    */
  var longSwipes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesMs: js.UndefOr[Double] = js.undefined
  
  /**
    * Ratio to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesRatio: js.UndefOr[Double] = js.undefined
  
  // Loop
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var loopAdditionalSlides: js.UndefOr[Double] = js.undefined
  
  var loopFillGroupWithBlank: js.UndefOr[Boolean] = js.undefined
  
  var loopedSlides: js.UndefOr[Double] = js.undefined
  
  var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.undefined
  
  var navigation: js.UndefOr[NavigationOptions] = js.undefined
  
  /**
    * Set to true on  Swiper for correct touch events interception. Use only on
    * swipers that use same direction as the parent one
    *
    * @default false
    */
  var nested: js.UndefOr[Boolean] = js.undefined
  
  var noSwiping: js.UndefOr[Boolean] = js.undefined
  
  var noSwipingClass: js.UndefOr[String] = js.undefined
  
  var noSwipingSelector: js.UndefOr[String] = js.undefined
  
  /**
    * Normalize slide index.
    */
  var normalizeSlideIndex: js.UndefOr[Boolean] = js.undefined
  
  var observeParents: js.UndefOr[Boolean] = js.undefined
  
  // Observer
  /**
    * Set to true if you also need to watch Mutations for Swiper slide children elements
    *
    * @default false
    */
  var observeSlideChildren: js.UndefOr[Boolean] = js.undefined
  
  var observer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Register event handlers.
    */
  var on: js.UndefOr[keyinSwiperEventvoid] = js.undefined
  
  var pagination: js.UndefOr[PaginationOptions] = js.undefined
  
  var parallax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
    * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
    */
  var passiveListeners: js.UndefOr[Boolean] = js.undefined
  
  // Images
  var preloadImages: js.UndefOr[Boolean] = js.undefined
  
  // Clicks
  var preventClicks: js.UndefOr[Boolean] = js.undefined
  
  var preventClicksPropagation: js.UndefOr[Boolean] = js.undefined
  
  // Swiping / No swiping
  var preventInteractionOnTransition: js.UndefOr[Boolean] = js.undefined
  
  // Touch Resistance
  /**
    * Set to false if you want to disable resistant bounds
    */
  var resistance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option allows you to control resistance ratio
    */
  var resistanceRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to true to round values of slides width and height to prevent blurry texts on usual
    * resolution screens (if you have such)
    *
    * @default false
    */
  var roundLengths: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fire [Transition/SlideChange][Start/End] events on swiper initialization.
    * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
    *
    * @default true
    */
  var runCallbacksOnInit: js.UndefOr[Boolean] = js.undefined
  
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.undefined
  
  /**
    * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
    * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
    */
  var setWrapperSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to false if you want to disable short swipes
    */
  var shortSwipes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, Swiper will accept mouse events like touch events (click and drag to change slides)
    */
  var simulateTouch: js.UndefOr[Boolean] = js.undefined
  
  var slideActiveClass: js.UndefOr[String] = js.undefined
  
  var slideClass: js.UndefOr[String] = js.undefined
  
  var slideDuplicateActiveClass: js.UndefOr[String] = js.undefined
  
  var slideDuplicateClass: js.UndefOr[String] = js.undefined
  
  var slideDuplicateNextClass: js.UndefOr[String] = js.undefined
  
  var slideDuplicatePrevClass: js.UndefOr[String] = js.undefined
  
  var slideNextClass: js.UndefOr[String] = js.undefined
  
  var slidePrevClass: js.UndefOr[String] = js.undefined
  
  var slideToClickedSlide: js.UndefOr[Boolean] = js.undefined
  
  var slideVisibleClass: js.UndefOr[String] = js.undefined
  
  /**
    * Add (in px) additional slide offset in the end of the container (after all slides)
    */
  var slidesOffsetAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * Add (in px) additional slide offset in the beginning of the container (before all slides)
    */
  var slidesOffsetBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of slides per column, for multirow layout
    * slidesPerColumn > 1 is currently not compatible with loop mode (loop: true)
    */
  var slidesPerColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * Could be 'column' or 'row'. Defines how slides should fill rows, by column or by row
    */
  var slidesPerColumnFill: js.UndefOr[row | column] = js.undefined
  
  /**
    * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
    */
  var slidesPerGroup: js.UndefOr[Double] = js.undefined
  
  /**
    * The parameter works in the following way: If slidesPerGroupSkip equals 0 (default), no slides are excluded from grouping, and the resulting behaviour is the same as without this change.
    * If slidesPerGroupSkip is equal or greater than 1 the first X slides are treated as single groups, whereas all following slides are grouped by the slidesPerGroup value.
    *
    * @default 0
    */
  var slidesPerGroupSkip: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of slides per view (slides visible at the same time on slider's container).
    * If you use it with "auto" value and along with loop: true then you need to specify loopedSlides parameter with amount of slides to loop (duplicate)
    * slidesPerView: 'auto' is currently not compatible with multirow mode, when slidesPerColumn > 1
    */
  var slidesPerView: js.UndefOr[Double | auto] = js.undefined
  
  // Slides grid
  /**
    * Distance between slides in px.
    */
  var spaceBetween: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of transition between slides (in ms)
    *
    * @default 300
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  var swipeHandler: js.UndefOr[SelectableElement] = js.undefined
  
  /**
    * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
    */
  var threshold: js.UndefOr[Double] = js.undefined
  
  var thumbs: js.UndefOr[ThumbsOptions] = js.undefined
  
  /**
    * Allowable angle (in degrees) to trigger touch move
    */
  var touchAngle: js.UndefOr[Double] = js.undefined
  
  // Touches
  /**
    * Target element to listen touch events on. Can be 'container' (to listen for touch events on swiper-container) or 'wrapper'
    * (to listen for touch events on swiper-wrapper)
    */
  var touchEventsTarget: js.UndefOr[container | wrapper] = js.undefined
  
  /**
    * If enabled, then propagation of "touchmove" will be stopped
    */
  var touchMoveStopPropagation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Touch ratio
    */
  var touchRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
    */
  var touchReleaseOnEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Force to always prevent default for `touchstart` (`mousedown`) event
    */
  var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If disabled, `touchstart` (`mousedown`) event won't be prevented
    */
  var touchStartPreventDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If enabled (by default) and navigation elements' parameters passed as a string (like ".pagination")
    * then Swiper will look for such elements through child elements first.
    * Applies for pagination, prev/next buttons and scrollbar elements
    *
    * @default true
    */
  var uniqueNavElements: js.UndefOr[Boolean] = js.undefined
  
  var updateOnImagesReady: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Swiper will recalculate slides position on window resize (orientationchange)
    *
    * @default true
    */
  var updateOnWindowResize: js.UndefOr[Boolean] = js.undefined
  
  var virtual: js.UndefOr[VirtualOptions | Boolean] = js.undefined
  
  /**
    * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
    * Useful when you may need to create custom slide transition
    */
  var virtualTranslate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled Swiper will be disabled and hide navigation buttons on
    * case there are not enough slides for sliding.
    *
    * @default false
    */
  var watchOverflow: js.UndefOr[Boolean] = js.undefined
  
  // Progress
  var watchSlidesProgress: js.UndefOr[Boolean] = js.undefined
  
  var watchSlidesVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Swiper width (in px). Parameter allows to force Swiper width.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var width: js.UndefOr[Double] = js.undefined
  
  var wrapperClass: js.UndefOr[String] = js.undefined
  
  var zoom: js.UndefOr[ZoomOptions | Boolean] = js.undefined
}
object SwiperOptions {
  
  inline def apply(): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwiperOptions]
  }
  
  extension [Self <: SwiperOptions](x: Self) {
    
    inline def setA11y(value: A11yOptions | Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
    
    inline def setAllowSlideNext(value: Boolean): Self = StObject.set(x, "allowSlideNext", value.asInstanceOf[js.Any])
    
    inline def setAllowSlideNextUndefined: Self = StObject.set(x, "allowSlideNext", js.undefined)
    
    inline def setAllowSlidePrev(value: Boolean): Self = StObject.set(x, "allowSlidePrev", value.asInstanceOf[js.Any])
    
    inline def setAllowSlidePrevUndefined: Self = StObject.set(x, "allowSlidePrev", js.undefined)
    
    inline def setAllowTouchMove(value: Boolean): Self = StObject.set(x, "allowTouchMove", value.asInstanceOf[js.Any])
    
    inline def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    inline def setAutoplay(value: AutoplayOptions | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setBreakpoints(value: NumberDictionary[SwiperOptions]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsInverse(value: Boolean): Self = StObject.set(x, "breakpointsInverse", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsInverseUndefined: Self = StObject.set(x, "breakpointsInverse", js.undefined)
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setCenterInsufficientSlides(value: Boolean): Self = StObject.set(x, "centerInsufficientSlides", value.asInstanceOf[js.Any])
    
    inline def setCenterInsufficientSlidesUndefined: Self = StObject.set(x, "centerInsufficientSlides", js.undefined)
    
    inline def setCenteredSlides(value: Boolean): Self = StObject.set(x, "centeredSlides", value.asInstanceOf[js.Any])
    
    inline def setCenteredSlidesBounds(value: Boolean): Self = StObject.set(x, "centeredSlidesBounds", value.asInstanceOf[js.Any])
    
    inline def setCenteredSlidesBoundsUndefined: Self = StObject.set(x, "centeredSlidesBounds", js.undefined)
    
    inline def setCenteredSlidesUndefined: Self = StObject.set(x, "centeredSlides", js.undefined)
    
    inline def setContainerModifierClass(value: String): Self = StObject.set(x, "containerModifierClass", value.asInstanceOf[js.Any])
    
    inline def setContainerModifierClassUndefined: Self = StObject.set(x, "containerModifierClass", js.undefined)
    
    inline def setController(value: ControllerOptions | Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setCoverflowEffect(value: CoverflowEffectOptions): Self = StObject.set(x, "coverflowEffect", value.asInstanceOf[js.Any])
    
    inline def setCoverflowEffectUndefined: Self = StObject.set(x, "coverflowEffect", js.undefined)
    
    inline def setCssMode(value: Boolean): Self = StObject.set(x, "cssMode", value.asInstanceOf[js.Any])
    
    inline def setCssModeUndefined: Self = StObject.set(x, "cssMode", js.undefined)
    
    inline def setCubeEffect(value: CubeEffectOptions): Self = StObject.set(x, "cubeEffect", value.asInstanceOf[js.Any])
    
    inline def setCubeEffectUndefined: Self = StObject.set(x, "cubeEffect", js.undefined)
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEffect(value: slide | fade | cube | coverflow | flip): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setFadeEffect(value: FadeEffectOptions): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
    
    inline def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
    
    inline def setFlipEffect(value: FlipEffectOptions): Self = StObject.set(x, "flipEffect", value.asInstanceOf[js.Any])
    
    inline def setFlipEffectUndefined: Self = StObject.set(x, "flipEffect", js.undefined)
    
    inline def setFollowFinger(value: Boolean): Self = StObject.set(x, "followFinger", value.asInstanceOf[js.Any])
    
    inline def setFollowFingerUndefined: Self = StObject.set(x, "followFinger", js.undefined)
    
    inline def setFreeMode(value: Boolean): Self = StObject.set(x, "freeMode", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMinimumVelocity(value: Double): Self = StObject.set(x, "freeModeMinimumVelocity", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMinimumVelocityUndefined: Self = StObject.set(x, "freeModeMinimumVelocity", js.undefined)
    
    inline def setFreeModeMomentum(value: Boolean): Self = StObject.set(x, "freeModeMomentum", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMomentumBounce(value: Boolean): Self = StObject.set(x, "freeModeMomentumBounce", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMomentumBounceRatio(value: Double): Self = StObject.set(x, "freeModeMomentumBounceRatio", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMomentumBounceRatioUndefined: Self = StObject.set(x, "freeModeMomentumBounceRatio", js.undefined)
    
    inline def setFreeModeMomentumBounceUndefined: Self = StObject.set(x, "freeModeMomentumBounce", js.undefined)
    
    inline def setFreeModeMomentumRatio(value: Double): Self = StObject.set(x, "freeModeMomentumRatio", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMomentumRatioUndefined: Self = StObject.set(x, "freeModeMomentumRatio", js.undefined)
    
    inline def setFreeModeMomentumUndefined: Self = StObject.set(x, "freeModeMomentum", js.undefined)
    
    inline def setFreeModeMomentumVelocityRatio(value: Double): Self = StObject.set(x, "freeModeMomentumVelocityRatio", value.asInstanceOf[js.Any])
    
    inline def setFreeModeMomentumVelocityRatioUndefined: Self = StObject.set(x, "freeModeMomentumVelocityRatio", js.undefined)
    
    inline def setFreeModeSticky(value: Boolean): Self = StObject.set(x, "freeModeSticky", value.asInstanceOf[js.Any])
    
    inline def setFreeModeStickyUndefined: Self = StObject.set(x, "freeModeSticky", js.undefined)
    
    inline def setFreeModeUndefined: Self = StObject.set(x, "freeMode", js.undefined)
    
    inline def setGrabCursor(value: Boolean): Self = StObject.set(x, "grabCursor", value.asInstanceOf[js.Any])
    
    inline def setGrabCursorUndefined: Self = StObject.set(x, "grabCursor", js.undefined)
    
    inline def setHashNavigation(value: HashNavigationOptions | Boolean): Self = StObject.set(x, "hashNavigation", value.asInstanceOf[js.Any])
    
    inline def setHashNavigationUndefined: Self = StObject.set(x, "hashNavigation", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHistory(value: HistoryNavigationOptions | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIOSEdgeSwipeDetection(value: Boolean): Self = StObject.set(x, "iOSEdgeSwipeDetection", value.asInstanceOf[js.Any])
    
    inline def setIOSEdgeSwipeDetectionUndefined: Self = StObject.set(x, "iOSEdgeSwipeDetection", js.undefined)
    
    inline def setIOSEdgeSwipeThreshold(value: Double): Self = StObject.set(x, "iOSEdgeSwipeThreshold", value.asInstanceOf[js.Any])
    
    inline def setIOSEdgeSwipeThresholdUndefined: Self = StObject.set(x, "iOSEdgeSwipeThreshold", js.undefined)
    
    inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
    
    inline def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
    
    inline def setKeyboard(value: KeyboardOptions | Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLazy(value: LazyOptions | Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setLongSwipes(value: Boolean): Self = StObject.set(x, "longSwipes", value.asInstanceOf[js.Any])
    
    inline def setLongSwipesMs(value: Double): Self = StObject.set(x, "longSwipesMs", value.asInstanceOf[js.Any])
    
    inline def setLongSwipesMsUndefined: Self = StObject.set(x, "longSwipesMs", js.undefined)
    
    inline def setLongSwipesRatio(value: Double): Self = StObject.set(x, "longSwipesRatio", value.asInstanceOf[js.Any])
    
    inline def setLongSwipesRatioUndefined: Self = StObject.set(x, "longSwipesRatio", js.undefined)
    
    inline def setLongSwipesUndefined: Self = StObject.set(x, "longSwipes", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopAdditionalSlides(value: Double): Self = StObject.set(x, "loopAdditionalSlides", value.asInstanceOf[js.Any])
    
    inline def setLoopAdditionalSlidesUndefined: Self = StObject.set(x, "loopAdditionalSlides", js.undefined)
    
    inline def setLoopFillGroupWithBlank(value: Boolean): Self = StObject.set(x, "loopFillGroupWithBlank", value.asInstanceOf[js.Any])
    
    inline def setLoopFillGroupWithBlankUndefined: Self = StObject.set(x, "loopFillGroupWithBlank", js.undefined)
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setLoopedSlides(value: Double): Self = StObject.set(x, "loopedSlides", value.asInstanceOf[js.Any])
    
    inline def setLoopedSlidesUndefined: Self = StObject.set(x, "loopedSlides", js.undefined)
    
    inline def setMousewheel(value: MousewheelOptions | Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setNavigation(value: NavigationOptions): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setNoSwiping(value: Boolean): Self = StObject.set(x, "noSwiping", value.asInstanceOf[js.Any])
    
    inline def setNoSwipingClass(value: String): Self = StObject.set(x, "noSwipingClass", value.asInstanceOf[js.Any])
    
    inline def setNoSwipingClassUndefined: Self = StObject.set(x, "noSwipingClass", js.undefined)
    
    inline def setNoSwipingSelector(value: String): Self = StObject.set(x, "noSwipingSelector", value.asInstanceOf[js.Any])
    
    inline def setNoSwipingSelectorUndefined: Self = StObject.set(x, "noSwipingSelector", js.undefined)
    
    inline def setNoSwipingUndefined: Self = StObject.set(x, "noSwiping", js.undefined)
    
    inline def setNormalizeSlideIndex(value: Boolean): Self = StObject.set(x, "normalizeSlideIndex", value.asInstanceOf[js.Any])
    
    inline def setNormalizeSlideIndexUndefined: Self = StObject.set(x, "normalizeSlideIndex", js.undefined)
    
    inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
    
    inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
    
    inline def setObserveSlideChildren(value: Boolean): Self = StObject.set(x, "observeSlideChildren", value.asInstanceOf[js.Any])
    
    inline def setObserveSlideChildrenUndefined: Self = StObject.set(x, "observeSlideChildren", js.undefined)
    
    inline def setObserver(value: Boolean): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    inline def setOn(value: keyinSwiperEventvoid): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPagination(value: PaginationOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setParallax(value: Boolean): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
    
    inline def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
    
    inline def setPassiveListeners(value: Boolean): Self = StObject.set(x, "passiveListeners", value.asInstanceOf[js.Any])
    
    inline def setPassiveListenersUndefined: Self = StObject.set(x, "passiveListeners", js.undefined)
    
    inline def setPreloadImages(value: Boolean): Self = StObject.set(x, "preloadImages", value.asInstanceOf[js.Any])
    
    inline def setPreloadImagesUndefined: Self = StObject.set(x, "preloadImages", js.undefined)
    
    inline def setPreventClicks(value: Boolean): Self = StObject.set(x, "preventClicks", value.asInstanceOf[js.Any])
    
    inline def setPreventClicksPropagation(value: Boolean): Self = StObject.set(x, "preventClicksPropagation", value.asInstanceOf[js.Any])
    
    inline def setPreventClicksPropagationUndefined: Self = StObject.set(x, "preventClicksPropagation", js.undefined)
    
    inline def setPreventClicksUndefined: Self = StObject.set(x, "preventClicks", js.undefined)
    
    inline def setPreventInteractionOnTransition(value: Boolean): Self = StObject.set(x, "preventInteractionOnTransition", value.asInstanceOf[js.Any])
    
    inline def setPreventInteractionOnTransitionUndefined: Self = StObject.set(x, "preventInteractionOnTransition", js.undefined)
    
    inline def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
    
    inline def setResistanceRatio(value: Double): Self = StObject.set(x, "resistanceRatio", value.asInstanceOf[js.Any])
    
    inline def setResistanceRatioUndefined: Self = StObject.set(x, "resistanceRatio", js.undefined)
    
    inline def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
    
    inline def setRoundLengths(value: Boolean): Self = StObject.set(x, "roundLengths", value.asInstanceOf[js.Any])
    
    inline def setRoundLengthsUndefined: Self = StObject.set(x, "roundLengths", js.undefined)
    
    inline def setRunCallbacksOnInit(value: Boolean): Self = StObject.set(x, "runCallbacksOnInit", value.asInstanceOf[js.Any])
    
    inline def setRunCallbacksOnInitUndefined: Self = StObject.set(x, "runCallbacksOnInit", js.undefined)
    
    inline def setScrollbar(value: ScrollbarOptions): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setSetWrapperSize(value: Boolean): Self = StObject.set(x, "setWrapperSize", value.asInstanceOf[js.Any])
    
    inline def setSetWrapperSizeUndefined: Self = StObject.set(x, "setWrapperSize", js.undefined)
    
    inline def setShortSwipes(value: Boolean): Self = StObject.set(x, "shortSwipes", value.asInstanceOf[js.Any])
    
    inline def setShortSwipesUndefined: Self = StObject.set(x, "shortSwipes", js.undefined)
    
    inline def setSimulateTouch(value: Boolean): Self = StObject.set(x, "simulateTouch", value.asInstanceOf[js.Any])
    
    inline def setSimulateTouchUndefined: Self = StObject.set(x, "simulateTouch", js.undefined)
    
    inline def setSlideActiveClass(value: String): Self = StObject.set(x, "slideActiveClass", value.asInstanceOf[js.Any])
    
    inline def setSlideActiveClassUndefined: Self = StObject.set(x, "slideActiveClass", js.undefined)
    
    inline def setSlideClass(value: String): Self = StObject.set(x, "slideClass", value.asInstanceOf[js.Any])
    
    inline def setSlideClassUndefined: Self = StObject.set(x, "slideClass", js.undefined)
    
    inline def setSlideDuplicateActiveClass(value: String): Self = StObject.set(x, "slideDuplicateActiveClass", value.asInstanceOf[js.Any])
    
    inline def setSlideDuplicateActiveClassUndefined: Self = StObject.set(x, "slideDuplicateActiveClass", js.undefined)
    
    inline def setSlideDuplicateClass(value: String): Self = StObject.set(x, "slideDuplicateClass", value.asInstanceOf[js.Any])
    
    inline def setSlideDuplicateClassUndefined: Self = StObject.set(x, "slideDuplicateClass", js.undefined)
    
    inline def setSlideDuplicateNextClass(value: String): Self = StObject.set(x, "slideDuplicateNextClass", value.asInstanceOf[js.Any])
    
    inline def setSlideDuplicateNextClassUndefined: Self = StObject.set(x, "slideDuplicateNextClass", js.undefined)
    
    inline def setSlideDuplicatePrevClass(value: String): Self = StObject.set(x, "slideDuplicatePrevClass", value.asInstanceOf[js.Any])
    
    inline def setSlideDuplicatePrevClassUndefined: Self = StObject.set(x, "slideDuplicatePrevClass", js.undefined)
    
    inline def setSlideNextClass(value: String): Self = StObject.set(x, "slideNextClass", value.asInstanceOf[js.Any])
    
    inline def setSlideNextClassUndefined: Self = StObject.set(x, "slideNextClass", js.undefined)
    
    inline def setSlidePrevClass(value: String): Self = StObject.set(x, "slidePrevClass", value.asInstanceOf[js.Any])
    
    inline def setSlidePrevClassUndefined: Self = StObject.set(x, "slidePrevClass", js.undefined)
    
    inline def setSlideToClickedSlide(value: Boolean): Self = StObject.set(x, "slideToClickedSlide", value.asInstanceOf[js.Any])
    
    inline def setSlideToClickedSlideUndefined: Self = StObject.set(x, "slideToClickedSlide", js.undefined)
    
    inline def setSlideVisibleClass(value: String): Self = StObject.set(x, "slideVisibleClass", value.asInstanceOf[js.Any])
    
    inline def setSlideVisibleClassUndefined: Self = StObject.set(x, "slideVisibleClass", js.undefined)
    
    inline def setSlidesOffsetAfter(value: Double): Self = StObject.set(x, "slidesOffsetAfter", value.asInstanceOf[js.Any])
    
    inline def setSlidesOffsetAfterUndefined: Self = StObject.set(x, "slidesOffsetAfter", js.undefined)
    
    inline def setSlidesOffsetBefore(value: Double): Self = StObject.set(x, "slidesOffsetBefore", value.asInstanceOf[js.Any])
    
    inline def setSlidesOffsetBeforeUndefined: Self = StObject.set(x, "slidesOffsetBefore", js.undefined)
    
    inline def setSlidesPerColumn(value: Double): Self = StObject.set(x, "slidesPerColumn", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerColumnFill(value: row | column): Self = StObject.set(x, "slidesPerColumnFill", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerColumnFillUndefined: Self = StObject.set(x, "slidesPerColumnFill", js.undefined)
    
    inline def setSlidesPerColumnUndefined: Self = StObject.set(x, "slidesPerColumn", js.undefined)
    
    inline def setSlidesPerGroup(value: Double): Self = StObject.set(x, "slidesPerGroup", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerGroupSkip(value: Double): Self = StObject.set(x, "slidesPerGroupSkip", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerGroupSkipUndefined: Self = StObject.set(x, "slidesPerGroupSkip", js.undefined)
    
    inline def setSlidesPerGroupUndefined: Self = StObject.set(x, "slidesPerGroup", js.undefined)
    
    inline def setSlidesPerView(value: Double | auto): Self = StObject.set(x, "slidesPerView", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerViewUndefined: Self = StObject.set(x, "slidesPerView", js.undefined)
    
    inline def setSpaceBetween(value: Double): Self = StObject.set(x, "spaceBetween", value.asInstanceOf[js.Any])
    
    inline def setSpaceBetweenUndefined: Self = StObject.set(x, "spaceBetween", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setSwipeHandler(value: SelectableElement): Self = StObject.set(x, "swipeHandler", value.asInstanceOf[js.Any])
    
    inline def setSwipeHandlerUndefined: Self = StObject.set(x, "swipeHandler", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setThumbs(value: ThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
    
    inline def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
    
    inline def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
    
    inline def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
    
    inline def setTouchEventsTarget(value: container | wrapper): Self = StObject.set(x, "touchEventsTarget", value.asInstanceOf[js.Any])
    
    inline def setTouchEventsTargetUndefined: Self = StObject.set(x, "touchEventsTarget", js.undefined)
    
    inline def setTouchMoveStopPropagation(value: Boolean): Self = StObject.set(x, "touchMoveStopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTouchMoveStopPropagationUndefined: Self = StObject.set(x, "touchMoveStopPropagation", js.undefined)
    
    inline def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
    
    inline def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
    
    inline def setTouchReleaseOnEdges(value: Boolean): Self = StObject.set(x, "touchReleaseOnEdges", value.asInstanceOf[js.Any])
    
    inline def setTouchReleaseOnEdgesUndefined: Self = StObject.set(x, "touchReleaseOnEdges", js.undefined)
    
    inline def setTouchStartForcePreventDefault(value: Boolean): Self = StObject.set(x, "touchStartForcePreventDefault", value.asInstanceOf[js.Any])
    
    inline def setTouchStartForcePreventDefaultUndefined: Self = StObject.set(x, "touchStartForcePreventDefault", js.undefined)
    
    inline def setTouchStartPreventDefault(value: Boolean): Self = StObject.set(x, "touchStartPreventDefault", value.asInstanceOf[js.Any])
    
    inline def setTouchStartPreventDefaultUndefined: Self = StObject.set(x, "touchStartPreventDefault", js.undefined)
    
    inline def setUniqueNavElements(value: Boolean): Self = StObject.set(x, "uniqueNavElements", value.asInstanceOf[js.Any])
    
    inline def setUniqueNavElementsUndefined: Self = StObject.set(x, "uniqueNavElements", js.undefined)
    
    inline def setUpdateOnImagesReady(value: Boolean): Self = StObject.set(x, "updateOnImagesReady", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnImagesReadyUndefined: Self = StObject.set(x, "updateOnImagesReady", js.undefined)
    
    inline def setUpdateOnWindowResize(value: Boolean): Self = StObject.set(x, "updateOnWindowResize", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnWindowResizeUndefined: Self = StObject.set(x, "updateOnWindowResize", js.undefined)
    
    inline def setVirtual(value: VirtualOptions | Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualTranslate(value: Boolean): Self = StObject.set(x, "virtualTranslate", value.asInstanceOf[js.Any])
    
    inline def setVirtualTranslateUndefined: Self = StObject.set(x, "virtualTranslate", js.undefined)
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    
    inline def setWatchOverflow(value: Boolean): Self = StObject.set(x, "watchOverflow", value.asInstanceOf[js.Any])
    
    inline def setWatchOverflowUndefined: Self = StObject.set(x, "watchOverflow", js.undefined)
    
    inline def setWatchSlidesProgress(value: Boolean): Self = StObject.set(x, "watchSlidesProgress", value.asInstanceOf[js.Any])
    
    inline def setWatchSlidesProgressUndefined: Self = StObject.set(x, "watchSlidesProgress", js.undefined)
    
    inline def setWatchSlidesVisibility(value: Boolean): Self = StObject.set(x, "watchSlidesVisibility", value.asInstanceOf[js.Any])
    
    inline def setWatchSlidesVisibilityUndefined: Self = StObject.set(x, "watchSlidesVisibility", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
    
    inline def setZoom(value: ZoomOptions | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
