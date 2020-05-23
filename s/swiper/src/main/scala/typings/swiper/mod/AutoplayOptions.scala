package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoplayOptions extends js.Object {
  /**
    * Delay between transitions (in ms). If this parameter is not specified, auto play will be disabled
    *
    * If you need to specify different delay for specifi slides you can do it by using
    * data-swiper-autoplay (in ms) attribute on slide.
    *
    * @example
    * <!-- hold this slide for 2 seconds -->
    * <div class="swiper-slide" data-swiper-autoplay="2000">
    *
    * @default 3000
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Set to false and autoplay will not be disabled after
    * user interactions (swipes), it will be restarted
    * every time after interaction
    *
    * @default true
    */
  var disableOnInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables autoplay in reverse direction
    *
    * @default false
    */
  var reverseDirection: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable this parameter and autoplay will be stopped when it reaches last slide (has no effect in loop mode)
    *
    * @default false
    */
  var stopOnLastSlide: js.UndefOr[Boolean] = js.undefined
  /**
    * When enabled autoplay will wait for wrapper transition to continue.
    * Can be disabled in case of using Virtual Translate when your
    * slider may not have transition
    *
    * @default true
    */
  var waitForTransition: js.UndefOr[Boolean] = js.undefined
}

object AutoplayOptions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    disableOnInteraction: js.UndefOr[Boolean] = js.undefined,
    reverseDirection: js.UndefOr[Boolean] = js.undefined,
    stopOnLastSlide: js.UndefOr[Boolean] = js.undefined,
    waitForTransition: js.UndefOr[Boolean] = js.undefined
  ): AutoplayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOnInteraction)) __obj.updateDynamic("disableOnInteraction")(disableOnInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseDirection)) __obj.updateDynamic("reverseDirection")(reverseDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnLastSlide)) __obj.updateDynamic("stopOnLastSlide")(stopOnLastSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForTransition)) __obj.updateDynamic("waitForTransition")(waitForTransition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoplayOptions]
  }
}

