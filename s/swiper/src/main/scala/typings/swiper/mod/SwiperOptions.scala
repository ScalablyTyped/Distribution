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
    centeredSlidesBounds: js.UndefOr[Boolean] = js.undefined,
    containerModifierClass: String = null,
    controller: ControllerOptions | Boolean = null,
    coverflowEffect: CoverflowEffectOptions = null,
    cssMode: js.UndefOr[Boolean] = js.undefined,
    cubeEffect: CubeEffectOptions = null,
    direction: horizontal | vertical = null,
    effect: slide | fade | cube | coverflow | flip = null,
    fadeEffect: FadeEffectOptions = null,
    flipEffect: FlipEffectOptions = null,
    followFinger: js.UndefOr[Boolean] = js.undefined,
    freeMode: js.UndefOr[Boolean] = js.undefined,
    freeModeMinimumVelocity: js.UndefOr[Double] = js.undefined,
    freeModeMomentum: js.UndefOr[Boolean] = js.undefined,
    freeModeMomentumBounce: js.UndefOr[Boolean] = js.undefined,
    freeModeMomentumBounceRatio: js.UndefOr[Double] = js.undefined,
    freeModeMomentumRatio: js.UndefOr[Double] = js.undefined,
    freeModeMomentumVelocityRatio: js.UndefOr[Double] = js.undefined,
    freeModeSticky: js.UndefOr[Boolean] = js.undefined,
    grabCursor: js.UndefOr[Boolean] = js.undefined,
    hashNavigation: HashNavigationOptions | Boolean = null,
    height: js.UndefOr[Double] = js.undefined,
    history: HistoryNavigationOptions | Boolean = null,
    iOSEdgeSwipeDetection: js.UndefOr[Boolean] = js.undefined,
    iOSEdgeSwipeThreshold: js.UndefOr[Double] = js.undefined,
    init: js.UndefOr[Boolean] = js.undefined,
    initialSlide: js.UndefOr[Double] = js.undefined,
    keyboard: KeyboardOptions | Boolean = null,
    `lazy`: LazyOptions | Boolean = null,
    longSwipes: js.UndefOr[Boolean] = js.undefined,
    longSwipesMs: js.UndefOr[Double] = js.undefined,
    longSwipesRatio: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    loopAdditionalSlides: js.UndefOr[Double] = js.undefined,
    loopFillGroupWithBlank: js.UndefOr[Boolean] = js.undefined,
    loopedSlides: js.UndefOr[Double] = js.undefined,
    mousewheel: MousewheelOptions | Boolean = null,
    navigation: NavigationOptions = null,
    nested: js.UndefOr[Boolean] = js.undefined,
    noSwiping: js.UndefOr[Boolean] = js.undefined,
    noSwipingClass: String = null,
    noSwipingSelector: String = null,
    normalizeSlideIndex: js.UndefOr[Boolean] = js.undefined,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    observeSlideChildren: js.UndefOr[Boolean] = js.undefined,
    observer: js.UndefOr[Boolean] = js.undefined,
    on: keyinSwiperEventvoid = null,
    pagination: PaginationOptions = null,
    parallax: js.UndefOr[Boolean] = js.undefined,
    passiveListeners: js.UndefOr[Boolean] = js.undefined,
    preloadImages: js.UndefOr[Boolean] = js.undefined,
    preventClicks: js.UndefOr[Boolean] = js.undefined,
    preventClicksPropagation: js.UndefOr[Boolean] = js.undefined,
    preventInteractionOnTransition: js.UndefOr[Boolean] = js.undefined,
    resistance: js.UndefOr[Boolean] = js.undefined,
    resistanceRatio: js.UndefOr[Double] = js.undefined,
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
    slidesOffsetAfter: js.UndefOr[Double] = js.undefined,
    slidesOffsetBefore: js.UndefOr[Double] = js.undefined,
    slidesPerColumn: js.UndefOr[Double] = js.undefined,
    slidesPerColumnFill: row | column = null,
    slidesPerGroup: js.UndefOr[Double] = js.undefined,
    slidesPerGroupSkip: js.UndefOr[Double] = js.undefined,
    slidesPerView: Double | auto = null,
    spaceBetween: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    swipeHandler: SelectableElement = null,
    threshold: js.UndefOr[Double] = js.undefined,
    thumbs: ThumbsOptions = null,
    touchAngle: js.UndefOr[Double] = js.undefined,
    touchEventsTarget: container | wrapper = null,
    touchMoveStopPropagation: js.UndefOr[Boolean] = js.undefined,
    touchRatio: js.UndefOr[Double] = js.undefined,
    touchReleaseOnEdges: js.UndefOr[Boolean] = js.undefined,
    touchStartForcePreventDefault: js.UndefOr[Boolean] = js.undefined,
    touchStartPreventDefault: js.UndefOr[Boolean] = js.undefined,
    uniqueNavElements: js.UndefOr[Boolean] = js.undefined,
    updateOnImagesReady: js.UndefOr[Boolean] = js.undefined,
    updateOnWindowResize: js.UndefOr[Boolean] = js.undefined,
    virtual: VirtualOptions | Boolean = null,
    virtualTranslate: js.UndefOr[Boolean] = js.undefined,
    watchOverflow: js.UndefOr[Boolean] = js.undefined,
    watchSlidesProgress: js.UndefOr[Boolean] = js.undefined,
    watchSlidesVisibility: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wrapperClass: String = null,
    zoom: ZoomOptions | Boolean = null
  ): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    if (a11y != null) __obj.updateDynamic("a11y")(a11y.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSlideNext)) __obj.updateDynamic("allowSlideNext")(allowSlideNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSlidePrev)) __obj.updateDynamic("allowSlidePrev")(allowSlidePrev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTouchMove)) __obj.updateDynamic("allowTouchMove")(allowTouchMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(breakpointsInverse)) __obj.updateDynamic("breakpointsInverse")(breakpointsInverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerInsufficientSlides)) __obj.updateDynamic("centerInsufficientSlides")(centerInsufficientSlides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredSlides)) __obj.updateDynamic("centeredSlides")(centeredSlides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredSlidesBounds)) __obj.updateDynamic("centeredSlidesBounds")(centeredSlidesBounds.get.asInstanceOf[js.Any])
    if (containerModifierClass != null) __obj.updateDynamic("containerModifierClass")(containerModifierClass.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (coverflowEffect != null) __obj.updateDynamic("coverflowEffect")(coverflowEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(cssMode)) __obj.updateDynamic("cssMode")(cssMode.get.asInstanceOf[js.Any])
    if (cubeEffect != null) __obj.updateDynamic("cubeEffect")(cubeEffect.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (fadeEffect != null) __obj.updateDynamic("fadeEffect")(fadeEffect.asInstanceOf[js.Any])
    if (flipEffect != null) __obj.updateDynamic("flipEffect")(flipEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(followFinger)) __obj.updateDynamic("followFinger")(followFinger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeMode)) __obj.updateDynamic("freeMode")(freeMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMinimumVelocity)) __obj.updateDynamic("freeModeMinimumVelocity")(freeModeMinimumVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentum)) __obj.updateDynamic("freeModeMomentum")(freeModeMomentum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentumBounce)) __obj.updateDynamic("freeModeMomentumBounce")(freeModeMomentumBounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentumBounceRatio)) __obj.updateDynamic("freeModeMomentumBounceRatio")(freeModeMomentumBounceRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentumRatio)) __obj.updateDynamic("freeModeMomentumRatio")(freeModeMomentumRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeMomentumVelocityRatio)) __obj.updateDynamic("freeModeMomentumVelocityRatio")(freeModeMomentumVelocityRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeModeSticky)) __obj.updateDynamic("freeModeSticky")(freeModeSticky.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grabCursor)) __obj.updateDynamic("grabCursor")(grabCursor.get.asInstanceOf[js.Any])
    if (hashNavigation != null) __obj.updateDynamic("hashNavigation")(hashNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSEdgeSwipeDetection)) __obj.updateDynamic("iOSEdgeSwipeDetection")(iOSEdgeSwipeDetection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSEdgeSwipeThreshold)) __obj.updateDynamic("iOSEdgeSwipeThreshold")(iOSEdgeSwipeThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlide)) __obj.updateDynamic("initialSlide")(initialSlide.get.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(longSwipes)) __obj.updateDynamic("longSwipes")(longSwipes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longSwipesMs)) __obj.updateDynamic("longSwipesMs")(longSwipesMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longSwipesRatio)) __obj.updateDynamic("longSwipesRatio")(longSwipesRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopAdditionalSlides)) __obj.updateDynamic("loopAdditionalSlides")(loopAdditionalSlides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopFillGroupWithBlank)) __obj.updateDynamic("loopFillGroupWithBlank")(loopFillGroupWithBlank.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopedSlides)) __obj.updateDynamic("loopedSlides")(loopedSlides.get.asInstanceOf[js.Any])
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSwiping)) __obj.updateDynamic("noSwiping")(noSwiping.get.asInstanceOf[js.Any])
    if (noSwipingClass != null) __obj.updateDynamic("noSwipingClass")(noSwipingClass.asInstanceOf[js.Any])
    if (noSwipingSelector != null) __obj.updateDynamic("noSwipingSelector")(noSwipingSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeSlideIndex)) __obj.updateDynamic("normalizeSlideIndex")(normalizeSlideIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(observeSlideChildren)) __obj.updateDynamic("observeSlideChildren")(observeSlideChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(observer)) __obj.updateDynamic("observer")(observer.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passiveListeners)) __obj.updateDynamic("passiveListeners")(passiveListeners.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadImages)) __obj.updateDynamic("preloadImages")(preloadImages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClicks)) __obj.updateDynamic("preventClicks")(preventClicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventClicksPropagation)) __obj.updateDynamic("preventClicksPropagation")(preventClicksPropagation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventInteractionOnTransition)) __obj.updateDynamic("preventInteractionOnTransition")(preventInteractionOnTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resistanceRatio)) __obj.updateDynamic("resistanceRatio")(resistanceRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundLengths)) __obj.updateDynamic("roundLengths")(roundLengths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runCallbacksOnInit)) __obj.updateDynamic("runCallbacksOnInit")(runCallbacksOnInit.get.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(setWrapperSize)) __obj.updateDynamic("setWrapperSize")(setWrapperSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortSwipes)) __obj.updateDynamic("shortSwipes")(shortSwipes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simulateTouch)) __obj.updateDynamic("simulateTouch")(simulateTouch.get.asInstanceOf[js.Any])
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (slideDuplicateActiveClass != null) __obj.updateDynamic("slideDuplicateActiveClass")(slideDuplicateActiveClass.asInstanceOf[js.Any])
    if (slideDuplicateClass != null) __obj.updateDynamic("slideDuplicateClass")(slideDuplicateClass.asInstanceOf[js.Any])
    if (slideDuplicateNextClass != null) __obj.updateDynamic("slideDuplicateNextClass")(slideDuplicateNextClass.asInstanceOf[js.Any])
    if (slideDuplicatePrevClass != null) __obj.updateDynamic("slideDuplicatePrevClass")(slideDuplicatePrevClass.asInstanceOf[js.Any])
    if (slideNextClass != null) __obj.updateDynamic("slideNextClass")(slideNextClass.asInstanceOf[js.Any])
    if (slidePrevClass != null) __obj.updateDynamic("slidePrevClass")(slidePrevClass.asInstanceOf[js.Any])
    if (!js.isUndefined(slideToClickedSlide)) __obj.updateDynamic("slideToClickedSlide")(slideToClickedSlide.get.asInstanceOf[js.Any])
    if (slideVisibleClass != null) __obj.updateDynamic("slideVisibleClass")(slideVisibleClass.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesOffsetAfter)) __obj.updateDynamic("slidesOffsetAfter")(slidesOffsetAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesOffsetBefore)) __obj.updateDynamic("slidesOffsetBefore")(slidesOffsetBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerColumn)) __obj.updateDynamic("slidesPerColumn")(slidesPerColumn.get.asInstanceOf[js.Any])
    if (slidesPerColumnFill != null) __obj.updateDynamic("slidesPerColumnFill")(slidesPerColumnFill.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerGroup)) __obj.updateDynamic("slidesPerGroup")(slidesPerGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerGroupSkip)) __obj.updateDynamic("slidesPerGroupSkip")(slidesPerGroupSkip.get.asInstanceOf[js.Any])
    if (slidesPerView != null) __obj.updateDynamic("slidesPerView")(slidesPerView.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBetween)) __obj.updateDynamic("spaceBetween")(spaceBetween.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (swipeHandler != null) __obj.updateDynamic("swipeHandler")(swipeHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (!js.isUndefined(touchAngle)) __obj.updateDynamic("touchAngle")(touchAngle.get.asInstanceOf[js.Any])
    if (touchEventsTarget != null) __obj.updateDynamic("touchEventsTarget")(touchEventsTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMoveStopPropagation)) __obj.updateDynamic("touchMoveStopPropagation")(touchMoveStopPropagation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchRatio)) __obj.updateDynamic("touchRatio")(touchRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchReleaseOnEdges)) __obj.updateDynamic("touchReleaseOnEdges")(touchReleaseOnEdges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchStartForcePreventDefault)) __obj.updateDynamic("touchStartForcePreventDefault")(touchStartForcePreventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchStartPreventDefault)) __obj.updateDynamic("touchStartPreventDefault")(touchStartPreventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNavElements)) __obj.updateDynamic("uniqueNavElements")(uniqueNavElements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnImagesReady)) __obj.updateDynamic("updateOnImagesReady")(updateOnImagesReady.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnWindowResize)) __obj.updateDynamic("updateOnWindowResize")(updateOnWindowResize.get.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualTranslate)) __obj.updateDynamic("virtualTranslate")(virtualTranslate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchOverflow)) __obj.updateDynamic("watchOverflow")(watchOverflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchSlidesProgress)) __obj.updateDynamic("watchSlidesProgress")(watchSlidesProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchSlidesVisibility)) __obj.updateDynamic("watchSlidesVisibility")(watchSlidesVisibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperOptions]
  }
}

