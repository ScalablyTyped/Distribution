package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperOptions extends js.Object {
  var a11y: js.UndefOr[A11yOptions | scala.Boolean] = js.undefined
  var allowSlideNext: js.UndefOr[scala.Boolean] = js.undefined
  var allowSlidePrev: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
    */
  var allowTouchMove: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true and slider wrapper will adopt its height to the height of the currently active slide
    *
    * @default false
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  var autoplay: js.UndefOr[AutoplayOptions | scala.Boolean] = js.undefined
  // Breakpoints
  var breakpoints: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[SwiperOptions]] = js.undefined
  var breakpointsInverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used loop mode and slidesPerColumn
    */
  var centerInsufficientSlides: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, then active slide will be centered, not always on the left side.
    */
  var centeredSlides: js.UndefOr[scala.Boolean] = js.undefined
  // Namespace
  var containerModifierClass: js.UndefOr[java.lang.String] = js.undefined
  var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.undefined
  var cubeEffect: js.UndefOr[CubeEffectOptions] = js.undefined
  /**
    * Could be 'horizontal' or 'vertical' (for vertical slider).
    *
    * @default 'horizontal'
    */
  var direction: js.UndefOr[swiperLib.swiperLibStrings.horizontal | swiperLib.swiperLibStrings.vertical] = js.undefined
  /**
    * Tranisition effect. Could be "slide", "fade", "cube", "coverflow" or "flip"
    *
    * @default 'slide'
    */
  var effect: js.UndefOr[
    swiperLib.swiperLibStrings.slide | swiperLib.swiperLibStrings.fade | swiperLib.swiperLibStrings.cube | swiperLib.swiperLibStrings.coverflow | swiperLib.swiperLibStrings.flip
  ] = js.undefined
  var fadeEffect: js.UndefOr[FadeEffectOptions] = js.undefined
  var flipEffect: js.UndefOr[FlipEffectOptions] = js.undefined
  /**
    * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
    */
  var followFinger: js.UndefOr[scala.Boolean] = js.undefined
  // Freemode
  var freeMode: js.UndefOr[scala.Boolean] = js.undefined
  var freeModeMinimumVelocity: js.UndefOr[scala.Double] = js.undefined
  var freeModeMomentum: js.UndefOr[scala.Boolean] = js.undefined
  var freeModeMomentumBounce: js.UndefOr[scala.Boolean] = js.undefined
  var freeModeMomentumBounceRatio: js.UndefOr[scala.Double] = js.undefined
  var freeModeMomentumRatio: js.UndefOr[scala.Double] = js.undefined
  var freeModeMomentumVelocityRatio: js.UndefOr[scala.Double] = js.undefined
  var freeModeSticky: js.UndefOr[scala.Boolean] = js.undefined
  // Grab Cursor
  var grabCursor: js.UndefOr[scala.Boolean] = js.undefined
  var hashNavigation: js.UndefOr[HashNavigationOptions | scala.Boolean] = js.undefined
  /**
    * Swiper height (in px). Parameter allows to force Swiper height.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  var history: js.UndefOr[HistoryNavigationOptions | scala.Boolean] = js.undefined
  /**
    * Enable to release Swiper events for swipe-to-go-back work in iOS UIWebView
    */
  var iOSEdgeSwipeDetection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Area (in px) from left edge of the screen to release touch events for swipe-to-go-back in iOS UIWebView
    */
  var iOSEdgeSwipeThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether Swiper should be initialised automatically when you create an instance.
    * If disabled, then you need to init it manually by calling mySwiper.init()
    *
    * @default true
    */
  var init: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Index number of initial slide.
    *
    * @default 0
    */
  var initialSlide: js.UndefOr[scala.Double] = js.undefined
  var keyboard: js.UndefOr[KeyboardOptions | scala.Boolean] = js.undefined
  var `lazy`: js.UndefOr[LazyOptions | scala.Boolean] = js.undefined
  /**
    * Set to false if you want to disable long swipes
    */
  var longSwipes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesMs: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ratio to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesRatio: js.UndefOr[scala.Double] = js.undefined
  // Loop
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var loopAdditionalSlides: js.UndefOr[scala.Double] = js.undefined
  var loopFillGroupWithBlank: js.UndefOr[scala.Boolean] = js.undefined
  var loopedSlides: js.UndefOr[scala.Double] = js.undefined
  var mousewheel: js.UndefOr[MousewheelOptions | scala.Boolean] = js.undefined
  // Components
  var navigation: js.UndefOr[NavigationOptions] = js.undefined
  /**
    * Set to true on  Swiper for correct touch events interception. Use only on
    * swipers that use same direction as the parent one
    *
    * @default false
    */
  var nested: js.UndefOr[scala.Boolean] = js.undefined
  var noSwiping: js.UndefOr[scala.Boolean] = js.undefined
  var noSwipingClass: js.UndefOr[java.lang.String] = js.undefined
  var noSwipingSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Normalize slide index.
    */
  var normalizeSlideIndex: js.UndefOr[scala.Boolean] = js.undefined
  var observeParents: js.UndefOr[scala.Boolean] = js.undefined
  // Observer
  var observer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Register event handlers.
    */
  var on: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in swiper.swiper.SwiperEvent ]:? (): void}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in swiper.swiper.SwiperEvent ]:? (): void}
    */ swiperLib.swiperLibStrings.SwiperOptions with js.Any
  ] = js.undefined
  var pagination: js.UndefOr[PaginationOptions] = js.undefined
  var parallax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
    * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
    */
  var passiveListeners: js.UndefOr[scala.Boolean] = js.undefined
  // Images
  var preloadImages: js.UndefOr[scala.Boolean] = js.undefined
  // Clicks
  var preventClicks: js.UndefOr[scala.Boolean] = js.undefined
  var preventClicksPropagation: js.UndefOr[scala.Boolean] = js.undefined
  // Swiping / No swiping
  var preventInteractionOnTransition: js.UndefOr[scala.Boolean] = js.undefined
  // Touch Resistance
  /**
    * Set to false if you want to disable resistant bounds
    */
  var resistance: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option allows you to control resistance ratio
    */
  var resistanceRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set to true to round values of slides width and height to prevent blurry texts on usual
    * resolution screens (if you have such)
    *
    * @default false
    */
  var roundLengths: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fire [Transition/SlideChange][Start/End] events on swiper initialization.
    * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
    *
    * @default true
    */
  var runCallbacksOnInit: js.UndefOr[scala.Boolean] = js.undefined
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.undefined
  /**
    * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
    * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
    */
  var setWrapperSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to false if you want to disable short swipes
    */
  var shortSwipes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, Swiper will accept mouse events like touch events (click and drag to change slides)
    */
  var simulateTouch: js.UndefOr[scala.Boolean] = js.undefined
  var slideActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var slideClass: js.UndefOr[java.lang.String] = js.undefined
  var slideDuplicateClass: js.UndefOr[java.lang.String] = js.undefined
  var slideDuplicatedActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var slideDuplicatedNextClass: js.UndefOr[java.lang.String] = js.undefined
  var slideDuplicatedPrevClass: js.UndefOr[java.lang.String] = js.undefined
  var slideNextClass: js.UndefOr[java.lang.String] = js.undefined
  var slidePrevClass: js.UndefOr[java.lang.String] = js.undefined
  var slideToClickedSlide: js.UndefOr[scala.Boolean] = js.undefined
  var slideVisibleClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add (in px) additional slide offset in the end of the container (after all slides)
    */
  var slidesOffsetAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Add (in px) additional slide offset in the beginning of the container (before all slides)
    */
  var slidesOffsetBefore: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of slides per column, for multirow layout
    * slidesPerColumn > 1 is currently not compatible with loop mode (loop: true)
    */
  var slidesPerColumn: js.UndefOr[scala.Double] = js.undefined
  /**
    * Could be 'column' or 'row'. Defines how slides should fill rows, by column or by row
    */
  var slidesPerColumnFill: js.UndefOr[swiperLib.swiperLibStrings.row | swiperLib.swiperLibStrings.column] = js.undefined
  /**
    * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
    */
  var slidesPerGroup: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of slides per view (slides visible at the same time on slider's container).
    * If you use it with "auto" value and along with loop: true then you need to specify loopedSlides parameter with amount of slides to loop (duplicate)
    * slidesPerView: 'auto' is currently not compatible with multirow mode, when slidesPerColumn > 1
    */
  var slidesPerView: js.UndefOr[scala.Double | swiperLib.swiperLibStrings.auto] = js.undefined
  // Slides grid
  /**
    * Distance between slides in px.
    */
  var spaceBetween: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration of transition between slides (in ms)
    *
    * @default 300
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  var swipeHandler: js.UndefOr[SelectableElement] = js.undefined
  /**
    * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Allowable angle (in degrees) to trigger touch move
    */
  var touchAngle: js.UndefOr[scala.Double] = js.undefined
  // Touches
  /**
    * Target element to listen touch events on. Can be 'container' (to listen for touch events on swiper-container) or 'wrapper'
    * (to listen for touch events on swiper-wrapper)
    */
  var touchEventsTarget: js.UndefOr[swiperLib.swiperLibStrings.container | swiperLib.swiperLibStrings.wrapper] = js.undefined
  /**
    * If enabled, then propagation of "touchmove" will be stopped
    */
  var touchMoveStopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Touch ratio
    */
  var touchRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
    */
  var touchReleaseOnEdges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Force to always prevent default for `touchstart` (`mousedown`) event
    */
  var touchStartForcePreventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If disabled, `touchstart` (`mousedown`) event won't be prevented
    */
  var touchStartPreventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled (by default) and navigation elements' parameters passed as a string (like ".pagination")
    * then Swiper will look for such elements through child elements first.
    * Applies for pagination, prev/next buttons and scrollbar elements
    *
    * @default true
    */
  var uniqueNavElements: js.UndefOr[scala.Boolean] = js.undefined
  var updateOnImagesReady: js.UndefOr[scala.Boolean] = js.undefined
  var virtual: js.UndefOr[VirtualOptions | scala.Boolean] = js.undefined
  /**
    * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
    * Useful when you may need to create custom slide transition
    */
  var virtualTranslate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When enabled Swiper will be disabled and hide navigation buttons on
    * case there are not enough slides for sliding.
    *
    * @default false
    */
  var watchOverflow: js.UndefOr[scala.Boolean] = js.undefined
  // Progress
  var watchSlidesProgress: js.UndefOr[scala.Boolean] = js.undefined
  var watchSlidesVisibility: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Swiper width (in px). Parameter allows to force Swiper width.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrapperClass: js.UndefOr[java.lang.String] = js.undefined
  var zoom: js.UndefOr[ZoomOptions | scala.Boolean] = js.undefined
}

object SwiperOptions {
  @scala.inline
  def apply(
    a11y: A11yOptions | scala.Boolean = null,
    allowSlideNext: js.UndefOr[scala.Boolean] = js.undefined,
    allowSlidePrev: js.UndefOr[scala.Boolean] = js.undefined,
    allowTouchMove: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: AutoplayOptions | scala.Boolean = null,
    breakpoints: org.scalablytyped.runtime.NumberDictionary[SwiperOptions] = null,
    breakpointsInverse: js.UndefOr[scala.Boolean] = js.undefined,
    centerInsufficientSlides: js.UndefOr[scala.Boolean] = js.undefined,
    centeredSlides: js.UndefOr[scala.Boolean] = js.undefined,
    containerModifierClass: java.lang.String = null,
    coverflowEffect: CoverflowEffectOptions = null,
    cubeEffect: CubeEffectOptions = null,
    direction: swiperLib.swiperLibStrings.horizontal | swiperLib.swiperLibStrings.vertical = null,
    effect: swiperLib.swiperLibStrings.slide | swiperLib.swiperLibStrings.fade | swiperLib.swiperLibStrings.cube | swiperLib.swiperLibStrings.coverflow | swiperLib.swiperLibStrings.flip = null,
    fadeEffect: FadeEffectOptions = null,
    flipEffect: FlipEffectOptions = null,
    followFinger: js.UndefOr[scala.Boolean] = js.undefined,
    freeMode: js.UndefOr[scala.Boolean] = js.undefined,
    freeModeMinimumVelocity: scala.Int | scala.Double = null,
    freeModeMomentum: js.UndefOr[scala.Boolean] = js.undefined,
    freeModeMomentumBounce: js.UndefOr[scala.Boolean] = js.undefined,
    freeModeMomentumBounceRatio: scala.Int | scala.Double = null,
    freeModeMomentumRatio: scala.Int | scala.Double = null,
    freeModeMomentumVelocityRatio: scala.Int | scala.Double = null,
    freeModeSticky: js.UndefOr[scala.Boolean] = js.undefined,
    grabCursor: js.UndefOr[scala.Boolean] = js.undefined,
    hashNavigation: HashNavigationOptions | scala.Boolean = null,
    height: scala.Int | scala.Double = null,
    history: HistoryNavigationOptions | scala.Boolean = null,
    iOSEdgeSwipeDetection: js.UndefOr[scala.Boolean] = js.undefined,
    iOSEdgeSwipeThreshold: scala.Int | scala.Double = null,
    init: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlide: scala.Int | scala.Double = null,
    keyboard: KeyboardOptions | scala.Boolean = null,
    `lazy`: LazyOptions | scala.Boolean = null,
    longSwipes: js.UndefOr[scala.Boolean] = js.undefined,
    longSwipesMs: scala.Int | scala.Double = null,
    longSwipesRatio: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    loopAdditionalSlides: scala.Int | scala.Double = null,
    loopFillGroupWithBlank: js.UndefOr[scala.Boolean] = js.undefined,
    loopedSlides: scala.Int | scala.Double = null,
    mousewheel: MousewheelOptions | scala.Boolean = null,
    navigation: NavigationOptions = null,
    nested: js.UndefOr[scala.Boolean] = js.undefined,
    noSwiping: js.UndefOr[scala.Boolean] = js.undefined,
    noSwipingClass: java.lang.String = null,
    noSwipingSelector: java.lang.String = null,
    normalizeSlideIndex: js.UndefOr[scala.Boolean] = js.undefined,
    observeParents: js.UndefOr[scala.Boolean] = js.undefined,
    observer: js.UndefOr[scala.Boolean] = js.undefined,
    on: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in swiper.swiper.SwiperEvent ]:? (): void}
    */ swiperLib.swiperLibStrings.SwiperOptions with js.Any = null,
    pagination: PaginationOptions = null,
    parallax: js.UndefOr[scala.Boolean] = js.undefined,
    passiveListeners: js.UndefOr[scala.Boolean] = js.undefined,
    preloadImages: js.UndefOr[scala.Boolean] = js.undefined,
    preventClicks: js.UndefOr[scala.Boolean] = js.undefined,
    preventClicksPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    preventInteractionOnTransition: js.UndefOr[scala.Boolean] = js.undefined,
    resistance: js.UndefOr[scala.Boolean] = js.undefined,
    resistanceRatio: scala.Int | scala.Double = null,
    roundLengths: js.UndefOr[scala.Boolean] = js.undefined,
    runCallbacksOnInit: js.UndefOr[scala.Boolean] = js.undefined,
    scrollbar: ScrollbarOptions = null,
    setWrapperSize: js.UndefOr[scala.Boolean] = js.undefined,
    shortSwipes: js.UndefOr[scala.Boolean] = js.undefined,
    simulateTouch: js.UndefOr[scala.Boolean] = js.undefined,
    slideActiveClass: java.lang.String = null,
    slideClass: java.lang.String = null,
    slideDuplicateClass: java.lang.String = null,
    slideDuplicatedActiveClass: java.lang.String = null,
    slideDuplicatedNextClass: java.lang.String = null,
    slideDuplicatedPrevClass: java.lang.String = null,
    slideNextClass: java.lang.String = null,
    slidePrevClass: java.lang.String = null,
    slideToClickedSlide: js.UndefOr[scala.Boolean] = js.undefined,
    slideVisibleClass: java.lang.String = null,
    slidesOffsetAfter: scala.Int | scala.Double = null,
    slidesOffsetBefore: scala.Int | scala.Double = null,
    slidesPerColumn: scala.Int | scala.Double = null,
    slidesPerColumnFill: swiperLib.swiperLibStrings.row | swiperLib.swiperLibStrings.column = null,
    slidesPerGroup: scala.Int | scala.Double = null,
    slidesPerView: scala.Double | swiperLib.swiperLibStrings.auto = null,
    spaceBetween: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    swipeHandler: SelectableElement = null,
    threshold: scala.Int | scala.Double = null,
    touchAngle: scala.Int | scala.Double = null,
    touchEventsTarget: swiperLib.swiperLibStrings.container | swiperLib.swiperLibStrings.wrapper = null,
    touchMoveStopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    touchRatio: scala.Int | scala.Double = null,
    touchReleaseOnEdges: js.UndefOr[scala.Boolean] = js.undefined,
    touchStartForcePreventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    touchStartPreventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueNavElements: js.UndefOr[scala.Boolean] = js.undefined,
    updateOnImagesReady: js.UndefOr[scala.Boolean] = js.undefined,
    virtual: VirtualOptions | scala.Boolean = null,
    virtualTranslate: js.UndefOr[scala.Boolean] = js.undefined,
    watchOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    watchSlidesProgress: js.UndefOr[scala.Boolean] = js.undefined,
    watchSlidesVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wrapperClass: java.lang.String = null,
    zoom: ZoomOptions | scala.Boolean = null
  ): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    if (a11y != null) __obj.updateDynamic("a11y")(a11y.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSlideNext)) __obj.updateDynamic("allowSlideNext")(allowSlideNext)
    if (!js.isUndefined(allowSlidePrev)) __obj.updateDynamic("allowSlidePrev")(allowSlidePrev)
    if (!js.isUndefined(allowTouchMove)) __obj.updateDynamic("allowTouchMove")(allowTouchMove)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (!js.isUndefined(breakpointsInverse)) __obj.updateDynamic("breakpointsInverse")(breakpointsInverse)
    if (!js.isUndefined(centerInsufficientSlides)) __obj.updateDynamic("centerInsufficientSlides")(centerInsufficientSlides)
    if (!js.isUndefined(centeredSlides)) __obj.updateDynamic("centeredSlides")(centeredSlides)
    if (containerModifierClass != null) __obj.updateDynamic("containerModifierClass")(containerModifierClass)
    if (coverflowEffect != null) __obj.updateDynamic("coverflowEffect")(coverflowEffect)
    if (cubeEffect != null) __obj.updateDynamic("cubeEffect")(cubeEffect)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (fadeEffect != null) __obj.updateDynamic("fadeEffect")(fadeEffect)
    if (flipEffect != null) __obj.updateDynamic("flipEffect")(flipEffect)
    if (!js.isUndefined(followFinger)) __obj.updateDynamic("followFinger")(followFinger)
    if (!js.isUndefined(freeMode)) __obj.updateDynamic("freeMode")(freeMode)
    if (freeModeMinimumVelocity != null) __obj.updateDynamic("freeModeMinimumVelocity")(freeModeMinimumVelocity.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentum)) __obj.updateDynamic("freeModeMomentum")(freeModeMomentum)
    if (!js.isUndefined(freeModeMomentumBounce)) __obj.updateDynamic("freeModeMomentumBounce")(freeModeMomentumBounce)
    if (freeModeMomentumBounceRatio != null) __obj.updateDynamic("freeModeMomentumBounceRatio")(freeModeMomentumBounceRatio.asInstanceOf[js.Any])
    if (freeModeMomentumRatio != null) __obj.updateDynamic("freeModeMomentumRatio")(freeModeMomentumRatio.asInstanceOf[js.Any])
    if (freeModeMomentumVelocityRatio != null) __obj.updateDynamic("freeModeMomentumVelocityRatio")(freeModeMomentumVelocityRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeSticky)) __obj.updateDynamic("freeModeSticky")(freeModeSticky)
    if (!js.isUndefined(grabCursor)) __obj.updateDynamic("grabCursor")(grabCursor)
    if (hashNavigation != null) __obj.updateDynamic("hashNavigation")(hashNavigation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSEdgeSwipeDetection)) __obj.updateDynamic("iOSEdgeSwipeDetection")(iOSEdgeSwipeDetection)
    if (iOSEdgeSwipeThreshold != null) __obj.updateDynamic("iOSEdgeSwipeThreshold")(iOSEdgeSwipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(longSwipes)) __obj.updateDynamic("longSwipes")(longSwipes)
    if (longSwipesMs != null) __obj.updateDynamic("longSwipesMs")(longSwipesMs.asInstanceOf[js.Any])
    if (longSwipesRatio != null) __obj.updateDynamic("longSwipesRatio")(longSwipesRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (loopAdditionalSlides != null) __obj.updateDynamic("loopAdditionalSlides")(loopAdditionalSlides.asInstanceOf[js.Any])
    if (!js.isUndefined(loopFillGroupWithBlank)) __obj.updateDynamic("loopFillGroupWithBlank")(loopFillGroupWithBlank)
    if (loopedSlides != null) __obj.updateDynamic("loopedSlides")(loopedSlides.asInstanceOf[js.Any])
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested)
    if (!js.isUndefined(noSwiping)) __obj.updateDynamic("noSwiping")(noSwiping)
    if (noSwipingClass != null) __obj.updateDynamic("noSwipingClass")(noSwipingClass)
    if (noSwipingSelector != null) __obj.updateDynamic("noSwipingSelector")(noSwipingSelector)
    if (!js.isUndefined(normalizeSlideIndex)) __obj.updateDynamic("normalizeSlideIndex")(normalizeSlideIndex)
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents)
    if (!js.isUndefined(observer)) __obj.updateDynamic("observer")(observer)
    if (on != null) __obj.updateDynamic("on")(on)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax)
    if (!js.isUndefined(passiveListeners)) __obj.updateDynamic("passiveListeners")(passiveListeners)
    if (!js.isUndefined(preloadImages)) __obj.updateDynamic("preloadImages")(preloadImages)
    if (!js.isUndefined(preventClicks)) __obj.updateDynamic("preventClicks")(preventClicks)
    if (!js.isUndefined(preventClicksPropagation)) __obj.updateDynamic("preventClicksPropagation")(preventClicksPropagation)
    if (!js.isUndefined(preventInteractionOnTransition)) __obj.updateDynamic("preventInteractionOnTransition")(preventInteractionOnTransition)
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance)
    if (resistanceRatio != null) __obj.updateDynamic("resistanceRatio")(resistanceRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(roundLengths)) __obj.updateDynamic("roundLengths")(roundLengths)
    if (!js.isUndefined(runCallbacksOnInit)) __obj.updateDynamic("runCallbacksOnInit")(runCallbacksOnInit)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (!js.isUndefined(setWrapperSize)) __obj.updateDynamic("setWrapperSize")(setWrapperSize)
    if (!js.isUndefined(shortSwipes)) __obj.updateDynamic("shortSwipes")(shortSwipes)
    if (!js.isUndefined(simulateTouch)) __obj.updateDynamic("simulateTouch")(simulateTouch)
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass)
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass)
    if (slideDuplicateClass != null) __obj.updateDynamic("slideDuplicateClass")(slideDuplicateClass)
    if (slideDuplicatedActiveClass != null) __obj.updateDynamic("slideDuplicatedActiveClass")(slideDuplicatedActiveClass)
    if (slideDuplicatedNextClass != null) __obj.updateDynamic("slideDuplicatedNextClass")(slideDuplicatedNextClass)
    if (slideDuplicatedPrevClass != null) __obj.updateDynamic("slideDuplicatedPrevClass")(slideDuplicatedPrevClass)
    if (slideNextClass != null) __obj.updateDynamic("slideNextClass")(slideNextClass)
    if (slidePrevClass != null) __obj.updateDynamic("slidePrevClass")(slidePrevClass)
    if (!js.isUndefined(slideToClickedSlide)) __obj.updateDynamic("slideToClickedSlide")(slideToClickedSlide)
    if (slideVisibleClass != null) __obj.updateDynamic("slideVisibleClass")(slideVisibleClass)
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
    if (touchAngle != null) __obj.updateDynamic("touchAngle")(touchAngle.asInstanceOf[js.Any])
    if (touchEventsTarget != null) __obj.updateDynamic("touchEventsTarget")(touchEventsTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMoveStopPropagation)) __obj.updateDynamic("touchMoveStopPropagation")(touchMoveStopPropagation)
    if (touchRatio != null) __obj.updateDynamic("touchRatio")(touchRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(touchReleaseOnEdges)) __obj.updateDynamic("touchReleaseOnEdges")(touchReleaseOnEdges)
    if (!js.isUndefined(touchStartForcePreventDefault)) __obj.updateDynamic("touchStartForcePreventDefault")(touchStartForcePreventDefault)
    if (!js.isUndefined(touchStartPreventDefault)) __obj.updateDynamic("touchStartPreventDefault")(touchStartPreventDefault)
    if (!js.isUndefined(uniqueNavElements)) __obj.updateDynamic("uniqueNavElements")(uniqueNavElements)
    if (!js.isUndefined(updateOnImagesReady)) __obj.updateDynamic("updateOnImagesReady")(updateOnImagesReady)
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualTranslate)) __obj.updateDynamic("virtualTranslate")(virtualTranslate)
    if (!js.isUndefined(watchOverflow)) __obj.updateDynamic("watchOverflow")(watchOverflow)
    if (!js.isUndefined(watchSlidesProgress)) __obj.updateDynamic("watchSlidesProgress")(watchSlidesProgress)
    if (!js.isUndefined(watchSlidesVisibility)) __obj.updateDynamic("watchSlidesVisibility")(watchSlidesVisibility)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperOptions]
  }
}

