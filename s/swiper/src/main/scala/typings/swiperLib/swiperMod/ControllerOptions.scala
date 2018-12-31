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

