package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsOptions extends js.Object {
  /**
    * Triggered right beforey Swiper destoryed
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when user click/tap on Swiper after 300ms delay. Receives 'touchend' event as an arguments.
    */
  var click: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user double tap on Swiper's container. Receives 'touchend' event as an arguments
    */
  var doubleTap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when Swiper goes from beginning or end position
    */
  var fromEdge: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: js.UndefOr[js.Function0[_]] = js.undefined
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
  var init: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when Swiper progress is changed, as an arguments it receives
    * progress that is always from 0 to 1
    */
  var progress: js.UndefOr[js.Function1[/* progress */ js.Any, _]] = js.undefined
  /**
    * Triggered when Swiper reach its beginning (initial position)
    */
  var reachBeginning: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when Swiper reach last slide
    */
  var reachEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered on window resize right before swiper's onresize manipulation
    */
  var resize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered everytime when swiper starts animation.
    * Receives current transition duration (in ms) as an arguments,
    */
  var setTransition: js.UndefOr[js.Function1[/* transition */ js.Any, _]] = js.undefined
  /**
    * Triggered when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: js.UndefOr[js.Function1[/* translate */ js.Any, _]] = js.undefined
  /**
    * Triggered when currently active slide is changed
    */
  var slideChange: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when user touch and move finger over Swiper and move it.
    * Receives 'touchmove' event as an arguments.
    */
  var sliderMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user click/tap on Swiper. Receives 'touchend' event as an arguments.
    */
  var tap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user release Swiper. Receives 'touchend' event as an arguments.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user touch and move finger over Swiper. Receives 'touchmove' event as an arguments.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Fired when user touch and move finger over
    * Swiper in direction opposite to direction parameter.
    * Receives 'touchmove' event as an arguments.
    */
  var touchMoveOpposite: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user touch Swiper. Receives 'touchstart' event as an arguments.
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered after transition.
    */
  var transitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered in the beginning of transition.
    */
  var transitionStart: js.UndefOr[js.Function0[_]] = js.undefined
}

object EventsOptions {
  @scala.inline
  def apply(
    beforeDestroy: js.Function0[_] = null,
    click: js.Function1[/* event */ js.Any, _] = null,
    doubleTap: js.Function1[/* event */ js.Any, _] = null,
    fromEdge: js.Function0[_] = null,
    imagesReady: js.Function0[_] = null,
    init: js.Function0[_] = null,
    progress: js.Function1[/* progress */ js.Any, _] = null,
    reachBeginning: js.Function0[_] = null,
    reachEnd: js.Function0[_] = null,
    resize: js.Function0[_] = null,
    setTransition: js.Function1[/* transition */ js.Any, _] = null,
    setTranslate: js.Function1[/* translate */ js.Any, _] = null,
    slideChange: js.Function0[_] = null,
    slideChangeTransitionEnd: js.Function0[_] = null,
    slideChangeTransitionStart: js.Function0[_] = null,
    slideNextTransitionEnd: js.Function0[_] = null,
    slideNextTransitionStart: js.Function0[_] = null,
    slidePrevTransitionEnd: js.Function0[_] = null,
    slidePrevTransitionStart: js.Function0[_] = null,
    sliderMove: js.Function1[/* event */ js.Any, _] = null,
    tap: js.Function1[/* event */ js.Any, _] = null,
    touchEnd: js.Function1[/* event */ js.Any, _] = null,
    touchMove: js.Function1[/* event */ js.Any, _] = null,
    touchMoveOpposite: js.Function1[/* event */ js.Any, _] = null,
    touchStart: js.Function1[/* event */ js.Any, _] = null,
    transitionEnd: js.Function0[_] = null,
    transitionStart: js.Function0[_] = null
  ): EventsOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (click != null) __obj.updateDynamic("click")(click)
    if (doubleTap != null) __obj.updateDynamic("doubleTap")(doubleTap)
    if (fromEdge != null) __obj.updateDynamic("fromEdge")(fromEdge)
    if (imagesReady != null) __obj.updateDynamic("imagesReady")(imagesReady)
    if (init != null) __obj.updateDynamic("init")(init)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (reachBeginning != null) __obj.updateDynamic("reachBeginning")(reachBeginning)
    if (reachEnd != null) __obj.updateDynamic("reachEnd")(reachEnd)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (setTransition != null) __obj.updateDynamic("setTransition")(setTransition)
    if (setTranslate != null) __obj.updateDynamic("setTranslate")(setTranslate)
    if (slideChange != null) __obj.updateDynamic("slideChange")(slideChange)
    if (slideChangeTransitionEnd != null) __obj.updateDynamic("slideChangeTransitionEnd")(slideChangeTransitionEnd)
    if (slideChangeTransitionStart != null) __obj.updateDynamic("slideChangeTransitionStart")(slideChangeTransitionStart)
    if (slideNextTransitionEnd != null) __obj.updateDynamic("slideNextTransitionEnd")(slideNextTransitionEnd)
    if (slideNextTransitionStart != null) __obj.updateDynamic("slideNextTransitionStart")(slideNextTransitionStart)
    if (slidePrevTransitionEnd != null) __obj.updateDynamic("slidePrevTransitionEnd")(slidePrevTransitionEnd)
    if (slidePrevTransitionStart != null) __obj.updateDynamic("slidePrevTransitionStart")(slidePrevTransitionStart)
    if (sliderMove != null) __obj.updateDynamic("sliderMove")(sliderMove)
    if (tap != null) __obj.updateDynamic("tap")(tap)
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(touchEnd)
    if (touchMove != null) __obj.updateDynamic("touchMove")(touchMove)
    if (touchMoveOpposite != null) __obj.updateDynamic("touchMoveOpposite")(touchMoveOpposite)
    if (touchStart != null) __obj.updateDynamic("touchStart")(touchStart)
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(transitionEnd)
    if (transitionStart != null) __obj.updateDynamic("transitionStart")(transitionStart)
    __obj.asInstanceOf[EventsOptions]
  }
}

