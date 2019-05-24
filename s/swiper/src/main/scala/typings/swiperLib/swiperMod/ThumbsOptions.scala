package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbsOptions extends js.Object {
  var slideThumbActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var swiper: js.UndefOr[Swiper] = js.undefined
  var thumbsContainerClass: js.UndefOr[java.lang.String] = js.undefined
}

object ThumbsOptions {
  @scala.inline
  def apply(
    slideThumbActiveClass: java.lang.String = null,
    swiper: Swiper = null,
    thumbsContainerClass: java.lang.String = null
  ): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (slideThumbActiveClass != null) __obj.updateDynamic("slideThumbActiveClass")(slideThumbActiveClass)
    if (swiper != null) __obj.updateDynamic("swiper")(swiper)
    if (thumbsContainerClass != null) __obj.updateDynamic("thumbsContainerClass")(thumbsContainerClass)
    __obj.asInstanceOf[ThumbsOptions]
  }
}

