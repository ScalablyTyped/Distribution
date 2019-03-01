package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerOptions extends js.Object {
  /**
    * Can be 'slide' or 'container'. Defines a way how to control another slider: slide by slide
    * (with respect to other slider's grid) or depending on all slides/container
    * (depending on total slider percentage).
    *
    * @default 'slide'
    */
  var by: js.UndefOr[swiperLib.swiperLibStrings.slide | swiperLib.swiperLibStrings.container] = js.undefined
  /**
    * Pass here another Swiper instance or array with Swiper instances that should be controlled
    * by this Swiper
    */
  var control: js.UndefOr[Swiper] = js.undefined
  /**
    * Set to true and controlling will be in inverse direction
    *
    * @default false
    */
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
}

object ControllerOptions {
  @scala.inline
  def apply(
    by: swiperLib.swiperLibStrings.slide | swiperLib.swiperLibStrings.container = null,
    control: Swiper = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined
  ): ControllerOptions = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    __obj.asInstanceOf[ControllerOptions]
  }
}

