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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwiperOptions extends StObject {
  
  var a11y: js.UndefOr[A11yOptions | Boolean] = js.native
  
  var allowSlideNext: js.UndefOr[Boolean] = js.native
  
  var allowSlidePrev: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
    */
  var allowTouchMove: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true and slider wrapper will adopt its height to the height of the currently active slide
    *
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.native
  
  // Breakpoints
  var breakpoints: js.UndefOr[NumberDictionary[SwiperOptions]] = js.native
  
  var breakpointsInverse: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used loop mode and slidesPerColumn
    */
  var centerInsufficientSlides: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then active slide will be centered, not always on the left side.
    */
  var centeredSlides: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then active slide will be centered without adding gaps at the beginning and end of slider.
    * Required centeredSlides: true. Not intended to be used with loop or pagination
    *
    * @default false
    */
  var centeredSlidesBounds: js.UndefOr[Boolean] = js.native
  
  // Namespace
  var containerModifierClass: js.UndefOr[String] = js.native
  
  // Components
  var controller: js.UndefOr[ControllerOptions | Boolean] = js.native
  
  var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.native
  
  // CSS Scroll Snap
  /**
    * When enabled it will use modern CSS Scroll Snap API.
    * It doesn't support all of Swiper's features, but potentially should bring a much better performance in simple configurations.
    *
    * @default false
    */
  var cssMode: js.UndefOr[Boolean] = js.native
  
  var cubeEffect: js.UndefOr[CubeEffectOptions] = js.native
  
  /**
    * Could be 'horizontal' or 'vertical' (for vertical slider).
    *
    * @default 'horizontal'
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Tranisition effect. Could be "slide", "fade", "cube", "coverflow" or "flip"
    *
    * @default 'slide'
    */
  var effect: js.UndefOr[slide | fade | cube | coverflow | flip] = js.native
  
  var fadeEffect: js.UndefOr[FadeEffectOptions] = js.native
  
  var flipEffect: js.UndefOr[FlipEffectOptions] = js.native
  
  /**
    * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
    */
  var followFinger: js.UndefOr[Boolean] = js.native
  
  // Freemode
  var freeMode: js.UndefOr[Boolean] = js.native
  
  var freeModeMinimumVelocity: js.UndefOr[Double] = js.native
  
  var freeModeMomentum: js.UndefOr[Boolean] = js.native
  
  var freeModeMomentumBounce: js.UndefOr[Boolean] = js.native
  
  var freeModeMomentumBounceRatio: js.UndefOr[Double] = js.native
  
  var freeModeMomentumRatio: js.UndefOr[Double] = js.native
  
  var freeModeMomentumVelocityRatio: js.UndefOr[Double] = js.native
  
  var freeModeSticky: js.UndefOr[Boolean] = js.native
  
  // Grab Cursor
  var grabCursor: js.UndefOr[Boolean] = js.native
  
  var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.native
  
  /**
    * Swiper height (in px). Parameter allows to force Swiper height.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var height: js.UndefOr[Double] = js.native
  
  var history: js.UndefOr[HistoryNavigationOptions | Boolean] = js.native
  
  /**
    * Enable to release Swiper events for swipe-to-go-back work in iOS UIWebView
    */
  var iOSEdgeSwipeDetection: js.UndefOr[Boolean] = js.native
  
  /**
    * Area (in px) from left edge of the screen to release touch events for swipe-to-go-back in iOS UIWebView
    */
  var iOSEdgeSwipeThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Whether Swiper should be initialised automatically when you create an instance.
    * If disabled, then you need to init it manually by calling mySwiper.init()
    *
    * @default true
    */
  var init: js.UndefOr[Boolean] = js.native
  
  /**
    * Index number of initial slide.
    *
    * @default 0
    */
  var initialSlide: js.UndefOr[Double] = js.native
  
  var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.native
  
  var `lazy`: js.UndefOr[LazyOptions | Boolean] = js.native
  
  /**
    * Set to false if you want to disable long swipes
    */
  var longSwipes: js.UndefOr[Boolean] = js.native
  
  /**
    * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesMs: js.UndefOr[Double] = js.native
  
  /**
    * Ratio to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesRatio: js.UndefOr[Double] = js.native
  
  // Loop
  var loop: js.UndefOr[Boolean] = js.native
  
  var loopAdditionalSlides: js.UndefOr[Double] = js.native
  
  var loopFillGroupWithBlank: js.UndefOr[Boolean] = js.native
  
  var loopedSlides: js.UndefOr[Double] = js.native
  
  var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.native
  
  var navigation: js.UndefOr[NavigationOptions] = js.native
  
  /**
    * Set to true on  Swiper for correct touch events interception. Use only on
    * swipers that use same direction as the parent one
    *
    * @default false
    */
  var nested: js.UndefOr[Boolean] = js.native
  
  var noSwiping: js.UndefOr[Boolean] = js.native
  
  var noSwipingClass: js.UndefOr[String] = js.native
  
  var noSwipingSelector: js.UndefOr[String] = js.native
  
  /**
    * Normalize slide index.
    */
  var normalizeSlideIndex: js.UndefOr[Boolean] = js.native
  
  var observeParents: js.UndefOr[Boolean] = js.native
  
  // Observer
  /**
    * Set to true if you also need to watch Mutations for Swiper slide children elements
    *
    * @default false
    */
  var observeSlideChildren: js.UndefOr[Boolean] = js.native
  
  var observer: js.UndefOr[Boolean] = js.native
  
  /**
    * Register event handlers.
    */
  var on: js.UndefOr[keyinSwiperEventvoid] = js.native
  
  var pagination: js.UndefOr[PaginationOptions] = js.native
  
  var parallax: js.UndefOr[Boolean] = js.native
  
  /**
    * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
    * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
    */
  var passiveListeners: js.UndefOr[Boolean] = js.native
  
  // Images
  var preloadImages: js.UndefOr[Boolean] = js.native
  
  // Clicks
  var preventClicks: js.UndefOr[Boolean] = js.native
  
  var preventClicksPropagation: js.UndefOr[Boolean] = js.native
  
  // Swiping / No swiping
  var preventInteractionOnTransition: js.UndefOr[Boolean] = js.native
  
  // Touch Resistance
  /**
    * Set to false if you want to disable resistant bounds
    */
  var resistance: js.UndefOr[Boolean] = js.native
  
  /**
    * This option allows you to control resistance ratio
    */
  var resistanceRatio: js.UndefOr[Double] = js.native
  
  /**
    * Set to true to round values of slides width and height to prevent blurry texts on usual
    * resolution screens (if you have such)
    *
    * @default false
    */
  var roundLengths: js.UndefOr[Boolean] = js.native
  
  /**
    * Fire [Transition/SlideChange][Start/End] events on swiper initialization.
    * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
    *
    * @default true
    */
  var runCallbacksOnInit: js.UndefOr[Boolean] = js.native
  
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.native
  
  /**
    * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
    * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
    */
  var setWrapperSize: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to false if you want to disable short swipes
    */
  var shortSwipes: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, Swiper will accept mouse events like touch events (click and drag to change slides)
    */
  var simulateTouch: js.UndefOr[Boolean] = js.native
  
  var slideActiveClass: js.UndefOr[String] = js.native
  
  var slideClass: js.UndefOr[String] = js.native
  
  var slideDuplicateActiveClass: js.UndefOr[String] = js.native
  
  var slideDuplicateClass: js.UndefOr[String] = js.native
  
  var slideDuplicateNextClass: js.UndefOr[String] = js.native
  
  var slideDuplicatePrevClass: js.UndefOr[String] = js.native
  
  var slideNextClass: js.UndefOr[String] = js.native
  
  var slidePrevClass: js.UndefOr[String] = js.native
  
  var slideToClickedSlide: js.UndefOr[Boolean] = js.native
  
  var slideVisibleClass: js.UndefOr[String] = js.native
  
  /**
    * Add (in px) additional slide offset in the end of the container (after all slides)
    */
  var slidesOffsetAfter: js.UndefOr[Double] = js.native
  
  /**
    * Add (in px) additional slide offset in the beginning of the container (before all slides)
    */
  var slidesOffsetBefore: js.UndefOr[Double] = js.native
  
  /**
    * Number of slides per column, for multirow layout
    * slidesPerColumn > 1 is currently not compatible with loop mode (loop: true)
    */
  var slidesPerColumn: js.UndefOr[Double] = js.native
  
  /**
    * Could be 'column' or 'row'. Defines how slides should fill rows, by column or by row
    */
  var slidesPerColumnFill: js.UndefOr[row | column] = js.native
  
  /**
    * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
    */
  var slidesPerGroup: js.UndefOr[Double] = js.native
  
  /**
    * The parameter works in the following way: If slidesPerGroupSkip equals 0 (default), no slides are excluded from grouping, and the resulting behaviour is the same as without this change.
    * If slidesPerGroupSkip is equal or greater than 1 the first X slides are treated as single groups, whereas all following slides are grouped by the slidesPerGroup value.
    *
    * @default 0
    */
  var slidesPerGroupSkip: js.UndefOr[Double] = js.native
  
  /**
    * Number of slides per view (slides visible at the same time on slider's container).
    * If you use it with "auto" value and along with loop: true then you need to specify loopedSlides parameter with amount of slides to loop (duplicate)
    * slidesPerView: 'auto' is currently not compatible with multirow mode, when slidesPerColumn > 1
    */
  var slidesPerView: js.UndefOr[Double | auto] = js.native
  
  // Slides grid
  /**
    * Distance between slides in px.
    */
  var spaceBetween: js.UndefOr[Double] = js.native
  
  /**
    * Duration of transition between slides (in ms)
    *
    * @default 300
    */
  var speed: js.UndefOr[Double] = js.native
  
  var swipeHandler: js.UndefOr[SelectableElement] = js.native
  
  /**
    * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
    */
  var threshold: js.UndefOr[Double] = js.native
  
  var thumbs: js.UndefOr[ThumbsOptions] = js.native
  
  /**
    * Allowable angle (in degrees) to trigger touch move
    */
  var touchAngle: js.UndefOr[Double] = js.native
  
  // Touches
  /**
    * Target element to listen touch events on. Can be 'container' (to listen for touch events on swiper-container) or 'wrapper'
    * (to listen for touch events on swiper-wrapper)
    */
  var touchEventsTarget: js.UndefOr[container | wrapper] = js.native
  
  /**
    * If enabled, then propagation of "touchmove" will be stopped
    */
  var touchMoveStopPropagation: js.UndefOr[Boolean] = js.native
  
  /**
    * Touch ratio
    */
  var touchRatio: js.UndefOr[Double] = js.native
  
  /**
    * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
    */
  var touchReleaseOnEdges: js.UndefOr[Boolean] = js.native
  
  /**
    * Force to always prevent default for `touchstart` (`mousedown`) event
    */
  var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * If disabled, `touchstart` (`mousedown`) event won't be prevented
    */
  var touchStartPreventDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled (by default) and navigation elements' parameters passed as a string (like ".pagination")
    * then Swiper will look for such elements through child elements first.
    * Applies for pagination, prev/next buttons and scrollbar elements
    *
    * @default true
    */
  var uniqueNavElements: js.UndefOr[Boolean] = js.native
  
  var updateOnImagesReady: js.UndefOr[Boolean] = js.native
  
  /**
    * Swiper will recalculate slides position on window resize (orientationchange)
    *
    * @default true
    */
  var updateOnWindowResize: js.UndefOr[Boolean] = js.native
  
  var virtual: js.UndefOr[VirtualOptions | Boolean] = js.native
  
  /**
    * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
    * Useful when you may need to create custom slide transition
    */
  var virtualTranslate: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled Swiper will be disabled and hide navigation buttons on
    * case there are not enough slides for sliding.
    *
    * @default false
    */
  var watchOverflow: js.UndefOr[Boolean] = js.native
  
  // Progress
  var watchSlidesProgress: js.UndefOr[Boolean] = js.native
  
  var watchSlidesVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Swiper width (in px). Parameter allows to force Swiper width.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var width: js.UndefOr[Double] = js.native
  
  var wrapperClass: js.UndefOr[String] = js.native
  
  var zoom: js.UndefOr[ZoomOptions | Boolean] = js.native
}
object SwiperOptions {
  
  @scala.inline
  def apply(): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwiperOptions]
  }
  
  @scala.inline
  implicit class SwiperOptionsMutableBuilder[Self <: SwiperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA11y(value: A11yOptions | Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
    
    @scala.inline
    def setAllowSlideNext(value: Boolean): Self = StObject.set(x, "allowSlideNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSlideNextUndefined: Self = StObject.set(x, "allowSlideNext", js.undefined)
    
    @scala.inline
    def setAllowSlidePrev(value: Boolean): Self = StObject.set(x, "allowSlidePrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSlidePrevUndefined: Self = StObject.set(x, "allowSlidePrev", js.undefined)
    
    @scala.inline
    def setAllowTouchMove(value: Boolean): Self = StObject.set(x, "allowTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setAutoplay(value: AutoplayOptions | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: NumberDictionary[SwiperOptions]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsInverse(value: Boolean): Self = StObject.set(x, "breakpointsInverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsInverseUndefined: Self = StObject.set(x, "breakpointsInverse", js.undefined)
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setCenterInsufficientSlides(value: Boolean): Self = StObject.set(x, "centerInsufficientSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterInsufficientSlidesUndefined: Self = StObject.set(x, "centerInsufficientSlides", js.undefined)
    
    @scala.inline
    def setCenteredSlides(value: Boolean): Self = StObject.set(x, "centeredSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenteredSlidesBounds(value: Boolean): Self = StObject.set(x, "centeredSlidesBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenteredSlidesBoundsUndefined: Self = StObject.set(x, "centeredSlidesBounds", js.undefined)
    
    @scala.inline
    def setCenteredSlidesUndefined: Self = StObject.set(x, "centeredSlides", js.undefined)
    
    @scala.inline
    def setContainerModifierClass(value: String): Self = StObject.set(x, "containerModifierClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerModifierClassUndefined: Self = StObject.set(x, "containerModifierClass", js.undefined)
    
    @scala.inline
    def setController(value: ControllerOptions | Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setCoverflowEffect(value: CoverflowEffectOptions): Self = StObject.set(x, "coverflowEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverflowEffectUndefined: Self = StObject.set(x, "coverflowEffect", js.undefined)
    
    @scala.inline
    def setCssMode(value: Boolean): Self = StObject.set(x, "cssMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssModeUndefined: Self = StObject.set(x, "cssMode", js.undefined)
    
    @scala.inline
    def setCubeEffect(value: CubeEffectOptions): Self = StObject.set(x, "cubeEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeEffectUndefined: Self = StObject.set(x, "cubeEffect", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEffect(value: slide | fade | cube | coverflow | flip): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setFadeEffect(value: FadeEffectOptions): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
    
    @scala.inline
    def setFlipEffect(value: FlipEffectOptions): Self = StObject.set(x, "flipEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipEffectUndefined: Self = StObject.set(x, "flipEffect", js.undefined)
    
    @scala.inline
    def setFollowFinger(value: Boolean): Self = StObject.set(x, "followFinger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowFingerUndefined: Self = StObject.set(x, "followFinger", js.undefined)
    
    @scala.inline
    def setFreeMode(value: Boolean): Self = StObject.set(x, "freeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMinimumVelocity(value: Double): Self = StObject.set(x, "freeModeMinimumVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMinimumVelocityUndefined: Self = StObject.set(x, "freeModeMinimumVelocity", js.undefined)
    
    @scala.inline
    def setFreeModeMomentum(value: Boolean): Self = StObject.set(x, "freeModeMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMomentumBounce(value: Boolean): Self = StObject.set(x, "freeModeMomentumBounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMomentumBounceRatio(value: Double): Self = StObject.set(x, "freeModeMomentumBounceRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMomentumBounceRatioUndefined: Self = StObject.set(x, "freeModeMomentumBounceRatio", js.undefined)
    
    @scala.inline
    def setFreeModeMomentumBounceUndefined: Self = StObject.set(x, "freeModeMomentumBounce", js.undefined)
    
    @scala.inline
    def setFreeModeMomentumRatio(value: Double): Self = StObject.set(x, "freeModeMomentumRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMomentumRatioUndefined: Self = StObject.set(x, "freeModeMomentumRatio", js.undefined)
    
    @scala.inline
    def setFreeModeMomentumUndefined: Self = StObject.set(x, "freeModeMomentum", js.undefined)
    
    @scala.inline
    def setFreeModeMomentumVelocityRatio(value: Double): Self = StObject.set(x, "freeModeMomentumVelocityRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeMomentumVelocityRatioUndefined: Self = StObject.set(x, "freeModeMomentumVelocityRatio", js.undefined)
    
    @scala.inline
    def setFreeModeSticky(value: Boolean): Self = StObject.set(x, "freeModeSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeModeStickyUndefined: Self = StObject.set(x, "freeModeSticky", js.undefined)
    
    @scala.inline
    def setFreeModeUndefined: Self = StObject.set(x, "freeMode", js.undefined)
    
    @scala.inline
    def setGrabCursor(value: Boolean): Self = StObject.set(x, "grabCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrabCursorUndefined: Self = StObject.set(x, "grabCursor", js.undefined)
    
    @scala.inline
    def setHashNavigation(value: HashNavigationOptions | Boolean): Self = StObject.set(x, "hashNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashNavigationUndefined: Self = StObject.set(x, "hashNavigation", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHistory(value: HistoryNavigationOptions | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setIOSEdgeSwipeDetection(value: Boolean): Self = StObject.set(x, "iOSEdgeSwipeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOSEdgeSwipeDetectionUndefined: Self = StObject.set(x, "iOSEdgeSwipeDetection", js.undefined)
    
    @scala.inline
    def setIOSEdgeSwipeThreshold(value: Double): Self = StObject.set(x, "iOSEdgeSwipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOSEdgeSwipeThresholdUndefined: Self = StObject.set(x, "iOSEdgeSwipeThreshold", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
    
    @scala.inline
    def setKeyboard(value: KeyboardOptions | Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLazy(value: LazyOptions | Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setLongSwipes(value: Boolean): Self = StObject.set(x, "longSwipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongSwipesMs(value: Double): Self = StObject.set(x, "longSwipesMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongSwipesMsUndefined: Self = StObject.set(x, "longSwipesMs", js.undefined)
    
    @scala.inline
    def setLongSwipesRatio(value: Double): Self = StObject.set(x, "longSwipesRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongSwipesRatioUndefined: Self = StObject.set(x, "longSwipesRatio", js.undefined)
    
    @scala.inline
    def setLongSwipesUndefined: Self = StObject.set(x, "longSwipes", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopAdditionalSlides(value: Double): Self = StObject.set(x, "loopAdditionalSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopAdditionalSlidesUndefined: Self = StObject.set(x, "loopAdditionalSlides", js.undefined)
    
    @scala.inline
    def setLoopFillGroupWithBlank(value: Boolean): Self = StObject.set(x, "loopFillGroupWithBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopFillGroupWithBlankUndefined: Self = StObject.set(x, "loopFillGroupWithBlank", js.undefined)
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setLoopedSlides(value: Double): Self = StObject.set(x, "loopedSlides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopedSlidesUndefined: Self = StObject.set(x, "loopedSlides", js.undefined)
    
    @scala.inline
    def setMousewheel(value: MousewheelOptions | Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationOptions): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    @scala.inline
    def setNoSwiping(value: Boolean): Self = StObject.set(x, "noSwiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSwipingClass(value: String): Self = StObject.set(x, "noSwipingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSwipingClassUndefined: Self = StObject.set(x, "noSwipingClass", js.undefined)
    
    @scala.inline
    def setNoSwipingSelector(value: String): Self = StObject.set(x, "noSwipingSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSwipingSelectorUndefined: Self = StObject.set(x, "noSwipingSelector", js.undefined)
    
    @scala.inline
    def setNoSwipingUndefined: Self = StObject.set(x, "noSwiping", js.undefined)
    
    @scala.inline
    def setNormalizeSlideIndex(value: Boolean): Self = StObject.set(x, "normalizeSlideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeSlideIndexUndefined: Self = StObject.set(x, "normalizeSlideIndex", js.undefined)
    
    @scala.inline
    def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
    
    @scala.inline
    def setObserveSlideChildren(value: Boolean): Self = StObject.set(x, "observeSlideChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveSlideChildrenUndefined: Self = StObject.set(x, "observeSlideChildren", js.undefined)
    
    @scala.inline
    def setObserver(value: Boolean): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
    
    @scala.inline
    def setOn(value: keyinSwiperEventvoid): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPagination(value: PaginationOptions): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setParallax(value: Boolean): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
    
    @scala.inline
    def setPassiveListeners(value: Boolean): Self = StObject.set(x, "passiveListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveListenersUndefined: Self = StObject.set(x, "passiveListeners", js.undefined)
    
    @scala.inline
    def setPreloadImages(value: Boolean): Self = StObject.set(x, "preloadImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadImagesUndefined: Self = StObject.set(x, "preloadImages", js.undefined)
    
    @scala.inline
    def setPreventClicks(value: Boolean): Self = StObject.set(x, "preventClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventClicksPropagation(value: Boolean): Self = StObject.set(x, "preventClicksPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventClicksPropagationUndefined: Self = StObject.set(x, "preventClicksPropagation", js.undefined)
    
    @scala.inline
    def setPreventClicksUndefined: Self = StObject.set(x, "preventClicks", js.undefined)
    
    @scala.inline
    def setPreventInteractionOnTransition(value: Boolean): Self = StObject.set(x, "preventInteractionOnTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventInteractionOnTransitionUndefined: Self = StObject.set(x, "preventInteractionOnTransition", js.undefined)
    
    @scala.inline
    def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResistanceRatio(value: Double): Self = StObject.set(x, "resistanceRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResistanceRatioUndefined: Self = StObject.set(x, "resistanceRatio", js.undefined)
    
    @scala.inline
    def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
    
    @scala.inline
    def setRoundLengths(value: Boolean): Self = StObject.set(x, "roundLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundLengthsUndefined: Self = StObject.set(x, "roundLengths", js.undefined)
    
    @scala.inline
    def setRunCallbacksOnInit(value: Boolean): Self = StObject.set(x, "runCallbacksOnInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCallbacksOnInitUndefined: Self = StObject.set(x, "runCallbacksOnInit", js.undefined)
    
    @scala.inline
    def setScrollbar(value: ScrollbarOptions): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    @scala.inline
    def setSetWrapperSize(value: Boolean): Self = StObject.set(x, "setWrapperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWrapperSizeUndefined: Self = StObject.set(x, "setWrapperSize", js.undefined)
    
    @scala.inline
    def setShortSwipes(value: Boolean): Self = StObject.set(x, "shortSwipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortSwipesUndefined: Self = StObject.set(x, "shortSwipes", js.undefined)
    
    @scala.inline
    def setSimulateTouch(value: Boolean): Self = StObject.set(x, "simulateTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateTouchUndefined: Self = StObject.set(x, "simulateTouch", js.undefined)
    
    @scala.inline
    def setSlideActiveClass(value: String): Self = StObject.set(x, "slideActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideActiveClassUndefined: Self = StObject.set(x, "slideActiveClass", js.undefined)
    
    @scala.inline
    def setSlideClass(value: String): Self = StObject.set(x, "slideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideClassUndefined: Self = StObject.set(x, "slideClass", js.undefined)
    
    @scala.inline
    def setSlideDuplicateActiveClass(value: String): Self = StObject.set(x, "slideDuplicateActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideDuplicateActiveClassUndefined: Self = StObject.set(x, "slideDuplicateActiveClass", js.undefined)
    
    @scala.inline
    def setSlideDuplicateClass(value: String): Self = StObject.set(x, "slideDuplicateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideDuplicateClassUndefined: Self = StObject.set(x, "slideDuplicateClass", js.undefined)
    
    @scala.inline
    def setSlideDuplicateNextClass(value: String): Self = StObject.set(x, "slideDuplicateNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideDuplicateNextClassUndefined: Self = StObject.set(x, "slideDuplicateNextClass", js.undefined)
    
    @scala.inline
    def setSlideDuplicatePrevClass(value: String): Self = StObject.set(x, "slideDuplicatePrevClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideDuplicatePrevClassUndefined: Self = StObject.set(x, "slideDuplicatePrevClass", js.undefined)
    
    @scala.inline
    def setSlideNextClass(value: String): Self = StObject.set(x, "slideNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideNextClassUndefined: Self = StObject.set(x, "slideNextClass", js.undefined)
    
    @scala.inline
    def setSlidePrevClass(value: String): Self = StObject.set(x, "slidePrevClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidePrevClassUndefined: Self = StObject.set(x, "slidePrevClass", js.undefined)
    
    @scala.inline
    def setSlideToClickedSlide(value: Boolean): Self = StObject.set(x, "slideToClickedSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideToClickedSlideUndefined: Self = StObject.set(x, "slideToClickedSlide", js.undefined)
    
    @scala.inline
    def setSlideVisibleClass(value: String): Self = StObject.set(x, "slideVisibleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideVisibleClassUndefined: Self = StObject.set(x, "slideVisibleClass", js.undefined)
    
    @scala.inline
    def setSlidesOffsetAfter(value: Double): Self = StObject.set(x, "slidesOffsetAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesOffsetAfterUndefined: Self = StObject.set(x, "slidesOffsetAfter", js.undefined)
    
    @scala.inline
    def setSlidesOffsetBefore(value: Double): Self = StObject.set(x, "slidesOffsetBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesOffsetBeforeUndefined: Self = StObject.set(x, "slidesOffsetBefore", js.undefined)
    
    @scala.inline
    def setSlidesPerColumn(value: Double): Self = StObject.set(x, "slidesPerColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerColumnFill(value: row | column): Self = StObject.set(x, "slidesPerColumnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerColumnFillUndefined: Self = StObject.set(x, "slidesPerColumnFill", js.undefined)
    
    @scala.inline
    def setSlidesPerColumnUndefined: Self = StObject.set(x, "slidesPerColumn", js.undefined)
    
    @scala.inline
    def setSlidesPerGroup(value: Double): Self = StObject.set(x, "slidesPerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerGroupSkip(value: Double): Self = StObject.set(x, "slidesPerGroupSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerGroupSkipUndefined: Self = StObject.set(x, "slidesPerGroupSkip", js.undefined)
    
    @scala.inline
    def setSlidesPerGroupUndefined: Self = StObject.set(x, "slidesPerGroup", js.undefined)
    
    @scala.inline
    def setSlidesPerView(value: Double | auto): Self = StObject.set(x, "slidesPerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerViewUndefined: Self = StObject.set(x, "slidesPerView", js.undefined)
    
    @scala.inline
    def setSpaceBetween(value: Double): Self = StObject.set(x, "spaceBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBetweenUndefined: Self = StObject.set(x, "spaceBetween", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setSwipeHandler(value: SelectableElement): Self = StObject.set(x, "swipeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeHandlerUndefined: Self = StObject.set(x, "swipeHandler", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setThumbs(value: ThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
    
    @scala.inline
    def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
    
    @scala.inline
    def setTouchEventsTarget(value: container | wrapper): Self = StObject.set(x, "touchEventsTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEventsTargetUndefined: Self = StObject.set(x, "touchEventsTarget", js.undefined)
    
    @scala.inline
    def setTouchMoveStopPropagation(value: Boolean): Self = StObject.set(x, "touchMoveStopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchMoveStopPropagationUndefined: Self = StObject.set(x, "touchMoveStopPropagation", js.undefined)
    
    @scala.inline
    def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
    
    @scala.inline
    def setTouchReleaseOnEdges(value: Boolean): Self = StObject.set(x, "touchReleaseOnEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchReleaseOnEdgesUndefined: Self = StObject.set(x, "touchReleaseOnEdges", js.undefined)
    
    @scala.inline
    def setTouchStartForcePreventDefault(value: Boolean): Self = StObject.set(x, "touchStartForcePreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchStartForcePreventDefaultUndefined: Self = StObject.set(x, "touchStartForcePreventDefault", js.undefined)
    
    @scala.inline
    def setTouchStartPreventDefault(value: Boolean): Self = StObject.set(x, "touchStartPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchStartPreventDefaultUndefined: Self = StObject.set(x, "touchStartPreventDefault", js.undefined)
    
    @scala.inline
    def setUniqueNavElements(value: Boolean): Self = StObject.set(x, "uniqueNavElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNavElementsUndefined: Self = StObject.set(x, "uniqueNavElements", js.undefined)
    
    @scala.inline
    def setUpdateOnImagesReady(value: Boolean): Self = StObject.set(x, "updateOnImagesReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnImagesReadyUndefined: Self = StObject.set(x, "updateOnImagesReady", js.undefined)
    
    @scala.inline
    def setUpdateOnWindowResize(value: Boolean): Self = StObject.set(x, "updateOnWindowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnWindowResizeUndefined: Self = StObject.set(x, "updateOnWindowResize", js.undefined)
    
    @scala.inline
    def setVirtual(value: VirtualOptions | Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualTranslate(value: Boolean): Self = StObject.set(x, "virtualTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualTranslateUndefined: Self = StObject.set(x, "virtualTranslate", js.undefined)
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    
    @scala.inline
    def setWatchOverflow(value: Boolean): Self = StObject.set(x, "watchOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOverflowUndefined: Self = StObject.set(x, "watchOverflow", js.undefined)
    
    @scala.inline
    def setWatchSlidesProgress(value: Boolean): Self = StObject.set(x, "watchSlidesProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchSlidesProgressUndefined: Self = StObject.set(x, "watchSlidesProgress", js.undefined)
    
    @scala.inline
    def setWatchSlidesVisibility(value: Boolean): Self = StObject.set(x, "watchSlidesVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchSlidesVisibilityUndefined: Self = StObject.set(x, "watchSlidesVisibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
    
    @scala.inline
    def setZoom(value: ZoomOptions | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
