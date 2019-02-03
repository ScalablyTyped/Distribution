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

