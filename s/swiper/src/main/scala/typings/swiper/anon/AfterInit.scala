package typings.swiper.anon

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import typings.swiper.typesMod.Swiper
import typings.swiper.typesSwiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterInit extends StObject {
  
  /**
    * !INTERNAL: Event will fired right before breakpoint change
    */
  def _beforeBreakpoint(swiper: Swiper, breakpointParams: SwiperOptions): Unit = js.native
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on swiper container element
    */
  def _containerClasses(swiper: Swiper, classNames: String): Unit = js.native
  
  /**
    * !INTERNAL: Event will be fired on free mode touch end (release) and there will no be momentum
    */
  def _freeModeNoMomentumRelease(swiper: Swiper): Unit = js.native
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on swiper slide element
    */
  def _slideClass(swiper: Swiper, slideEl: HTMLElement, classNames: String): Unit = js.native
  
  /**
    * !INTERNAL: Event will fired after setting CSS classes on all swiper slides
    */
  def _slideClasses(swiper: Swiper, slides: js.Array[ClassNames]): Unit = js.native
  
  /**
    * !INTERNAL: Event will fired as soon as swiper instance available (before init)
    */
  def _swiper(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired on active index change
    */
  def activeIndexChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired right after initialization
    */
  def afterInit(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when slide changed with autoplay
    */
  def autoplay(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on autoplay pause (on mouse/pointer enter), when `pauseOnMouseEnter` enabled
    */
  def autoplayPause(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on autoplay resume (on mouse/pointer leave), when `pauseOnMouseEnter` enabled
    */
  def autoplayResume(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired in when autoplay started
    */
  def autoplayStart(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when autoplay stopped
    */
  def autoplayStop(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired right before Swiper destroyed
    */
  def beforeDestroy(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired right before initialization
    */
  def beforeInit(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired right before "loop fix"
    */
  def beforeLoopFix(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired before resize handler
    */
  def beforeResize(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired before slide change transition start
    */
  def beforeSlideChangeStart(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired before transition start
    */
  def beforeTransitionStart(swiper: Swiper, speed: Double, internal: Any): Unit = js.native
  
  /**
    * Event will be fired on breakpoint change
    */
  def breakpoint(swiper: Swiper, breakpointParams: SwiperOptions): Unit = js.native
  
  // what is internal?
  /**
    * Event will fired on direction change
    */
  def changeDirection(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
    */
  def click(swiper: Swiper, event: MouseEvent): Unit = js.native
  def click(swiper: Swiper, event: PointerEvent): Unit = js.native
  def click(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired on swiper destroy
    */
  def destroy(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when user double click/tap on Swiper
    */
  def doubleClick(swiper: Swiper, event: MouseEvent): Unit = js.native
  def doubleClick(swiper: Swiper, event: PointerEvent): Unit = js.native
  def doubleClick(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when user double tap on Swiper's container. Receives `touchend` event as an arguments
    */
  def doubleTap(swiper: Swiper, event: MouseEvent): Unit = js.native
  def doubleTap(swiper: Swiper, event: PointerEvent): Unit = js.native
  def doubleTap(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when Swiper goes from beginning or end position
    */
  def fromEdge(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on window hash change
    */
  def hashChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when swiper updates the hash
    */
  def hashSet(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  def imagesReady(swiper: Swiper): Unit = js.native
  
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
  def init(swiper: Swiper): Any = js.native
  
  /**
    * Event will be fired on key press
    */
  def keyPress(swiper: Swiper, keyCode: String): Unit = js.native
  
  /**
    * Event will be fired in the beginning of lazy loading of image
    */
  def lazyImageLoad(swiper: Swiper, slideEl: HTMLElement, imageEl: HTMLElement): Unit = js.native
  
  /**
    * Event will be fired when lazy loading image will be loaded
    */
  def lazyImageReady(swiper: Swiper, slideEl: HTMLElement, imageEl: HTMLElement): Unit = js.native
  
  /**
    * Event will be fired when swiper is locked (when `watchOverflow` enabled)
    */
  def lock(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired after "loop fix"
    */
  def loopFix(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on momentum bounce
    */
  def momentumBounce(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on navigation hide
    */
  def navigationHide(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on navigation next button click
    */
  def navigationNext(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on navigation prev button click
    */
  def navigationPrev(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on navigation show
    */
  def navigationShow(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired if observer is enabled and it detects DOM mutations
    */
  def observerUpdate(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on orientation change (e.g. landscape -> portrait)
    */
  def orientationchange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on pagination hide
    */
  def paginationHide(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired after pagination rendered
    */
  def paginationRender(swiper: Swiper, paginationEl: HTMLElement): Unit = js.native
  
  /**
    * Event will be fired on pagination show
    */
  def paginationShow(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when pagination updated
    */
  def paginationUpdate(swiper: Swiper, paginationEl: HTMLElement): Unit = js.native
  
  /**
    * Event will be fired when Swiper progress is changed, as an arguments it receives progress that is always from 0 to 1
    */
  def progress(swiper: Swiper, progress: Double): Unit = js.native
  
  /**
    * Event will be fired when Swiper reach its beginning (initial position)
    */
  def reachBeginning(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when Swiper reach last slide
    */
  def reachEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired on real index change
    */
  def realIndexChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on window resize right before swiper's onresize manipulation
    */
  def resize(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on mousewheel scroll
    */
  def scroll(swiper: Swiper, event: WheelEvent): Unit = js.native
  
  /**
    * Event will be fired on draggable scrollbar drag end
    */
  def scrollbarDragEnd(swiper: Swiper, event: MouseEvent): Unit = js.native
  def scrollbarDragEnd(swiper: Swiper, event: PointerEvent): Unit = js.native
  def scrollbarDragEnd(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired on draggable scrollbar drag move
    */
  def scrollbarDragMove(swiper: Swiper, event: MouseEvent): Unit = js.native
  def scrollbarDragMove(swiper: Swiper, event: PointerEvent): Unit = js.native
  def scrollbarDragMove(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired on draggable scrollbar drag start
    */
  def scrollbarDragStart(swiper: Swiper, event: MouseEvent): Unit = js.native
  def scrollbarDragStart(swiper: Swiper, event: PointerEvent): Unit = js.native
  def scrollbarDragStart(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired everytime when swiper starts animation. Receives current transition duration (in ms) as an arguments
    */
  def setTransition(swiper: Swiper, transition: Double): Unit = js.native
  
  /**
    * Event will be fired when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  def setTranslate(swiper: Swiper, translate: Double): Unit = js.native
  
  /**
    * Event will be fired when currently active slide is changed
    */
  def slideChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired after animation to other slide (next or previous).
    */
  def slideChangeTransitionEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired in the beginning of animation to other slide (next or previous).
    */
  def slideChangeTransitionStart(swiper: Swiper): Unit = js.native
  
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  def slideNextTransitionEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  def slideNextTransitionStart(swiper: Swiper): Unit = js.native
  
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  def slidePrevTransitionEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  def slidePrevTransitionStart(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired in the end of animation of resetting slide to current one
    */
  def slideResetTransitionEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired in the beginning of animation of resetting slide to current one
    */
  def slideResetTransitionStart(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired with first touch/drag move
    */
  def sliderFirstMove(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when user touch and move finger over Swiper and move it. Receives `touchmove` event as an arguments.
    */
  def sliderMove(swiper: Swiper, event: MouseEvent): Unit = js.native
  def sliderMove(swiper: Swiper, event: PointerEvent): Unit = js.native
  def sliderMove(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when slides grid has changed
    */
  def slidesGridLengthChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when number of slides has changed
    */
  def slidesLengthChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when snap grid has changed
    */
  def snapGridLengthChange(swiper: Swiper): Unit = js.native
  
  /**
    * Event will fired on snap index change
    */
  def snapIndexChange(swiper: Swiper): Unit = js.native
  
  def swiper(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when user click/tap on Swiper. Receives `touchend` event as an arguments.
    */
  def tap(swiper: Swiper, event: MouseEvent): Unit = js.native
  def tap(swiper: Swiper, event: PointerEvent): Unit = js.native
  def tap(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when Swiper goes to beginning or end position
    */
  def toEdge(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when user release Swiper. Receives `touchend` event as an arguments.
    */
  def touchEnd(swiper: Swiper, event: MouseEvent): Unit = js.native
  def touchEnd(swiper: Swiper, event: PointerEvent): Unit = js.native
  def touchEnd(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when user touch and move finger over Swiper. Receives `touchmove` event as an arguments.
    */
  def touchMove(swiper: Swiper, event: MouseEvent): Unit = js.native
  def touchMove(swiper: Swiper, event: PointerEvent): Unit = js.native
  def touchMove(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when user touch and move finger over Swiper in direction opposite to direction parameter. Receives `touchmove` event as an arguments.
    */
  def touchMoveOpposite(swiper: Swiper, event: MouseEvent): Unit = js.native
  def touchMoveOpposite(swiper: Swiper, event: PointerEvent): Unit = js.native
  def touchMoveOpposite(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired when user touch Swiper. Receives `touchstart` event as an arguments.
    */
  def touchStart(swiper: Swiper, event: MouseEvent): Unit = js.native
  def touchStart(swiper: Swiper, event: PointerEvent): Unit = js.native
  def touchStart(swiper: Swiper, event: TouchEvent): Unit = js.native
  
  /**
    * Event will be fired after transition.
    */
  def transitionEnd(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired in the beginning of transition.
    */
  def transitionStart(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired when swiper is unlocked (when `watchOverflow` enabled)
    */
  def unlock(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired after swiper.update() call
    */
  def update(swiper: Swiper): Unit = js.native
  
  /**
    * Event will be fired on zoom change
    */
  def zoomChange(swiper: Swiper, scale: Double, imageEl: HTMLElement, slideEl: HTMLElement): Unit = js.native
}
