package typings.swiper

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.swiper.anon.ClassNames
import typings.swiper.typesModulesA11yMod.A11yEvents
import typings.swiper.typesModulesAutoplayMod.AutoplayEvents
import typings.swiper.typesModulesControllerMod.ControllerEvents
import typings.swiper.typesModulesEffectCardsMod.CardsEffectEvents
import typings.swiper.typesModulesEffectCoverflowMod.CoverflowEffectEvents
import typings.swiper.typesModulesEffectCreativeMod.CreativeEffectEvents
import typings.swiper.typesModulesEffectCubeMod.CubeEffectEvents
import typings.swiper.typesModulesEffectFadeMod.FadeEffectEvents
import typings.swiper.typesModulesEffectFlipMod.FlipEffectEvents
import typings.swiper.typesModulesFreeModeMod.FreeModeEvents
import typings.swiper.typesModulesHashNavigationMod.HashNavigationEvents
import typings.swiper.typesModulesHistoryMod.HistoryEvents
import typings.swiper.typesModulesKeyboardMod.KeyboardEvents
import typings.swiper.typesModulesLazyMod.LazyEvents
import typings.swiper.typesModulesMousewheelMod.MousewheelEvents
import typings.swiper.typesModulesNavigationMod.NavigationEvents
import typings.swiper.typesModulesPaginationMod.PaginationEvents
import typings.swiper.typesModulesParallaxMod.ParallaxEvents
import typings.swiper.typesModulesScrollbarMod.ScrollbarEvents
import typings.swiper.typesModulesThumbsMod.ThumbsEvents
import typings.swiper.typesModulesVirtualMod.VirtualEvents
import typings.swiper.typesModulesZoomMod.ZoomEvents
import typings.swiper.typesSwiperClassMod.default
import typings.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSwiperEventsMod {
  
  @js.native
  trait SwiperEvents
    extends StObject
       with A11yEvents
       with AutoplayEvents
       with ControllerEvents
       with CoverflowEffectEvents
       with CubeEffectEvents
       with FadeEffectEvents
       with FlipEffectEvents
       with CreativeEffectEvents
       with CardsEffectEvents
       with HashNavigationEvents
       with HistoryEvents
       with KeyboardEvents
       with LazyEvents
       with MousewheelEvents
       with NavigationEvents
       with PaginationEvents
       with ParallaxEvents
       with ScrollbarEvents
       with ThumbsEvents
       with VirtualEvents
       with ZoomEvents
       with FreeModeEvents {
    
    /**
      * !INTERNAL: Event will fired right before breakpoint change
      */
    var _beforeBreakpoint: js.UndefOr[js.Function2[/* swiper */ default, /* breakpointParams */ SwiperOptions, Unit]] = js.native
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper container element
      */
    var _containerClasses: js.UndefOr[js.Function2[/* swiper */ default, /* classNames */ String, Unit]] = js.native
    
    /**
      * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
      */
    var _freeModeNoMomentumRelease: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.native
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
      */
    var _slideClass: js.UndefOr[
        js.Function3[/* swiper */ default, /* slideEl */ HTMLElement, /* classNames */ String, Unit]
      ] = js.native
    
    /**
      * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
      */
    var _slideClasses: js.UndefOr[js.Function2[/* swiper */ default, /* slides */ js.Array[ClassNames], Unit]] = js.native
    
    /**
      * !INTERNAL: Event will fired as soon as swiper instance available (before init)
      */
    var _swiper: js.UndefOr[js.Function1[/* swiper */ default, Unit]] = js.native
    
    /**
      * Event will fired on active index change
      */
    def activeIndexChange(swiper: default): Unit = js.native
    
    /**
      * Event will fired right after initialization
      */
    def afterInit(swiper: default): Unit = js.native
    
    /**
      * Event will be fired right before Swiper destroyed
      */
    def beforeDestroy(swiper: default): Unit = js.native
    
    /**
      * Event will fired right before initialization
      */
    def beforeInit(swiper: default): Unit = js.native
    
    /**
      * Event will be fired right before "loop fix"
      */
    def beforeLoopFix(swiper: default): Unit = js.native
    
    /**
      * Event will fired before resize handler
      */
    def beforeResize(swiper: default): Unit = js.native
    
    /**
      * Event will fired before slide change transition start
      */
    def beforeSlideChangeStart(swiper: default): Unit = js.native
    
    /**
      * Event will fired before transition start
      */
    def beforeTransitionStart(swiper: default, speed: Double, internal: Any): Unit = js.native
    
    /**
      * Event will be fired on breakpoint change
      */
    def breakpoint(swiper: default, breakpointParams: SwiperOptions): Unit = js.native
    
    // what is internal?
    /**
      * Event will fired on direction change
      */
    def changeDirection(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    def click(swiper: default, event: MouseEvent): Unit = js.native
    def click(swiper: default, event: PointerEvent): Unit = js.native
    def click(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired on swiper destroy
      */
    def destroy(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when user double click/tap on Swiper
      */
    def doubleClick(swiper: default, event: MouseEvent): Unit = js.native
    def doubleClick(swiper: default, event: PointerEvent): Unit = js.native
    def doubleClick(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
      */
    def doubleTap(swiper: default, event: MouseEvent): Unit = js.native
    def doubleTap(swiper: default, event: PointerEvent): Unit = js.native
    def doubleTap(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when Swiper goes from beginning or end position
      */
    def fromEdge(swiper: default): Unit = js.native
    
    /**
      * Event will be fired right after all inner images are loaded. updateOnImagesReady should be also enabled
      */
    def imagesReady(swiper: default): Unit = js.native
    
    // CORE_EVENTS_START
    /**
      * Fired right after Swiper initialization.
      * @note Note that with `swiper.on('init')` syntax it will
      * work only in case you set `init: false` parameter.
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   init: false,
      *   // other parameters
      * });
      * swiper.on('init', function() {
      *  // do something
      * });
      * // init Swiper
      * swiper.init();
      * ```
      *
      * @example
      * ```js
      * // Otherwise use it as the parameter:
      * const swiper = new Swiper('.swiper', {
      *   // other parameters
      *   on: {
      *     init: function () {
      *       // do something
      *     },
      *   }
      * });
      * ```
      */
    def init(swiper: default): Any = js.native
    
    /**
      * Event will be fired when swiper is locked (when `watchOverflow` enabled)
      */
    def lock(swiper: default): Unit = js.native
    
    /**
      * Event will be fired after "loop fix"
      */
    def loopFix(swiper: default): Unit = js.native
    
    /**
      * Event will be fired on momentum bounce
      */
    def momentumBounce(swiper: default): Unit = js.native
    
    /**
      * Event will be fired if observer is enabled and it detects DOM mutations
      */
    def observerUpdate(swiper: default): Unit = js.native
    
    /**
      * Event will be fired on orientation change (e.g. landscape -> portrait)
      */
    def orientationchange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
      */
    def progress(swiper: default, progress: Double): Unit = js.native
    
    /**
      * Event will be fired when Swiper reach its beginning (initial position)
      */
    def reachBeginning(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when Swiper reach last slide
      */
    def reachEnd(swiper: default): Unit = js.native
    
    /**
      * Event will fired on real index change
      */
    def realIndexChange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired on window resize right before swiper's onresize manipulation
      */
    def resize(swiper: default): Unit = js.native
    
    /**
      * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
      */
    def setTransition(swiper: default, transition: Double): Unit = js.native
    
    /**
      * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
      */
    def setTranslate(swiper: default, translate: Double): Unit = js.native
    
    /**
      * Event will be fired when currently active slide is changed
      */
    def slideChange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired after animation to other slide (next or previous).
      */
    def slideChangeTransitionEnd(swiper: default): Unit = js.native
    
    /**
      * Event will be fired in the beginning of animation to other slide (next or previous).
      */
    def slideChangeTransitionStart(swiper: default): Unit = js.native
    
    /**
      * Same as "slideChangeTransitionEnd" but for "forward" direction only
      */
    def slideNextTransitionEnd(swiper: default): Unit = js.native
    
    /**
      * Same as "slideChangeTransitionStart" but for "forward" direction only
      */
    def slideNextTransitionStart(swiper: default): Unit = js.native
    
    /**
      * Same as "slideChangeTransitionEnd" but for "backward" direction only
      */
    def slidePrevTransitionEnd(swiper: default): Unit = js.native
    
    /**
      * Same as "slideChangeTransitionStart" but for "backward" direction only
      */
    def slidePrevTransitionStart(swiper: default): Unit = js.native
    
    /**
      * Event will be fired in the end of animation of resetting slide to current one
      */
    def slideResetTransitionEnd(swiper: default): Unit = js.native
    
    /**
      * Event will be fired in the beginning of animation of resetting slide to current one
      */
    def slideResetTransitionStart(swiper: default): Unit = js.native
    
    /**
      * Event will be fired with first touch/drag move
      */
    def sliderFirstMove(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
      */
    def sliderMove(swiper: default, event: MouseEvent): Unit = js.native
    def sliderMove(swiper: default, event: PointerEvent): Unit = js.native
    def sliderMove(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when slides grid has changed
      */
    def slidesGridLengthChange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when number of slides has changed
      */
    def slidesLengthChange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when snap grid has changed
      */
    def snapGridLengthChange(swiper: default): Unit = js.native
    
    /**
      * Event will fired on snap index change
      */
    def snapIndexChange(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
      */
    def tap(swiper: default, event: MouseEvent): Unit = js.native
    def tap(swiper: default, event: PointerEvent): Unit = js.native
    def tap(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when Swiper goes to beginning or end position
      */
    def toEdge(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
      */
    def touchEnd(swiper: default, event: MouseEvent): Unit = js.native
    def touchEnd(swiper: default, event: PointerEvent): Unit = js.native
    def touchEnd(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
      */
    def touchMove(swiper: default, event: MouseEvent): Unit = js.native
    def touchMove(swiper: default, event: PointerEvent): Unit = js.native
    def touchMove(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
      */
    def touchMoveOpposite(swiper: default, event: MouseEvent): Unit = js.native
    def touchMoveOpposite(swiper: default, event: PointerEvent): Unit = js.native
    def touchMoveOpposite(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
      */
    def touchStart(swiper: default, event: MouseEvent): Unit = js.native
    def touchStart(swiper: default, event: PointerEvent): Unit = js.native
    def touchStart(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired after transition.
      */
    def transitionEnd(swiper: default): Unit = js.native
    
    /**
      * Event will be fired in the beginning of transition.
      */
    def transitionStart(swiper: default): Unit = js.native
    
    /**
      * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
      */
    def unlock(swiper: default): Unit = js.native
    
    /**
      * Event will be fired after swiper.update() call
      */
    def update(swiper: default): Unit = js.native
  }
}
