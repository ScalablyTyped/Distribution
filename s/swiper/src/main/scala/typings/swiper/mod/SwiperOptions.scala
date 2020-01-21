package typings.swiper.mod

import org.scalablytyped.runtime.NumberDictionary
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

trait SwiperOptions extends js.Object {
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
  // Namespace
  var containerModifierClass: js.UndefOr[String] = js.undefined
  var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.undefined
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
  // Components
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
  var observer: js.UndefOr[Boolean] = js.undefined
  /**
    * Register event handlers.
    */
  var on: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in swiper.swiper.SwiperEvent ]:? (): void}
    */ typings.swiper.swiperStrings.SwiperOptions with js.Any
  ] = js.undefined
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
  @scala.inline
  def apply(
    a11y: A11yOptions | Boolean = null,
    allowSlideNext: js.UndefOr[Boolean] = js.undefined,
    allowSlidePrev: js.UndefOr[Boolean] = js.undefined,
    allowTouchMove: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoplay: AutoplayOptions | Boolean = null,
    breakpoints: NumberDictionary[SwiperOptions] = null,
    breakpointsInverse: js.UndefOr[Boolean] = js.undefined,
    centerInsufficientSlides: js.UndefOr[Boolean] = js.undefined,
    centeredSlides: js.UndefOr[Boolean] = js.undefined,
    containerModifierClass: String = null,
    coverflowEffect: CoverflowEffectOptions = null,
    cubeEffect: CubeEffectOptions = null,
    direction: horizontal | vertical = null,
    effect: slide | fade | cube | coverflow | flip = null,
    fadeEffect: FadeEffectOptions = null,
    flipEffect: FlipEffectOptions = null,
    followFinger: js.UndefOr[Boolean] = js.undefined,
    freeMode: js.UndefOr[Boolean] = js.undefined,
    freeModeMinimumVelocity: Int | Double = null,
    freeModeMomentum: js.UndefOr[Boolean] = js.undefined,
    freeModeMomentumBounce: js.UndefOr[Boolean] = js.undefined,
    freeModeMomentumBounceRatio: Int | Double = null,
    freeModeMomentumRatio: Int | Double = null,
    freeModeMomentumVelocityRatio: Int | Double = null,
    freeModeSticky: js.UndefOr[Boolean] = js.undefined,
    grabCursor: js.UndefOr[Boolean] = js.undefined,
    hashNavigation: HashNavigationOptions | Boolean = null,
    height: Int | Double = null,
    history: HistoryNavigationOptions | Boolean = null,
    iOSEdgeSwipeDetection: js.UndefOr[Boolean] = js.undefined,
    iOSEdgeSwipeThreshold: Int | Double = null,
    init: js.UndefOr[Boolean] = js.undefined,
    initialSlide: Int | Double = null,
    keyboard: KeyboardOptions | Boolean = null,
    `lazy`: LazyOptions | Boolean = null,
    longSwipes: js.UndefOr[Boolean] = js.undefined,
    longSwipesMs: Int | Double = null,
    longSwipesRatio: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    loopAdditionalSlides: Int | Double = null,
    loopFillGroupWithBlank: js.UndefOr[Boolean] = js.undefined,
    loopedSlides: Int | Double = null,
    mousewheel: MousewheelOptions | Boolean = null,
    navigation: NavigationOptions = null,
    nested: js.UndefOr[Boolean] = js.undefined,
    noSwiping: js.UndefOr[Boolean] = js.undefined,
    noSwipingClass: String = null,
    noSwipingSelector: String = null,
    normalizeSlideIndex: js.UndefOr[Boolean] = js.undefined,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    observer: js.UndefOr[Boolean] = js.undefined,
    on: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in swiper.swiper.SwiperEvent ]:? (): void}
    */ typings.swiper.swiperStrings.SwiperOptions with js.Any = null,
    pagination: PaginationOptions = null,
    parallax: js.UndefOr[Boolean] = js.undefined,
    passiveListeners: js.UndefOr[Boolean] = js.undefined,
    preloadImages: js.UndefOr[Boolean] = js.undefined,
    preventClicks: js.UndefOr[Boolean] = js.undefined,
    preventClicksPropagation: js.UndefOr[Boolean] = js.undefined,
    preventInteractionOnTransition: js.UndefOr[Boolean] = js.undefined,
    resistance: js.UndefOr[Boolean] = js.undefined,
    resistanceRatio: Int | Double = null,
    roundLengths: js.UndefOr[Boolean] = js.undefined,
    runCallbacksOnInit: js.UndefOr[Boolean] = js.undefined,
    scrollbar: ScrollbarOptions = null,
    setWrapperSize: js.UndefOr[Boolean] = js.undefined,
    shortSwipes: js.UndefOr[Boolean] = js.undefined,
    simulateTouch: js.UndefOr[Boolean] = js.undefined,
    slideActiveClass: String = null,
    slideClass: String = null,
    slideDuplicateActiveClass: String = null,
    slideDuplicateClass: String = null,
    slideDuplicateNextClass: String = null,
    slideDuplicatePrevClass: String = null,
    slideNextClass: String = null,
    slidePrevClass: String = null,
    slideToClickedSlide: js.UndefOr[Boolean] = js.undefined,
    slideVisibleClass: String = null,
    slidesOffsetAfter: Int | Double = null,
    slidesOffsetBefore: Int | Double = null,
    slidesPerColumn: Int | Double = null,
    slidesPerColumnFill: row | column = null,
    slidesPerGroup: Int | Double = null,
    slidesPerView: Double | auto = null,
    spaceBetween: Int | Double = null,
    speed: Int | Double = null,
    swipeHandler: SelectableElement = null,
    threshold: Int | Double = null,
    thumbs: ThumbsOptions = null,
    touchAngle: Int | Double = null,
    touchEventsTarget: container | wrapper = null,
    touchMoveStopPropagation: js.UndefOr[Boolean] = js.undefined,
    touchRatio: Int | Double = null,
    touchReleaseOnEdges: js.UndefOr[Boolean] = js.undefined,
    touchStartForcePreventDefault: js.UndefOr[Boolean] = js.undefined,
    touchStartPreventDefault: js.UndefOr[Boolean] = js.undefined,
    uniqueNavElements: js.UndefOr[Boolean] = js.undefined,
    updateOnImagesReady: js.UndefOr[Boolean] = js.undefined,
    virtual: VirtualOptions | Boolean = null,
    virtualTranslate: js.UndefOr[Boolean] = js.undefined,
    watchOverflow: js.UndefOr[Boolean] = js.undefined,
    watchSlidesProgress: js.UndefOr[Boolean] = js.undefined,
    watchSlidesVisibility: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wrapperClass: String = null,
    zoom: ZoomOptions | Boolean = null
  ): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    if (a11y != null) __obj.updateDynamic("a11y")(a11y.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSlideNext)) __obj.updateDynamic("allowSlideNext")(allowSlideNext.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSlidePrev)) __obj.updateDynamic("allowSlidePrev")(allowSlidePrev.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTouchMove)) __obj.updateDynamic("allowTouchMove")(allowTouchMove.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(breakpointsInverse)) __obj.updateDynamic("breakpointsInverse")(breakpointsInverse.asInstanceOf[js.Any])
    if (!js.isUndefined(centerInsufficientSlides)) __obj.updateDynamic("centerInsufficientSlides")(centerInsufficientSlides.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredSlides)) __obj.updateDynamic("centeredSlides")(centeredSlides.asInstanceOf[js.Any])
    if (containerModifierClass != null) __obj.updateDynamic("containerModifierClass")(containerModifierClass.asInstanceOf[js.Any])
    if (coverflowEffect != null) __obj.updateDynamic("coverflowEffect")(coverflowEffect.asInstanceOf[js.Any])
    if (cubeEffect != null) __obj.updateDynamic("cubeEffect")(cubeEffect.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (fadeEffect != null) __obj.updateDynamic("fadeEffect")(fadeEffect.asInstanceOf[js.Any])
    if (flipEffect != null) __obj.updateDynamic("flipEffect")(flipEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(followFinger)) __obj.updateDynamic("followFinger")(followFinger.asInstanceOf[js.Any])
    if (!js.isUndefined(freeMode)) __obj.updateDynamic("freeMode")(freeMode.asInstanceOf[js.Any])
    if (freeModeMinimumVelocity != null) __obj.updateDynamic("freeModeMinimumVelocity")(freeModeMinimumVelocity.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentum)) __obj.updateDynamic("freeModeMomentum")(freeModeMomentum.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentumBounce)) __obj.updateDynamic("freeModeMomentumBounce")(freeModeMomentumBounce.asInstanceOf[js.Any])
    if (freeModeMomentumBounceRatio != null) __obj.updateDynamic("freeModeMomentumBounceRatio")(freeModeMomentumBounceRatio.asInstanceOf[js.Any])
    if (freeModeMomentumRatio != null) __obj.updateDynamic("freeModeMomentumRatio")(freeModeMomentumRatio.asInstanceOf[js.Any])
    if (freeModeMomentumVelocityRatio != null) __obj.updateDynamic("freeModeMomentumVelocityRatio")(freeModeMomentumVelocityRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeSticky)) __obj.updateDynamic("freeModeSticky")(freeModeSticky.asInstanceOf[js.Any])
    if (!js.isUndefined(grabCursor)) __obj.updateDynamic("grabCursor")(grabCursor.asInstanceOf[js.Any])
    if (hashNavigation != null) __obj.updateDynamic("hashNavigation")(hashNavigation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSEdgeSwipeDetection)) __obj.updateDynamic("iOSEdgeSwipeDetection")(iOSEdgeSwipeDetection.asInstanceOf[js.Any])
    if (iOSEdgeSwipeThreshold != null) __obj.updateDynamic("iOSEdgeSwipeThreshold")(iOSEdgeSwipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(longSwipes)) __obj.updateDynamic("longSwipes")(longSwipes.asInstanceOf[js.Any])
    if (longSwipesMs != null) __obj.updateDynamic("longSwipesMs")(longSwipesMs.asInstanceOf[js.Any])
    if (longSwipesRatio != null) __obj.updateDynamic("longSwipesRatio")(longSwipesRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopAdditionalSlides != null) __obj.updateDynamic("loopAdditionalSlides")(loopAdditionalSlides.asInstanceOf[js.Any])
    if (!js.isUndefined(loopFillGroupWithBlank)) __obj.updateDynamic("loopFillGroupWithBlank")(loopFillGroupWithBlank.asInstanceOf[js.Any])
    if (loopedSlides != null) __obj.updateDynamic("loopedSlides")(loopedSlides.asInstanceOf[js.Any])
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (!js.isUndefined(noSwiping)) __obj.updateDynamic("noSwiping")(noSwiping.asInstanceOf[js.Any])
    if (noSwipingClass != null) __obj.updateDynamic("noSwipingClass")(noSwipingClass.asInstanceOf[js.Any])
    if (noSwipingSelector != null) __obj.updateDynamic("noSwipingSelector")(noSwipingSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeSlideIndex)) __obj.updateDynamic("normalizeSlideIndex")(normalizeSlideIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (!js.isUndefined(observer)) __obj.updateDynamic("observer")(observer.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax.asInstanceOf[js.Any])
    if (!js.isUndefined(passiveListeners)) __obj.updateDynamic("passiveListeners")(passiveListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadImages)) __obj.updateDynamic("preloadImages")(preloadImages.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClicks)) __obj.updateDynamic("preventClicks")(preventClicks.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClicksPropagation)) __obj.updateDynamic("preventClicksPropagation")(preventClicksPropagation.asInstanceOf[js.Any])
    if (!js.isUndefined(preventInteractionOnTransition)) __obj.updateDynamic("preventInteractionOnTransition")(preventInteractionOnTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance.asInstanceOf[js.Any])
    if (resistanceRatio != null) __obj.updateDynamic("resistanceRatio")(resistanceRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(roundLengths)) __obj.updateDynamic("roundLengths")(roundLengths.asInstanceOf[js.Any])
    if (!js.isUndefined(runCallbacksOnInit)) __obj.updateDynamic("runCallbacksOnInit")(runCallbacksOnInit.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(setWrapperSize)) __obj.updateDynamic("setWrapperSize")(setWrapperSize.asInstanceOf[js.Any])
    if (!js.isUndefined(shortSwipes)) __obj.updateDynamic("shortSwipes")(shortSwipes.asInstanceOf[js.Any])
    if (!js.isUndefined(simulateTouch)) __obj.updateDynamic("simulateTouch")(simulateTouch.asInstanceOf[js.Any])
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (slideDuplicateActiveClass != null) __obj.updateDynamic("slideDuplicateActiveClass")(slideDuplicateActiveClass.asInstanceOf[js.Any])
    if (slideDuplicateClass != null) __obj.updateDynamic("slideDuplicateClass")(slideDuplicateClass.asInstanceOf[js.Any])
    if (slideDuplicateNextClass != null) __obj.updateDynamic("slideDuplicateNextClass")(slideDuplicateNextClass.asInstanceOf[js.Any])
    if (slideDuplicatePrevClass != null) __obj.updateDynamic("slideDuplicatePrevClass")(slideDuplicatePrevClass.asInstanceOf[js.Any])
    if (slideNextClass != null) __obj.updateDynamic("slideNextClass")(slideNextClass.asInstanceOf[js.Any])
    if (slidePrevClass != null) __obj.updateDynamic("slidePrevClass")(slidePrevClass.asInstanceOf[js.Any])
    if (!js.isUndefined(slideToClickedSlide)) __obj.updateDynamic("slideToClickedSlide")(slideToClickedSlide.asInstanceOf[js.Any])
    if (slideVisibleClass != null) __obj.updateDynamic("slideVisibleClass")(slideVisibleClass.asInstanceOf[js.Any])
    if (slidesOffsetAfter != null) __obj.updateDynamic("slidesOffsetAfter")(slidesOffsetAfter.asInstanceOf[js.Any])
    if (slidesOffsetBefore != null) __obj.updateDynamic("slidesOffsetBefore")(slidesOffsetBefore.asInstanceOf[js.Any])
    if (slidesPerColumn != null) __obj.updateDynamic("slidesPerColumn")(slidesPerColumn.asInstanceOf[js.Any])
    if (slidesPerColumnFill != null) __obj.updateDynamic("slidesPerColumnFill")(slidesPerColumnFill.asInstanceOf[js.Any])
    if (slidesPerGroup != null) __obj.updateDynamic("slidesPerGroup")(slidesPerGroup.asInstanceOf[js.Any])
    if (slidesPerView != null) __obj.updateDynamic("slidesPerView")(slidesPerView.asInstanceOf[js.Any])
    if (spaceBetween != null) __obj.updateDynamic("spaceBetween")(spaceBetween.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (swipeHandler != null) __obj.updateDynamic("swipeHandler")(swipeHandler.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (touchAngle != null) __obj.updateDynamic("touchAngle")(touchAngle.asInstanceOf[js.Any])
    if (touchEventsTarget != null) __obj.updateDynamic("touchEventsTarget")(touchEventsTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMoveStopPropagation)) __obj.updateDynamic("touchMoveStopPropagation")(touchMoveStopPropagation.asInstanceOf[js.Any])
    if (touchRatio != null) __obj.updateDynamic("touchRatio")(touchRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(touchReleaseOnEdges)) __obj.updateDynamic("touchReleaseOnEdges")(touchReleaseOnEdges.asInstanceOf[js.Any])
    if (!js.isUndefined(touchStartForcePreventDefault)) __obj.updateDynamic("touchStartForcePreventDefault")(touchStartForcePreventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(touchStartPreventDefault)) __obj.updateDynamic("touchStartPreventDefault")(touchStartPreventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNavElements)) __obj.updateDynamic("uniqueNavElements")(uniqueNavElements.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnImagesReady)) __obj.updateDynamic("updateOnImagesReady")(updateOnImagesReady.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualTranslate)) __obj.updateDynamic("virtualTranslate")(virtualTranslate.asInstanceOf[js.Any])
    if (!js.isUndefined(watchOverflow)) __obj.updateDynamic("watchOverflow")(watchOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(watchSlidesProgress)) __obj.updateDynamic("watchSlidesProgress")(watchSlidesProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(watchSlidesVisibility)) __obj.updateDynamic("watchSlidesVisibility")(watchSlidesVisibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperOptions]
  }
}

