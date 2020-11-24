package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsOptions extends js.Object {
  
  /**
    * Triggered right beforey Swiper destoryed
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Event will be fired right before "loop fix"
    */
  var beforeLoopFix: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered when user click/tap on Swiper after 300ms delay. Receives 'touchend' event as an arguments.
    */
  var click: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when user double tap on Swiper's container. Receives 'touchend' event as an arguments
    */
  var doubleTap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when Swiper goes from beginning or end position
    */
  var fromEdge: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: js.UndefOr[js.Function0[_]] = js.native
  
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
  var init: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Event will be fired after "loop fix"
    */
  var loopFix: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Event will be fired if observer is enabled and it detects DOM mutations
    */
  var observerUpdate: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered when Swiper progress is changed, as an arguments it receives
    * progress that is always from 0 to 1
    */
  var progress: js.UndefOr[js.Function1[/* progress */ js.Any, _]] = js.native
  
  /**
    * Triggered when Swiper reach its beginning (initial position)
    */
  var reachBeginning: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered when Swiper reach last slide
    */
  var reachEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered on window resize right before swiper's onresize manipulation
    */
  var resize: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered everytime when swiper starts animation.
    * Receives current transition duration (in ms) as an arguments,
    */
  var setTransition: js.UndefOr[js.Function1[/* transition */ js.Any, _]] = js.native
  
  /**
    * Triggered when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: js.UndefOr[js.Function1[/* translate */ js.Any, _]] = js.native
  
  /**
    * Triggered when currently active slide is changed
    */
  var slideChange: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered when user touch and move finger over Swiper and move it.
    * Receives 'touchmove' event as an arguments.
    */
  var sliderMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when user click/tap on Swiper. Receives 'touchend' event as an arguments.
    */
  var tap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when user release Swiper. Receives 'touchend' event as an arguments.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when user touch and move finger over Swiper. Receives 'touchmove' event as an arguments.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Fired when user touch and move finger over
    * Swiper in direction opposite to direction parameter.
    * Receives 'touchmove' event as an arguments.
    */
  var touchMoveOpposite: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered when user touch Swiper. Receives 'touchstart' event as an arguments.
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  /**
    * Triggered after transition.
    */
  var transitionEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Triggered in the beginning of transition.
    */
  var transitionStart: js.UndefOr[js.Function0[_]] = js.native
}
object EventsOptions {
  
  @scala.inline
  def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  
  @scala.inline
  implicit class EventsOptionsOps[Self <: EventsOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeDestroy(value: () => _): Self = this.set("beforeDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeLoopFix(value: () => _): Self = this.set("beforeLoopFix", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeLoopFix: Self = this.set("beforeLoopFix", js.undefined)
    
    @scala.inline
    def setClick(value: /* event */ js.Any => _): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDoubleTap(value: /* event */ js.Any => _): Self = this.set("doubleTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDoubleTap: Self = this.set("doubleTap", js.undefined)
    
    @scala.inline
    def setFromEdge(value: () => _): Self = this.set("fromEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFromEdge: Self = this.set("fromEdge", js.undefined)
    
    @scala.inline
    def setImagesReady(value: () => _): Self = this.set("imagesReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteImagesReady: Self = this.set("imagesReady", js.undefined)
    
    @scala.inline
    def setInit(value: () => _): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLoopFix(value: () => _): Self = this.set("loopFix", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLoopFix: Self = this.set("loopFix", js.undefined)
    
    @scala.inline
    def setObserverUpdate(value: () => _): Self = this.set("observerUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteObserverUpdate: Self = this.set("observerUpdate", js.undefined)
    
    @scala.inline
    def setProgress(value: /* progress */ js.Any => _): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setReachBeginning(value: () => _): Self = this.set("reachBeginning", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReachBeginning: Self = this.set("reachBeginning", js.undefined)
    
    @scala.inline
    def setReachEnd(value: () => _): Self = this.set("reachEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReachEnd: Self = this.set("reachEnd", js.undefined)
    
    @scala.inline
    def setResize(value: () => _): Self = this.set("resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSetTransition(value: /* transition */ js.Any => _): Self = this.set("setTransition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTransition: Self = this.set("setTransition", js.undefined)
    
    @scala.inline
    def setSetTranslate(value: /* translate */ js.Any => _): Self = this.set("setTranslate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTranslate: Self = this.set("setTranslate", js.undefined)
    
    @scala.inline
    def setSlideChange(value: () => _): Self = this.set("slideChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChange: Self = this.set("slideChange", js.undefined)
    
    @scala.inline
    def setSlideChangeTransitionEnd(value: () => _): Self = this.set("slideChangeTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChangeTransitionEnd: Self = this.set("slideChangeTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlideChangeTransitionStart(value: () => _): Self = this.set("slideChangeTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideChangeTransitionStart: Self = this.set("slideChangeTransitionStart", js.undefined)
    
    @scala.inline
    def setSlideNextTransitionEnd(value: () => _): Self = this.set("slideNextTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideNextTransitionEnd: Self = this.set("slideNextTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlideNextTransitionStart(value: () => _): Self = this.set("slideNextTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideNextTransitionStart: Self = this.set("slideNextTransitionStart", js.undefined)
    
    @scala.inline
    def setSlidePrevTransitionEnd(value: () => _): Self = this.set("slidePrevTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlidePrevTransitionEnd: Self = this.set("slidePrevTransitionEnd", js.undefined)
    
    @scala.inline
    def setSlidePrevTransitionStart(value: () => _): Self = this.set("slidePrevTransitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlidePrevTransitionStart: Self = this.set("slidePrevTransitionStart", js.undefined)
    
    @scala.inline
    def setSliderMove(value: /* event */ js.Any => _): Self = this.set("sliderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSliderMove: Self = this.set("sliderMove", js.undefined)
    
    @scala.inline
    def setTap(value: /* event */ js.Any => _): Self = this.set("tap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    
    @scala.inline
    def setTouchEnd(value: /* event */ js.Any => _): Self = this.set("touchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTouchEnd: Self = this.set("touchEnd", js.undefined)
    
    @scala.inline
    def setTouchMove(value: /* event */ js.Any => _): Self = this.set("touchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTouchMove: Self = this.set("touchMove", js.undefined)
    
    @scala.inline
    def setTouchMoveOpposite(value: /* event */ js.Any => _): Self = this.set("touchMoveOpposite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTouchMoveOpposite: Self = this.set("touchMoveOpposite", js.undefined)
    
    @scala.inline
    def setTouchStart(value: /* event */ js.Any => _): Self = this.set("touchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTouchStart: Self = this.set("touchStart", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: () => _): Self = this.set("transitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTransitionEnd: Self = this.set("transitionEnd", js.undefined)
    
    @scala.inline
    def setTransitionStart(value: () => _): Self = this.set("transitionStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTransitionStart: Self = this.set("transitionStart", js.undefined)
  }
}
