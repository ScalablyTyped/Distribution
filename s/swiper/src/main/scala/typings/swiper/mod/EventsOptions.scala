package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsOptions extends StObject {
  
  /**
    * Triggered right beforey Swiper destoryed
    */
  var beforeDestroy: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Event will be fired right before "loop fix"
    */
  var beforeLoopFix: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered when user click/tap on Swiper after 300ms delay. Receives 'touchend' event as an arguments.
    */
  var click: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when user double tap on Swiper's container. Receives 'touchend' event as an arguments
    */
  var doubleTap: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when Swiper goes from beginning or end position
    */
  var fromEdge: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Fired right after Swiper initialization.
    * Note that with swiper.on('init') syntax it will
    * work only in case you set init: false parameter.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   init: false,
    *   // other parameters
    * });
    *
    * @example
    * swiper.on('init', function() {
    *  // do something
    * });
    *
    * @example
    * // init Swiper
    * swiper.init();
    *
    * @example
    * // Otherwise use it as the parameter:
    * var swiper = new Swiper('.swiper-container', {
    *   // other parameters
    *   on: {
    *     init: function () {
    *       // do something
    *     },
    *   }
    * });
    */
  var init: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Event will be fired after "loop fix"
    */
  var loopFix: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Event will be fired if observer is enabled and it detects DOM mutations
    */
  var observerUpdate: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered when Swiper progress is changed, as an arguments it receives
    * progress that is always from 0 to 1
    */
  var progress: js.UndefOr[js.Function1[/* progress */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when Swiper reach its beginning (initial position)
    */
  var reachBeginning: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered when Swiper reach last slide
    */
  var reachEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered on window resize right before swiper's onresize manipulation
    */
  var resize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered everytime when swiper starts animation.
    * Receives current transition duration (in ms) as an arguments,
    */
  var setTransition: js.UndefOr[js.Function1[/* transition */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: js.UndefOr[js.Function1[/* translate */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when currently active slide is changed
    */
  var slideChange: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered when user touch and move finger over Swiper and move it.
    * Receives 'touchmove' event as an arguments.
    */
  var sliderMove: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when user click/tap on Swiper. Receives 'touchend' event as an arguments.
    */
  var tap: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when user release Swiper. Receives 'touchend' event as an arguments.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when user touch and move finger over Swiper. Receives 'touchmove' event as an arguments.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Fired when user touch and move finger over
    * Swiper in direction opposite to direction parameter.
    * Receives 'touchmove' event as an arguments.
    */
  var touchMoveOpposite: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered when user touch Swiper. Receives 'touchstart' event as an arguments.
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
  
  /**
    * Triggered after transition.
    */
  var transitionEnd: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * Triggered in the beginning of transition.
    */
  var transitionStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object EventsOptions {
  
  inline def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  
  extension [Self <: EventsOptions](x: Self) {
    
    inline def setBeforeDestroy(value: () => js.Any): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeLoopFix(value: () => js.Any): Self = StObject.set(x, "beforeLoopFix", js.Any.fromFunction0(value))
    
    inline def setBeforeLoopFixUndefined: Self = StObject.set(x, "beforeLoopFix", js.undefined)
    
    inline def setClick(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDoubleTap(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "doubleTap", js.Any.fromFunction1(value))
    
    inline def setDoubleTapUndefined: Self = StObject.set(x, "doubleTap", js.undefined)
    
    inline def setFromEdge(value: () => js.Any): Self = StObject.set(x, "fromEdge", js.Any.fromFunction0(value))
    
    inline def setFromEdgeUndefined: Self = StObject.set(x, "fromEdge", js.undefined)
    
    inline def setImagesReady(value: () => js.Any): Self = StObject.set(x, "imagesReady", js.Any.fromFunction0(value))
    
    inline def setImagesReadyUndefined: Self = StObject.set(x, "imagesReady", js.undefined)
    
    inline def setInit(value: () => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLoopFix(value: () => js.Any): Self = StObject.set(x, "loopFix", js.Any.fromFunction0(value))
    
    inline def setLoopFixUndefined: Self = StObject.set(x, "loopFix", js.undefined)
    
    inline def setObserverUpdate(value: () => js.Any): Self = StObject.set(x, "observerUpdate", js.Any.fromFunction0(value))
    
    inline def setObserverUpdateUndefined: Self = StObject.set(x, "observerUpdate", js.undefined)
    
    inline def setProgress(value: /* progress */ js.Any => js.Any): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReachBeginning(value: () => js.Any): Self = StObject.set(x, "reachBeginning", js.Any.fromFunction0(value))
    
    inline def setReachBeginningUndefined: Self = StObject.set(x, "reachBeginning", js.undefined)
    
    inline def setReachEnd(value: () => js.Any): Self = StObject.set(x, "reachEnd", js.Any.fromFunction0(value))
    
    inline def setReachEndUndefined: Self = StObject.set(x, "reachEnd", js.undefined)
    
    inline def setResize(value: () => js.Any): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setSetTransition(value: /* transition */ js.Any => js.Any): Self = StObject.set(x, "setTransition", js.Any.fromFunction1(value))
    
    inline def setSetTransitionUndefined: Self = StObject.set(x, "setTransition", js.undefined)
    
    inline def setSetTranslate(value: /* translate */ js.Any => js.Any): Self = StObject.set(x, "setTranslate", js.Any.fromFunction1(value))
    
    inline def setSetTranslateUndefined: Self = StObject.set(x, "setTranslate", js.undefined)
    
    inline def setSlideChange(value: () => js.Any): Self = StObject.set(x, "slideChange", js.Any.fromFunction0(value))
    
    inline def setSlideChangeTransitionEnd(value: () => js.Any): Self = StObject.set(x, "slideChangeTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setSlideChangeTransitionEndUndefined: Self = StObject.set(x, "slideChangeTransitionEnd", js.undefined)
    
    inline def setSlideChangeTransitionStart(value: () => js.Any): Self = StObject.set(x, "slideChangeTransitionStart", js.Any.fromFunction0(value))
    
    inline def setSlideChangeTransitionStartUndefined: Self = StObject.set(x, "slideChangeTransitionStart", js.undefined)
    
    inline def setSlideChangeUndefined: Self = StObject.set(x, "slideChange", js.undefined)
    
    inline def setSlideNextTransitionEnd(value: () => js.Any): Self = StObject.set(x, "slideNextTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setSlideNextTransitionEndUndefined: Self = StObject.set(x, "slideNextTransitionEnd", js.undefined)
    
    inline def setSlideNextTransitionStart(value: () => js.Any): Self = StObject.set(x, "slideNextTransitionStart", js.Any.fromFunction0(value))
    
    inline def setSlideNextTransitionStartUndefined: Self = StObject.set(x, "slideNextTransitionStart", js.undefined)
    
    inline def setSlidePrevTransitionEnd(value: () => js.Any): Self = StObject.set(x, "slidePrevTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setSlidePrevTransitionEndUndefined: Self = StObject.set(x, "slidePrevTransitionEnd", js.undefined)
    
    inline def setSlidePrevTransitionStart(value: () => js.Any): Self = StObject.set(x, "slidePrevTransitionStart", js.Any.fromFunction0(value))
    
    inline def setSlidePrevTransitionStartUndefined: Self = StObject.set(x, "slidePrevTransitionStart", js.undefined)
    
    inline def setSliderMove(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "sliderMove", js.Any.fromFunction1(value))
    
    inline def setSliderMoveUndefined: Self = StObject.set(x, "sliderMove", js.undefined)
    
    inline def setTap(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    inline def setTouchEnd(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "touchEnd", js.Any.fromFunction1(value))
    
    inline def setTouchEndUndefined: Self = StObject.set(x, "touchEnd", js.undefined)
    
    inline def setTouchMove(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "touchMove", js.Any.fromFunction1(value))
    
    inline def setTouchMoveOpposite(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "touchMoveOpposite", js.Any.fromFunction1(value))
    
    inline def setTouchMoveOppositeUndefined: Self = StObject.set(x, "touchMoveOpposite", js.undefined)
    
    inline def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
    
    inline def setTouchStart(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "touchStart", js.Any.fromFunction1(value))
    
    inline def setTouchStartUndefined: Self = StObject.set(x, "touchStart", js.undefined)
    
    inline def setTransitionEnd(value: () => js.Any): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction0(value))
    
    inline def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
    
    inline def setTransitionStart(value: () => js.Any): Self = StObject.set(x, "transitionStart", js.Any.fromFunction0(value))
    
    inline def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
  }
}
