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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwiperOptions extends js.Object {
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
  implicit class SwiperOptionsOps[Self <: SwiperOptions] (val x: Self) extends AnyVal {
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
    def setA11y(value: A11yOptions | Boolean): Self = this.set("a11y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11y: Self = this.set("a11y", js.undefined)
    @scala.inline
    def setAllowSlideNext(value: Boolean): Self = this.set("allowSlideNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSlideNext: Self = this.set("allowSlideNext", js.undefined)
    @scala.inline
    def setAllowSlidePrev(value: Boolean): Self = this.set("allowSlidePrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSlidePrev: Self = this.set("allowSlidePrev", js.undefined)
    @scala.inline
    def setAllowTouchMove(value: Boolean): Self = this.set("allowTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTouchMove: Self = this.set("allowTouchMove", js.undefined)
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setAutoplay(value: AutoplayOptions | Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBreakpoints(value: NumberDictionary[SwiperOptions]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setBreakpointsInverse(value: Boolean): Self = this.set("breakpointsInverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpointsInverse: Self = this.set("breakpointsInverse", js.undefined)
    @scala.inline
    def setCenterInsufficientSlides(value: Boolean): Self = this.set("centerInsufficientSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterInsufficientSlides: Self = this.set("centerInsufficientSlides", js.undefined)
    @scala.inline
    def setCenteredSlides(value: Boolean): Self = this.set("centeredSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredSlides: Self = this.set("centeredSlides", js.undefined)
    @scala.inline
    def setCenteredSlidesBounds(value: Boolean): Self = this.set("centeredSlidesBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredSlidesBounds: Self = this.set("centeredSlidesBounds", js.undefined)
    @scala.inline
    def setContainerModifierClass(value: String): Self = this.set("containerModifierClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerModifierClass: Self = this.set("containerModifierClass", js.undefined)
    @scala.inline
    def setController(value: ControllerOptions | Boolean): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setCoverflowEffect(value: CoverflowEffectOptions): Self = this.set("coverflowEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverflowEffect: Self = this.set("coverflowEffect", js.undefined)
    @scala.inline
    def setCssMode(value: Boolean): Self = this.set("cssMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssMode: Self = this.set("cssMode", js.undefined)
    @scala.inline
    def setCubeEffect(value: CubeEffectOptions): Self = this.set("cubeEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubeEffect: Self = this.set("cubeEffect", js.undefined)
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEffect(value: slide | fade | cube | coverflow | flip): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setFadeEffect(value: FadeEffectOptions): Self = this.set("fadeEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeEffect: Self = this.set("fadeEffect", js.undefined)
    @scala.inline
    def setFlipEffect(value: FlipEffectOptions): Self = this.set("flipEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipEffect: Self = this.set("flipEffect", js.undefined)
    @scala.inline
    def setFollowFinger(value: Boolean): Self = this.set("followFinger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowFinger: Self = this.set("followFinger", js.undefined)
    @scala.inline
    def setFreeMode(value: Boolean): Self = this.set("freeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeMode: Self = this.set("freeMode", js.undefined)
    @scala.inline
    def setFreeModeMinimumVelocity(value: Double): Self = this.set("freeModeMinimumVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMinimumVelocity: Self = this.set("freeModeMinimumVelocity", js.undefined)
    @scala.inline
    def setFreeModeMomentum(value: Boolean): Self = this.set("freeModeMomentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMomentum: Self = this.set("freeModeMomentum", js.undefined)
    @scala.inline
    def setFreeModeMomentumBounce(value: Boolean): Self = this.set("freeModeMomentumBounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMomentumBounce: Self = this.set("freeModeMomentumBounce", js.undefined)
    @scala.inline
    def setFreeModeMomentumBounceRatio(value: Double): Self = this.set("freeModeMomentumBounceRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMomentumBounceRatio: Self = this.set("freeModeMomentumBounceRatio", js.undefined)
    @scala.inline
    def setFreeModeMomentumRatio(value: Double): Self = this.set("freeModeMomentumRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMomentumRatio: Self = this.set("freeModeMomentumRatio", js.undefined)
    @scala.inline
    def setFreeModeMomentumVelocityRatio(value: Double): Self = this.set("freeModeMomentumVelocityRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeMomentumVelocityRatio: Self = this.set("freeModeMomentumVelocityRatio", js.undefined)
    @scala.inline
    def setFreeModeSticky(value: Boolean): Self = this.set("freeModeSticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeModeSticky: Self = this.set("freeModeSticky", js.undefined)
    @scala.inline
    def setGrabCursor(value: Boolean): Self = this.set("grabCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrabCursor: Self = this.set("grabCursor", js.undefined)
    @scala.inline
    def setHashNavigation(value: HashNavigationOptions | Boolean): Self = this.set("hashNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashNavigation: Self = this.set("hashNavigation", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHistory(value: HistoryNavigationOptions | Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setIOSEdgeSwipeDetection(value: Boolean): Self = this.set("iOSEdgeSwipeDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSEdgeSwipeDetection: Self = this.set("iOSEdgeSwipeDetection", js.undefined)
    @scala.inline
    def setIOSEdgeSwipeThreshold(value: Double): Self = this.set("iOSEdgeSwipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSEdgeSwipeThreshold: Self = this.set("iOSEdgeSwipeThreshold", js.undefined)
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitialSlide(value: Double): Self = this.set("initialSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlide: Self = this.set("initialSlide", js.undefined)
    @scala.inline
    def setKeyboard(value: KeyboardOptions | Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLazy(value: LazyOptions | Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setLongSwipes(value: Boolean): Self = this.set("longSwipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongSwipes: Self = this.set("longSwipes", js.undefined)
    @scala.inline
    def setLongSwipesMs(value: Double): Self = this.set("longSwipesMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongSwipesMs: Self = this.set("longSwipesMs", js.undefined)
    @scala.inline
    def setLongSwipesRatio(value: Double): Self = this.set("longSwipesRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongSwipesRatio: Self = this.set("longSwipesRatio", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopAdditionalSlides(value: Double): Self = this.set("loopAdditionalSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopAdditionalSlides: Self = this.set("loopAdditionalSlides", js.undefined)
    @scala.inline
    def setLoopFillGroupWithBlank(value: Boolean): Self = this.set("loopFillGroupWithBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopFillGroupWithBlank: Self = this.set("loopFillGroupWithBlank", js.undefined)
    @scala.inline
    def setLoopedSlides(value: Double): Self = this.set("loopedSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopedSlides: Self = this.set("loopedSlides", js.undefined)
    @scala.inline
    def setMousewheel(value: MousewheelOptions | Boolean): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    @scala.inline
    def setNavigation(value: NavigationOptions): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setNested(value: Boolean): Self = this.set("nested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNested: Self = this.set("nested", js.undefined)
    @scala.inline
    def setNoSwiping(value: Boolean): Self = this.set("noSwiping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSwiping: Self = this.set("noSwiping", js.undefined)
    @scala.inline
    def setNoSwipingClass(value: String): Self = this.set("noSwipingClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSwipingClass: Self = this.set("noSwipingClass", js.undefined)
    @scala.inline
    def setNoSwipingSelector(value: String): Self = this.set("noSwipingSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSwipingSelector: Self = this.set("noSwipingSelector", js.undefined)
    @scala.inline
    def setNormalizeSlideIndex(value: Boolean): Self = this.set("normalizeSlideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeSlideIndex: Self = this.set("normalizeSlideIndex", js.undefined)
    @scala.inline
    def setObserveParents(value: Boolean): Self = this.set("observeParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveParents: Self = this.set("observeParents", js.undefined)
    @scala.inline
    def setObserveSlideChildren(value: Boolean): Self = this.set("observeSlideChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveSlideChildren: Self = this.set("observeSlideChildren", js.undefined)
    @scala.inline
    def setObserver(value: Boolean): Self = this.set("observer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserver: Self = this.set("observer", js.undefined)
    @scala.inline
    def setOn(value: keyinSwiperEventvoid): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPagination(value: PaginationOptions): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setParallax(value: Boolean): Self = this.set("parallax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallax: Self = this.set("parallax", js.undefined)
    @scala.inline
    def setPassiveListeners(value: Boolean): Self = this.set("passiveListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassiveListeners: Self = this.set("passiveListeners", js.undefined)
    @scala.inline
    def setPreloadImages(value: Boolean): Self = this.set("preloadImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadImages: Self = this.set("preloadImages", js.undefined)
    @scala.inline
    def setPreventClicks(value: Boolean): Self = this.set("preventClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventClicks: Self = this.set("preventClicks", js.undefined)
    @scala.inline
    def setPreventClicksPropagation(value: Boolean): Self = this.set("preventClicksPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventClicksPropagation: Self = this.set("preventClicksPropagation", js.undefined)
    @scala.inline
    def setPreventInteractionOnTransition(value: Boolean): Self = this.set("preventInteractionOnTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventInteractionOnTransition: Self = this.set("preventInteractionOnTransition", js.undefined)
    @scala.inline
    def setResistance(value: Boolean): Self = this.set("resistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResistance: Self = this.set("resistance", js.undefined)
    @scala.inline
    def setResistanceRatio(value: Double): Self = this.set("resistanceRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResistanceRatio: Self = this.set("resistanceRatio", js.undefined)
    @scala.inline
    def setRoundLengths(value: Boolean): Self = this.set("roundLengths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundLengths: Self = this.set("roundLengths", js.undefined)
    @scala.inline
    def setRunCallbacksOnInit(value: Boolean): Self = this.set("runCallbacksOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunCallbacksOnInit: Self = this.set("runCallbacksOnInit", js.undefined)
    @scala.inline
    def setScrollbar(value: ScrollbarOptions): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    @scala.inline
    def setSetWrapperSize(value: Boolean): Self = this.set("setWrapperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetWrapperSize: Self = this.set("setWrapperSize", js.undefined)
    @scala.inline
    def setShortSwipes(value: Boolean): Self = this.set("shortSwipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortSwipes: Self = this.set("shortSwipes", js.undefined)
    @scala.inline
    def setSimulateTouch(value: Boolean): Self = this.set("simulateTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimulateTouch: Self = this.set("simulateTouch", js.undefined)
    @scala.inline
    def setSlideActiveClass(value: String): Self = this.set("slideActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideActiveClass: Self = this.set("slideActiveClass", js.undefined)
    @scala.inline
    def setSlideClass(value: String): Self = this.set("slideClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideClass: Self = this.set("slideClass", js.undefined)
    @scala.inline
    def setSlideDuplicateActiveClass(value: String): Self = this.set("slideDuplicateActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDuplicateActiveClass: Self = this.set("slideDuplicateActiveClass", js.undefined)
    @scala.inline
    def setSlideDuplicateClass(value: String): Self = this.set("slideDuplicateClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDuplicateClass: Self = this.set("slideDuplicateClass", js.undefined)
    @scala.inline
    def setSlideDuplicateNextClass(value: String): Self = this.set("slideDuplicateNextClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDuplicateNextClass: Self = this.set("slideDuplicateNextClass", js.undefined)
    @scala.inline
    def setSlideDuplicatePrevClass(value: String): Self = this.set("slideDuplicatePrevClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDuplicatePrevClass: Self = this.set("slideDuplicatePrevClass", js.undefined)
    @scala.inline
    def setSlideNextClass(value: String): Self = this.set("slideNextClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideNextClass: Self = this.set("slideNextClass", js.undefined)
    @scala.inline
    def setSlidePrevClass(value: String): Self = this.set("slidePrevClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidePrevClass: Self = this.set("slidePrevClass", js.undefined)
    @scala.inline
    def setSlideToClickedSlide(value: Boolean): Self = this.set("slideToClickedSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideToClickedSlide: Self = this.set("slideToClickedSlide", js.undefined)
    @scala.inline
    def setSlideVisibleClass(value: String): Self = this.set("slideVisibleClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideVisibleClass: Self = this.set("slideVisibleClass", js.undefined)
    @scala.inline
    def setSlidesOffsetAfter(value: Double): Self = this.set("slidesOffsetAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesOffsetAfter: Self = this.set("slidesOffsetAfter", js.undefined)
    @scala.inline
    def setSlidesOffsetBefore(value: Double): Self = this.set("slidesOffsetBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesOffsetBefore: Self = this.set("slidesOffsetBefore", js.undefined)
    @scala.inline
    def setSlidesPerColumn(value: Double): Self = this.set("slidesPerColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerColumn: Self = this.set("slidesPerColumn", js.undefined)
    @scala.inline
    def setSlidesPerColumnFill(value: row | column): Self = this.set("slidesPerColumnFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerColumnFill: Self = this.set("slidesPerColumnFill", js.undefined)
    @scala.inline
    def setSlidesPerGroup(value: Double): Self = this.set("slidesPerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerGroup: Self = this.set("slidesPerGroup", js.undefined)
    @scala.inline
    def setSlidesPerGroupSkip(value: Double): Self = this.set("slidesPerGroupSkip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerGroupSkip: Self = this.set("slidesPerGroupSkip", js.undefined)
    @scala.inline
    def setSlidesPerView(value: Double | auto): Self = this.set("slidesPerView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerView: Self = this.set("slidesPerView", js.undefined)
    @scala.inline
    def setSpaceBetween(value: Double): Self = this.set("spaceBetween", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBetween: Self = this.set("spaceBetween", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSwipeHandler(value: SelectableElement): Self = this.set("swipeHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeHandler: Self = this.set("swipeHandler", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setThumbs(value: ThumbsOptions): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbs: Self = this.set("thumbs", js.undefined)
    @scala.inline
    def setTouchAngle(value: Double): Self = this.set("touchAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchAngle: Self = this.set("touchAngle", js.undefined)
    @scala.inline
    def setTouchEventsTarget(value: container | wrapper): Self = this.set("touchEventsTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEventsTarget: Self = this.set("touchEventsTarget", js.undefined)
    @scala.inline
    def setTouchMoveStopPropagation(value: Boolean): Self = this.set("touchMoveStopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchMoveStopPropagation: Self = this.set("touchMoveStopPropagation", js.undefined)
    @scala.inline
    def setTouchRatio(value: Double): Self = this.set("touchRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchRatio: Self = this.set("touchRatio", js.undefined)
    @scala.inline
    def setTouchReleaseOnEdges(value: Boolean): Self = this.set("touchReleaseOnEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchReleaseOnEdges: Self = this.set("touchReleaseOnEdges", js.undefined)
    @scala.inline
    def setTouchStartForcePreventDefault(value: Boolean): Self = this.set("touchStartForcePreventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchStartForcePreventDefault: Self = this.set("touchStartForcePreventDefault", js.undefined)
    @scala.inline
    def setTouchStartPreventDefault(value: Boolean): Self = this.set("touchStartPreventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchStartPreventDefault: Self = this.set("touchStartPreventDefault", js.undefined)
    @scala.inline
    def setUniqueNavElements(value: Boolean): Self = this.set("uniqueNavElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueNavElements: Self = this.set("uniqueNavElements", js.undefined)
    @scala.inline
    def setUpdateOnImagesReady(value: Boolean): Self = this.set("updateOnImagesReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOnImagesReady: Self = this.set("updateOnImagesReady", js.undefined)
    @scala.inline
    def setUpdateOnWindowResize(value: Boolean): Self = this.set("updateOnWindowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOnWindowResize: Self = this.set("updateOnWindowResize", js.undefined)
    @scala.inline
    def setVirtual(value: VirtualOptions | Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
    @scala.inline
    def setVirtualTranslate(value: Boolean): Self = this.set("virtualTranslate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualTranslate: Self = this.set("virtualTranslate", js.undefined)
    @scala.inline
    def setWatchOverflow(value: Boolean): Self = this.set("watchOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOverflow: Self = this.set("watchOverflow", js.undefined)
    @scala.inline
    def setWatchSlidesProgress(value: Boolean): Self = this.set("watchSlidesProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchSlidesProgress: Self = this.set("watchSlidesProgress", js.undefined)
    @scala.inline
    def setWatchSlidesVisibility(value: Boolean): Self = this.set("watchSlidesVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchSlidesVisibility: Self = this.set("watchSlidesVisibility", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
    @scala.inline
    def setZoom(value: ZoomOptions | Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

