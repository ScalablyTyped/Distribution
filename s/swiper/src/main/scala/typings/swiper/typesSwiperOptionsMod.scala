package typings.swiper

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.swiper.anon.eventinkeyofSwiperEventsSActiveIndexChange
import typings.swiper.swiperStrings.auto
import typings.swiper.swiperStrings.cards
import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.coverflow
import typings.swiper.swiperStrings.creative
import typings.swiper.swiperStrings.cube
import typings.swiper.swiperStrings.fade
import typings.swiper.swiperStrings.flip
import typings.swiper.swiperStrings.horizontal
import typings.swiper.swiperStrings.slide
import typings.swiper.swiperStrings.vertical
import typings.swiper.swiperStrings.wrapper
import typings.swiper.typesModulesA11yMod.A11yOptions
import typings.swiper.typesModulesAutoplayMod.AutoplayOptions
import typings.swiper.typesModulesControllerMod.ControllerOptions
import typings.swiper.typesModulesEffectCardsMod.CardsEffectOptions
import typings.swiper.typesModulesEffectCoverflowMod.CoverflowEffectOptions
import typings.swiper.typesModulesEffectCreativeMod.CreativeEffectOptions
import typings.swiper.typesModulesEffectCubeMod.CubeEffectOptions
import typings.swiper.typesModulesEffectFadeMod.FadeEffectOptions
import typings.swiper.typesModulesEffectFlipMod.FlipEffectOptions
import typings.swiper.typesModulesFreeModeMod.FreeModeOptions
import typings.swiper.typesModulesGridMod.GridOptions
import typings.swiper.typesModulesHashNavigationMod.HashNavigationOptions
import typings.swiper.typesModulesHistoryMod.HistoryOptions
import typings.swiper.typesModulesKeyboardMod.KeyboardOptions
import typings.swiper.typesModulesMousewheelMod.MousewheelOptions
import typings.swiper.typesModulesNavigationMod.NavigationOptions
import typings.swiper.typesModulesPaginationMod.PaginationOptions
import typings.swiper.typesModulesParallaxMod.ParallaxOptions
import typings.swiper.typesModulesScrollbarMod.ScrollbarOptions
import typings.swiper.typesModulesThumbsMod.ThumbsOptions
import typings.swiper.typesModulesVirtualMod.VirtualOptions
import typings.swiper.typesModulesZoomMod.ZoomOptions
import typings.swiper.typesSharedMod.CSSSelector
import typings.swiper.typesSharedMod.SwiperModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSwiperOptionsMod {
  
  trait SwiperOptions extends StObject {
    
    /**
      * !INTERNAL When enabled will emit "_containerClasses" and "_slideClass" events
      */
    var _emitClasses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with a11y parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   a11y: {
      *     prevSlideMessage: 'Previous slide',
      *     nextSlideMessage: 'Next slide',
      *   },
      * });
      * ```
      */
    var a11y: js.UndefOr[A11yOptions] = js.undefined
    
    /**
      * Set to `false` to disable swiping to next slide direction (to right or bottom)
      *
      * @default true
      */
    var allowSlideNext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` to disable swiping to previous slide direction (to left or top)
      *
      * @default true
      */
    var allowSlidePrev: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `false`, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
      *
      * @default true
      */
    var allowTouchMove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` and slider wrapper will adapt its height to the height of the currently active slide
      *
      * @default false
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with autoplay parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *  autoplay: {
      *    delay: 5000,
      *  },
      *});
      * ```
      */
    var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.undefined
    
    /**
      * Allows to set different parameter for different responsive breakpoints (screen sizes). Not all parameters can be changed in breakpoints, only those which do not require different layout and logic, like `slidesPerView`, `slidesPerGroup`, `spaceBetween`, `grid.rows`. Such parameters like `loop` and `effect` won't work
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   // Default parameters
      *   slidesPerView: 1,
      *   spaceBetween: 10,
      *   // Responsive breakpoints
      *   breakpoints: {
      *     // when window width is >= 320px
      *     320: {
      *       slidesPerView: 2,
      *       spaceBetween: 20
      *     },
      *     // when window width is >= 480px
      *     480: {
      *       slidesPerView: 3,
      *       spaceBetween: 30
      *     },
      *     // when window width is >= 640px
      *     640: {
      *       slidesPerView: 4,
      *       spaceBetween: 40
      *     }
      *   }
      * })
      * ```
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   slidesPerView: 1,
      *   spaceBetween: 10,
      *   // using "ratio" endpoints
      *   breakpoints: {
      *     '@0.75': {
      *       slidesPerView: 2,
      *       spaceBetween: 20,
      *     },
      *     '@1.00': {
      *       slidesPerView: 3,
      *       spaceBetween: 40,
      *     },
      *     '@1.50': {
      *       slidesPerView: 4,
      *       spaceBetween: 50,
      *     },
      *   }
      * });
      * ```
      */
    var breakpoints: js.UndefOr[StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]] = js.undefined
    
    /**
      * Base for breakpoints (beta). Can be `window` or `container`. If set to `window` (by default) then breakpoint keys mean window width. If set to `container` then breakpoint keys treated as swiper container width
      *
      * @default 'window'
      *
      * @note Currently in beta and not supported by Swiper React and Vue components
      */
    var breakpointsBase: js.UndefOr[String] = js.undefined
    
    /**
      * Object with Cards-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'cards',
      *   cardsEffect: {
      *     // ...
      *   },
      * });
      * ```
      */
    var cardsEffect: js.UndefOr[CardsEffectOptions] = js.undefined
    
    /**
      * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used `loop` mode and `grid.rows`
      *
      * @default false
      */
    var centerInsufficientSlides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, then active slide will be centered, not always on the left side.
      *
      * @default false
      */
    var centeredSlides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, then active slide will be centered without adding gaps at the beginning and end of slider.
      * Required `centeredSlides: true`. Not intended to be used with `loop` or `pagination`
      *
      * @default false
      */
    var centeredSlidesBounds: js.UndefOr[Boolean] = js.undefined
    
    // Namespace
    /**
      * The beginning of the modifier CSS class that can be added to swiper container depending on different parameters
      *
      * @default 'swiper-'
      */
    var containerModifierClass: js.UndefOr[String] = js.undefined
    
    /**
      * Object with controller parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   controller: {
      *     inverse: true,
      *   },
      * });
      * ```
      */
    var controller: js.UndefOr[ControllerOptions] = js.undefined
    
    /**
      * Object with Coverflow-effect parameters.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'coverflow',
      *   coverflowEffect: {
      *     rotate: 30,
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.undefined
    
    /**
      * When enabled Swiper will automatically wrap slides with swiper-wrapper element,
      * and will create required elements for navigation, pagination and scrollbar
      * they are enabled (with their respective params object or with boolean `true`))
      *
      * @default false
      */
    var createElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Creative-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'creative',
      *   creativeEffect: {
      *     prev: {
      *       // will set `translateZ(-400px)` on previous slides
      *       translate: [0, 0, -400],
      *     },
      *     next: {
      *       // will set `translateX(100%)` on next slides
      *       translate: ['100%', 0, 0],
      *     },
      *   },
      * });
      * ```
      */
    var creativeEffect: js.UndefOr[CreativeEffectOptions] = js.undefined
    
    /**
      * When enabled it will use modern CSS Scroll Snap API.
      * It doesn't support all of Swiper's features, but potentially should bring a much better performance in simple configurations.
      *
      * This is what is not supported when it is enabled:
      *
      * - Cube effect
      * - `speed` parameter may not have no effect
      * - All transition start/end related events (use `slideChange` instead)
      * - `slidesPerGroup` has limited support
      * - `simulateTouch` doesn't have effect and "dragging" with mouse doesn't work
      * - `resistance` doesn't have any effect
      * - `allowSlidePrev/Next`
      * - `swipeHandler`
      * - `freeMode` and all relevant features
      *
      * In case if you use it with other effects, especially 3D effects, it is required to wrap slide's content with `<div class="swiper-slide-transform">` element. And if you use any custom styles on slides (like background colors, border radius, border, etc.), they should be set on `swiper-slide-transform` element instead.
      *
      * * @example
      * ```html
      * <div class="swiper">
      *   <div class="swiper-wrapper">
      *     <div class="swiper-slide">
      *       <!-- wrap slide content with transform element -->
      *       <div class="swiper-slide">
      *         ... slide content ...
      *       </div>
      *     </div>
      *     ...
      *   </div>
      * </div>
      * <script>
      * const swiper = new Swiper('.swiper', {
      *    effect: 'flip',
      *    cssMode: true,
      *  });
      * </script>
      * ```
      *
      * @default false
      */
    var cssMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Cube-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'cube',
      *   cubeEffect: {
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var cubeEffect: js.UndefOr[CubeEffectOptions] = js.undefined
    
    /**
      * Can be `'horizontal'` or `'vertical'` (for vertical slider).
      *
      * @default 'horizontal'
      */
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Enable to release Swiper events for swipe-back work in app. If set to `'prevent'` then it will prevent system swipe-back navigation instead
      *
      * @default false
      */
    var edgeSwipeDetection: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Area (in px) from left edge of the screen to release touch events for swipe-back in app
      *
      * @default 20
      */
    var edgeSwipeThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Transition effect. Can be `'slide'`, `'fade'`, `'cube'`, `'coverflow'`, `'flip'` or `'creative'`
      *
      * @default 'slide'
      */
    var effect: js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards] = js.undefined
    
    /**
      * Whether Swiper initially enabled. When Swiper is disabled, it will hide all navigation elements and won't respond to any events and interactions
      *
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with Fade-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'fade',
      *   fadeEffect: {
      *     crossFade: true
      *   },
      * });
      * ```
      */
    var fadeEffect: js.UndefOr[FadeEffectOptions] = js.undefined
    
    /**
      * Object with Flip-effect parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   effect: 'flip',
      *   flipEffect: {
      *     slideShadows: false,
      *   },
      * });
      * ```
      */
    var flipEffect: js.UndefOr[FlipEffectOptions] = js.undefined
    
    /**
      * CSS selector for focusable elements. Swiping will be disabled on such elements if they are "focused"
      *
      * @default 'input, select, option, textarea, button, video, label'
      */
    var focusableElements: js.UndefOr[String] = js.undefined
    
    /**
      * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
      *
      * @default true
      */
    var followFinger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables free mode functionality. Object with free mode parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   freeMode: true,
      * });
      *
      * const swiper = new Swiper('.swiper', {
      *   freeMode: {
      *     enabled: true,
      *     sticky: true,
      *   },
      * });
      * ```
      */
    var freeMode: js.UndefOr[FreeModeOptions | Boolean] = js.undefined
    
    /**
      * This option may a little improve desktop usability. If `true`, user will see the "grab" cursor when hover on Swiper
      *
      * @default false
      */
    var grabCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with grid parameters to enable "multirow" slider.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   grid: {
      *     rows: 2,
      *   },
      * });
      * ```
      */
    var grid: js.UndefOr[GridOptions] = js.undefined
    
    /**
      * Enables hash url navigation to for slides.
      * Object with hash navigation parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   hashNavigation: {
      *     replaceState: true,
      *   },
      * });
      * ```
      */
    var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.undefined
    
    /**
      * Swiper height (in px). Parameter allows to force Swiper height.
      * Useful only if you initialize Swiper when it is hidden and in SSR and Test environments for correct Swiper initialization
      *
      * @default null
      *
      * @note Setting this parameter will make Swiper not responsive
      */
    var height: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Enables history push state where every slide will have its own url. In this parameter you have to specify main slides url like `"slides"` and specify every slide url using `data-history` attribute.
      *
      * Object with history navigation parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   history: {
      *     replaceState: true,
      *   },
      * });
      * ```
      *
      * @example
      * ```html
      * <!-- will produce "slides/slide1" url in browser history -->
      * <div class="swiper-slide" data-history="slide1"></div>
      * ```
      */
    var history: js.UndefOr[HistoryOptions | Boolean] = js.undefined
    
    /**
      * Whether Swiper should be initialised automatically when you create an instance.
      * If disabled, then you need to init it manually by calling `swiper.init()`
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
    
    /**
      * Inject text styles to the shadow DOM. Only for usage with Swiper Element
      *
      */
    var injectStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Inject styles `<link>`s to the shadow DOM. Only for usage with Swiper Element
      *
      */
    var injectStylesUrls: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Enables navigation through slides using keyboard. Object with keyboard parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   keyboard: {
      *     enabled: true,
      *     onlyInViewport: false,
      *   },
      * });
      * ```
      */
    var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.undefined
    
    /**
      * Number of next and previous slides to preload. Only applicable if using lazy loading.
      *
      * @default 0
      */
    var lazyPreloadPrevNext: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS class name of lazy preloader
      *
      * @default 'swiper-lazy-preloader'
      */
    var lazyPreloaderClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `false` if you want to disable long swipes
      *
      * @default true
      */
    var longSwipes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
      *
      * @default 300
      */
    var longSwipesMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Ratio to trigger swipe to next/previous slide during long swipes
      *
      * @default 0.5
      */
    var longSwipesRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to `true` to enable continuous loop mode
      *
      * Because of nature of how the loop mode works (it will rearrange slides), total number of slides must be >= slidesPerView * 2
      *
      * @default false
      *
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled then slideNext/Prev will do nothing while slider is animating in loop mode
      *
      * @default true
      */
    var loopPreventsSliding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines how many slides before end/beginning it should rearrange (loop) slides. If not specified, defaults to `slidesPerView`
      *
      * @default null
      */
    var loopedSlides: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If total number of slides less than specified here value, then Swiper will enable `backface-visibility: hidden` on slide elements to reduce visual "flicker" in Safari.
      *
      * @note It is not recommended to enable it on large amount of slides as it will reduce performance
      *
      * @default 10
      */
    var maxBackfaceHiddenSlides: js.UndefOr[Double] = js.undefined
    
    /**
      * Array with Swiper modules
      *
      * @example
      * ```js
      * import Swiper, { Navigation, Pagination } from 'swiper';
      *
      * const swiper = new Swiper('.swiper', {
      *    modules: [ Navigation, Pagination ],
      *  });
      * ```
      */
    var modules: js.UndefOr[js.Array[SwiperModule]] = js.undefined
    
    /**
      * Enables navigation through slides using mouse wheel. Object with mousewheel parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   mousewheel: {
      *     invert: true,
      *   },
      * });
      * ```
      */
    var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.undefined
    
    /**
      * Object with navigation parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   navigation: {
      *     nextEl: '.swiper-button-next',
      *     prevEl: '.swiper-button-prev',
      *   },
      * });
      * ```
      */
    var navigation: js.UndefOr[NavigationOptions | Boolean] = js.undefined
    
    /**
      * Set to `true` on  Swiper for correct touch events interception. Use only on
      * swipers that use same direction as the parent one
      *
      * @default false
      */
    var nested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable/disable swiping on elements matched to class specified in `noSwipingClass`
      *
      * @default true
      */
    var noSwiping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify `noSwiping`'s element css class
      *
      * @default 'swiper-no-swiping'
      */
    var noSwipingClass: js.UndefOr[String] = js.undefined
    
    /**
      * Can be used instead of `noSwipingClass` to specify elements to disable swiping on.
      * For example `'input'` will disable swiping on all inputs
      *
      * @default
      */
    var noSwipingSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Normalize slide index.
      *
      * @default true
      */
    var normalizeSlideIndex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you also need to watch Mutations for Swiper parent elements
      *
      * @default false
      */
    var observeParents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if you also need to watch Mutations for Swiper slide children elements
      *
      * @default false
      */
    var observeSlideChildren: js.UndefOr[Boolean] = js.undefined
    
    // Observer
    /**
      * Set to `true` to enable Mutation Observer on Swiper and its elements. In this case Swiper will be updated (reinitialized) each time if you change its style (like hide/show) or modify its child elements (like adding/removing slides)
      *
      * @default false
      */
    var observer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Register event handlers
      */
    var on: js.UndefOr[eventinkeyofSwiperEventsSActiveIndexChange] = js.undefined
    
    /**
      * Add event listener that will be fired on all events
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *    onAny(eventName, ...args) {
      *      console.log('Event: ', eventName);
      *      console.log('Event data: ', args);
      *    }
      *  });
      * ```
      */
    var onAny: js.UndefOr[
        js.Function1[/* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit], Unit]
      ] = js.undefined
    
    /**
      * When enabled, will swipe slides only forward (one-way) regardless of swipe direction
      *
      * @default false
      */
    var oneWayMovement: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with pagination parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   pagination: {
      *     el: '.swiper-pagination',
      *     type: 'bullets',
      *   },
      * });
      * ```
      */
    var pagination: js.UndefOr[PaginationOptions | Boolean] = js.undefined
    
    /**
      * Object with parallax parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   parallax: true,
      * });
      * ```
      */
    var parallax: js.UndefOr[ParallaxOptions | Boolean] = js.undefined
    
    /**
      * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
      * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
      *
      * @default true
      */
    var passiveListeners: js.UndefOr[Boolean] = js.undefined
    
    // Clicks
    /**
      * Set to `true` to prevent accidental unwanted clicks on links during swiping
      *
      * @default true
      */
    var preventClicks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to stop clicks event propagation on links during swiping
      *
      * @default true
      */
    var preventClicksPropagation: js.UndefOr[Boolean] = js.undefined
    
    // Swiping / No swiping
    /**
      * When enabled it won't allow to change slides by swiping or navigation/pagination buttons during transition
      *
      * @default false
      */
    var preventInteractionOnTransition: js.UndefOr[Boolean] = js.undefined
    
    // Touch Resistance
    /**
      * Set to `false` if you want to disable resistant bounds
      *
      * @default true
      */
    var resistance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option allows you to control resistance ratio
      *
      * @default 0.85
      */
    var resistanceRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * When enabled it will use ResizeObserver (if supported by browser) on swiper container to detect container resize (instead of watching for window resize)
      *
      * @default true
      */
    var resizeObserver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to enable "rewind" mode. When enabled, clicking "next" navigation button (or calling `.slideNext()`) when on last slide will slide back to the first slide. Clicking "prev" navigation button (or calling `.slidePrev()`) when on first slide will slide forward to the last slide.
      *
      * @default false
      *
      * @note Should not be used together with `loop` mode
      */
    var rewind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to round values of slides width and height to prevent blurry texts on usual
      * resolution screens (if you have such)
      *
      * @default false
      */
    var roundLengths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fire Transition/SlideChange/Start/End events on swiper initialization.
      * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
      *
      * @default true
      */
    var runCallbacksOnInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object with scrollbar parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   scrollbar: {
      *     el: '.swiper-scrollbar',
      *     draggable: true,
      *   },
      * });
      * ```
      */
    var scrollbar: js.UndefOr[ScrollbarOptions | Boolean] = js.undefined
    
    /**
      * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
      * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
      *
      * @default false
      */
    var setWrapperSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `false` if you want to disable short swipes
      *
      * @default true
      */
    var shortSwipes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, Swiper will accept mouse events like touch events (click and drag to change slides)
      *
      * @default true
      */
    var simulateTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of currently active slide
      *
      * @default 'swiper-slide-active'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue components
      */
    var slideActiveClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide
      *
      * @default 'swiper-slide'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue components
      */
    var slideClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide which is right after currently active slide
      *
      * @default 'swiper-slide-next'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue
      */
    var slideNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of slide which is right before currently active slide
      *
      * @default 'swiper-slide-prev'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue
      */
    var slidePrevClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `true` and click on any slide will produce transition to this slide
      *
      * @default false
      */
    var slideToClickedSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of currently visible slide
      *
      * @default 'swiper-slide-visible'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue
      */
    var slideVisibleClass: js.UndefOr[String] = js.undefined
    
    /**
      * Add (in px) additional slide offset in the end of the container (after all slides)
      *
      * @default 0
      */
    var slidesOffsetAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Add (in px) additional slide offset in the beginning of the container (before all slides)
      *
      * @default 0
      */
    var slidesOffsetBefore: js.UndefOr[Double] = js.undefined
    
    /**
      * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
      *
      * @default 1
      */
    var slidesPerGroup: js.UndefOr[Double] = js.undefined
    
    /**
      * This param intended to be used only with `slidesPerView: 'auto'` and `slidesPerGroup: 1`. When enabled, it will skip all slides in view on `.slideNext()` & `.slidePrev()` methods calls, on Navigation "buttons" clicks and in autoplay.
      *
      * @default false
      */
    var slidesPerGroupAuto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The parameter works in the following way: If `slidesPerGroupSkip` equals `0` (default), no slides are excluded from grouping, and the resulting behaviour is the same as without this change.
      *
      * If `slidesPerGroupSkip` is equal or greater than `1` the first X slides are treated as single groups, whereas all following slides are grouped by the `slidesPerGroup` value.
      *
      * @default 0
      */
    var slidesPerGroupSkip: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of slides per view (slides visible at the same time on slider's container).
      * @note `slidesPerView: 'auto'` is currently not compatible with multirow mode, when `grid.rows` > 1
      *
      * @default 1
      */
    var slidesPerView: js.UndefOr[Double | auto] = js.undefined
    
    // Slides grid
    /**
      * Distance between slides in px.
      *
      * @default 0
      *
      * @note If you use "margin" css property to the elements which go into Swiper in which you pass "spaceBetween" into, navigation might not work properly.
      */
    var spaceBetween: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Duration of transition between slides (in ms)
      *
      * @default 300
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the container with pagination that will work as only available handler for swiping
      *
      * @default null
      */
    var swipeHandler: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
    
    /**
      * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
      *
      * @default 5
      */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Object with thumbs component parameters
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   ...
      *   thumbs: {
      *     swiper: thumbsSwiper
      *   }
      * });
      * ```
      */
    var thumbs: js.UndefOr[ThumbsOptions] = js.undefined
    
    /**
      * Allowable angle (in degrees) to trigger touch move
      *
      * @default 45
      */
    var touchAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Target element to listen touch events on. Can be `'container'` (to listen for touch events on swiper) or `'wrapper'`
      * (to listen for touch events on swiper-wrapper)
      *
      * @default 'wrapper'
      */
    var touchEventsTarget: js.UndefOr[container | wrapper] = js.undefined
    
    /**
      * If enabled, then propagation of "touchmove" will be stopped
      *
      * @default false
      */
    var touchMoveStopPropagation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Touch ratio
      *
      * @default 1
      */
    var touchRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
      *
      * @default false
      */
    var touchReleaseOnEdges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force to always prevent default for `touchstart` (`pointerdown`) event
      *
      * @default false
      */
    var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If disabled, `pointerdown` event won't be prevented
      *
      * @default true
      */
    var touchStartPreventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled (by default) and navigation elements' parameters passed as a string (like `".pagination"`)
      * then Swiper will look for such elements through child elements first.
      * Applies for pagination, prev/next buttons and scrollbar elements
      *
      * @default true
      */
    var uniqueNavElements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swiper will recalculate slides position on window resize (orientationchange)
      *
      * @default true
      */
    var updateOnWindowResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Required for active slide detection when rendered on server-side and enabled history
      *
      * @default null
      */
    var url: js.UndefOr[String | Null] = js.undefined
    
    /**
      * userAgent string. Required for browser/device detection when rendered on server-side
      *
      * @default null
      */
    var userAgent: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Enables virtual slides functionality. Object with virtual slides parameters or boolean `true` to enable with default settings.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   virtual: {
      *     slides: ['Slide 1', 'Slide 2', 'Slide 3', 'Slide 4', 'Slide 5'],
      *   },
      * });
      * ```
      */
    var virtual: js.UndefOr[VirtualOptions | Boolean] = js.undefined
    
    /**
      * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
      * Useful when you may need to create custom slide transition
      *
      * @default false
      */
    var virtualTranslate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled Swiper will be disabled and hide navigation buttons on
      * case there are not enough slides for sliding.
      *
      * @default true
      */
    var watchOverflow: js.UndefOr[Boolean] = js.undefined
    
    // Progress
    /**
      * Enable this feature to calculate each slides progress and visibility (slides in viewport will have additional visible class)
      *
      * @default false
      */
    var watchSlidesProgress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swiper width (in px). Parameter allows to force Swiper width.
      * Useful only if you initialize Swiper when it is hidden and in SSR and Test environments for correct Swiper initialization
      *
      * @default null
      *
      * @note Setting this parameter will make Swiper not responsive
      */
    var width: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * CSS class name of slides' wrapper
      *
      * @default 'swiper-wrapper'
      *
      * @note By changing classes you will also need to change Swiper's CSS to reflect changed classes
      *
      * @note Not supported in Swiper React/Vue
      *
      */
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    /**
      * Enables zooming functionality. Object with zoom parameters or boolean `true` to enable with default settings
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   zoom: {
      *     maxRatio: 5,
      *   },
      * });
      * ```
      */
    var zoom: js.UndefOr[ZoomOptions | Boolean] = js.undefined
  }
  object SwiperOptions {
    
    inline def apply(): SwiperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwiperOptions] (val x: Self) extends AnyVal {
      
      inline def setA11y(value: A11yOptions): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
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
      
      inline def setBreakpoints(value: StringDictionary[SwiperOptions] & NumberDictionary[SwiperOptions]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsBase(value: String): Self = StObject.set(x, "breakpointsBase", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsBaseUndefined: Self = StObject.set(x, "breakpointsBase", js.undefined)
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setCardsEffect(value: CardsEffectOptions): Self = StObject.set(x, "cardsEffect", value.asInstanceOf[js.Any])
      
      inline def setCardsEffectUndefined: Self = StObject.set(x, "cardsEffect", js.undefined)
      
      inline def setCenterInsufficientSlides(value: Boolean): Self = StObject.set(x, "centerInsufficientSlides", value.asInstanceOf[js.Any])
      
      inline def setCenterInsufficientSlidesUndefined: Self = StObject.set(x, "centerInsufficientSlides", js.undefined)
      
      inline def setCenteredSlides(value: Boolean): Self = StObject.set(x, "centeredSlides", value.asInstanceOf[js.Any])
      
      inline def setCenteredSlidesBounds(value: Boolean): Self = StObject.set(x, "centeredSlidesBounds", value.asInstanceOf[js.Any])
      
      inline def setCenteredSlidesBoundsUndefined: Self = StObject.set(x, "centeredSlidesBounds", js.undefined)
      
      inline def setCenteredSlidesUndefined: Self = StObject.set(x, "centeredSlides", js.undefined)
      
      inline def setContainerModifierClass(value: String): Self = StObject.set(x, "containerModifierClass", value.asInstanceOf[js.Any])
      
      inline def setContainerModifierClassUndefined: Self = StObject.set(x, "containerModifierClass", js.undefined)
      
      inline def setController(value: ControllerOptions): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setCoverflowEffect(value: CoverflowEffectOptions): Self = StObject.set(x, "coverflowEffect", value.asInstanceOf[js.Any])
      
      inline def setCoverflowEffectUndefined: Self = StObject.set(x, "coverflowEffect", js.undefined)
      
      inline def setCreateElements(value: Boolean): Self = StObject.set(x, "createElements", value.asInstanceOf[js.Any])
      
      inline def setCreateElementsUndefined: Self = StObject.set(x, "createElements", js.undefined)
      
      inline def setCreativeEffect(value: CreativeEffectOptions): Self = StObject.set(x, "creativeEffect", value.asInstanceOf[js.Any])
      
      inline def setCreativeEffectUndefined: Self = StObject.set(x, "creativeEffect", js.undefined)
      
      inline def setCssMode(value: Boolean): Self = StObject.set(x, "cssMode", value.asInstanceOf[js.Any])
      
      inline def setCssModeUndefined: Self = StObject.set(x, "cssMode", js.undefined)
      
      inline def setCubeEffect(value: CubeEffectOptions): Self = StObject.set(x, "cubeEffect", value.asInstanceOf[js.Any])
      
      inline def setCubeEffectUndefined: Self = StObject.set(x, "cubeEffect", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEdgeSwipeDetection(value: Boolean | String): Self = StObject.set(x, "edgeSwipeDetection", value.asInstanceOf[js.Any])
      
      inline def setEdgeSwipeDetectionUndefined: Self = StObject.set(x, "edgeSwipeDetection", js.undefined)
      
      inline def setEdgeSwipeThreshold(value: Double): Self = StObject.set(x, "edgeSwipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setEdgeSwipeThresholdUndefined: Self = StObject.set(x, "edgeSwipeThreshold", js.undefined)
      
      inline def setEffect(value: slide | fade | cube | coverflow | flip | creative | cards): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFadeEffect(value: FadeEffectOptions): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
      
      inline def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
      
      inline def setFlipEffect(value: FlipEffectOptions): Self = StObject.set(x, "flipEffect", value.asInstanceOf[js.Any])
      
      inline def setFlipEffectUndefined: Self = StObject.set(x, "flipEffect", js.undefined)
      
      inline def setFocusableElements(value: String): Self = StObject.set(x, "focusableElements", value.asInstanceOf[js.Any])
      
      inline def setFocusableElementsUndefined: Self = StObject.set(x, "focusableElements", js.undefined)
      
      inline def setFollowFinger(value: Boolean): Self = StObject.set(x, "followFinger", value.asInstanceOf[js.Any])
      
      inline def setFollowFingerUndefined: Self = StObject.set(x, "followFinger", js.undefined)
      
      inline def setFreeMode(value: FreeModeOptions | Boolean): Self = StObject.set(x, "freeMode", value.asInstanceOf[js.Any])
      
      inline def setFreeModeUndefined: Self = StObject.set(x, "freeMode", js.undefined)
      
      inline def setGrabCursor(value: Boolean): Self = StObject.set(x, "grabCursor", value.asInstanceOf[js.Any])
      
      inline def setGrabCursorUndefined: Self = StObject.set(x, "grabCursor", js.undefined)
      
      inline def setGrid(value: GridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHashNavigation(value: HashNavigationOptions | Boolean): Self = StObject.set(x, "hashNavigation", value.asInstanceOf[js.Any])
      
      inline def setHashNavigationUndefined: Self = StObject.set(x, "hashNavigation", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHistory(value: HistoryOptions | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
      
      inline def setInjectStyles(value: js.Array[String]): Self = StObject.set(x, "injectStyles", value.asInstanceOf[js.Any])
      
      inline def setInjectStylesUndefined: Self = StObject.set(x, "injectStyles", js.undefined)
      
      inline def setInjectStylesUrls(value: js.Array[String]): Self = StObject.set(x, "injectStylesUrls", value.asInstanceOf[js.Any])
      
      inline def setInjectStylesUrlsUndefined: Self = StObject.set(x, "injectStylesUrls", js.undefined)
      
      inline def setInjectStylesUrlsVarargs(value: String*): Self = StObject.set(x, "injectStylesUrls", js.Array(value*))
      
      inline def setInjectStylesVarargs(value: String*): Self = StObject.set(x, "injectStyles", js.Array(value*))
      
      inline def setKeyboard(value: KeyboardOptions | Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLazyPreloadPrevNext(value: Double): Self = StObject.set(x, "lazyPreloadPrevNext", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloadPrevNextUndefined: Self = StObject.set(x, "lazyPreloadPrevNext", js.undefined)
      
      inline def setLazyPreloaderClass(value: String): Self = StObject.set(x, "lazyPreloaderClass", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloaderClassUndefined: Self = StObject.set(x, "lazyPreloaderClass", js.undefined)
      
      inline def setLongSwipes(value: Boolean): Self = StObject.set(x, "longSwipes", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesMs(value: Double): Self = StObject.set(x, "longSwipesMs", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesMsUndefined: Self = StObject.set(x, "longSwipesMs", js.undefined)
      
      inline def setLongSwipesRatio(value: Double): Self = StObject.set(x, "longSwipesRatio", value.asInstanceOf[js.Any])
      
      inline def setLongSwipesRatioUndefined: Self = StObject.set(x, "longSwipesRatio", js.undefined)
      
      inline def setLongSwipesUndefined: Self = StObject.set(x, "longSwipes", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopPreventsSliding(value: Boolean): Self = StObject.set(x, "loopPreventsSliding", value.asInstanceOf[js.Any])
      
      inline def setLoopPreventsSlidingUndefined: Self = StObject.set(x, "loopPreventsSliding", js.undefined)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLoopedSlides(value: Double): Self = StObject.set(x, "loopedSlides", value.asInstanceOf[js.Any])
      
      inline def setLoopedSlidesNull: Self = StObject.set(x, "loopedSlides", null)
      
      inline def setLoopedSlidesUndefined: Self = StObject.set(x, "loopedSlides", js.undefined)
      
      inline def setMaxBackfaceHiddenSlides(value: Double): Self = StObject.set(x, "maxBackfaceHiddenSlides", value.asInstanceOf[js.Any])
      
      inline def setMaxBackfaceHiddenSlidesUndefined: Self = StObject.set(x, "maxBackfaceHiddenSlides", js.undefined)
      
      inline def setModules(value: js.Array[SwiperModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: SwiperModule*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setMousewheel(value: MousewheelOptions | Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
      
      inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
      
      inline def setNavigation(value: NavigationOptions | Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
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
      
      inline def setOn(value: eventinkeyofSwiperEventsSActiveIndexChange): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnAny(value: /* handler */ js.Function2[/* eventName */ String, /* repeated */ Any, Unit] => Unit): Self = StObject.set(x, "onAny", js.Any.fromFunction1(value))
      
      inline def setOnAnyUndefined: Self = StObject.set(x, "onAny", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOneWayMovement(value: Boolean): Self = StObject.set(x, "oneWayMovement", value.asInstanceOf[js.Any])
      
      inline def setOneWayMovementUndefined: Self = StObject.set(x, "oneWayMovement", js.undefined)
      
      inline def setPagination(value: PaginationOptions | Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setParallax(value: ParallaxOptions | Boolean): Self = StObject.set(x, "parallax", value.asInstanceOf[js.Any])
      
      inline def setParallaxUndefined: Self = StObject.set(x, "parallax", js.undefined)
      
      inline def setPassiveListeners(value: Boolean): Self = StObject.set(x, "passiveListeners", value.asInstanceOf[js.Any])
      
      inline def setPassiveListenersUndefined: Self = StObject.set(x, "passiveListeners", js.undefined)
      
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
      
      inline def setResizeObserver(value: Boolean): Self = StObject.set(x, "resizeObserver", value.asInstanceOf[js.Any])
      
      inline def setResizeObserverUndefined: Self = StObject.set(x, "resizeObserver", js.undefined)
      
      inline def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      inline def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      inline def setRoundLengths(value: Boolean): Self = StObject.set(x, "roundLengths", value.asInstanceOf[js.Any])
      
      inline def setRoundLengthsUndefined: Self = StObject.set(x, "roundLengths", js.undefined)
      
      inline def setRunCallbacksOnInit(value: Boolean): Self = StObject.set(x, "runCallbacksOnInit", value.asInstanceOf[js.Any])
      
      inline def setRunCallbacksOnInitUndefined: Self = StObject.set(x, "runCallbacksOnInit", js.undefined)
      
      inline def setScrollbar(value: ScrollbarOptions | Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
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
      
      inline def setSlidesPerGroup(value: Double): Self = StObject.set(x, "slidesPerGroup", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupAuto(value: Boolean): Self = StObject.set(x, "slidesPerGroupAuto", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupAutoUndefined: Self = StObject.set(x, "slidesPerGroupAuto", js.undefined)
      
      inline def setSlidesPerGroupSkip(value: Double): Self = StObject.set(x, "slidesPerGroupSkip", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerGroupSkipUndefined: Self = StObject.set(x, "slidesPerGroupSkip", js.undefined)
      
      inline def setSlidesPerGroupUndefined: Self = StObject.set(x, "slidesPerGroup", js.undefined)
      
      inline def setSlidesPerView(value: Double | auto): Self = StObject.set(x, "slidesPerView", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerViewUndefined: Self = StObject.set(x, "slidesPerView", js.undefined)
      
      inline def setSpaceBetween(value: Double | String): Self = StObject.set(x, "spaceBetween", value.asInstanceOf[js.Any])
      
      inline def setSpaceBetweenUndefined: Self = StObject.set(x, "spaceBetween", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSwipeHandler(value: CSSSelector | HTMLElement): Self = StObject.set(x, "swipeHandler", value.asInstanceOf[js.Any])
      
      inline def setSwipeHandlerNull: Self = StObject.set(x, "swipeHandler", null)
      
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
      
      inline def setUpdateOnWindowResize(value: Boolean): Self = StObject.set(x, "updateOnWindowResize", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnWindowResizeUndefined: Self = StObject.set(x, "updateOnWindowResize", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVirtual(value: VirtualOptions | Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualTranslate(value: Boolean): Self = StObject.set(x, "virtualTranslate", value.asInstanceOf[js.Any])
      
      inline def setVirtualTranslateUndefined: Self = StObject.set(x, "virtualTranslate", js.undefined)
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
      
      inline def setWatchOverflow(value: Boolean): Self = StObject.set(x, "watchOverflow", value.asInstanceOf[js.Any])
      
      inline def setWatchOverflowUndefined: Self = StObject.set(x, "watchOverflow", js.undefined)
      
      inline def setWatchSlidesProgress(value: Boolean): Self = StObject.set(x, "watchSlidesProgress", value.asInstanceOf[js.Any])
      
      inline def setWatchSlidesProgressUndefined: Self = StObject.set(x, "watchSlidesProgress", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
      
      inline def setZoom(value: ZoomOptions | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def set_emitClasses(value: Boolean): Self = StObject.set(x, "_emitClasses", value.asInstanceOf[js.Any])
      
      inline def set_emitClassesUndefined: Self = StObject.set(x, "_emitClasses", js.undefined)
    }
  }
}
