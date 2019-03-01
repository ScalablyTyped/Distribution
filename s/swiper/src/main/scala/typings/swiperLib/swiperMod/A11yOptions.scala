package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11yOptions extends js.Object {
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[java.lang.String] = js.undefined
}

object A11yOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    firstSlideMessage: java.lang.String = null,
    lastSlideMessage: java.lang.String = null,
    nextSlideMessage: java.lang.String = null,
    notificationClass: java.lang.String = null,
    paginationBulletMessage: java.lang.String = null,
    prevSlideMessage: java.lang.String = null
  ): A11yOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (firstSlideMessage != null) __obj.updateDynamic("firstSlideMessage")(firstSlideMessage)
    if (lastSlideMessage != null) __obj.updateDynamic("lastSlideMessage")(lastSlideMessage)
    if (nextSlideMessage != null) __obj.updateDynamic("nextSlideMessage")(nextSlideMessage)
    if (notificationClass != null) __obj.updateDynamic("notificationClass")(notificationClass)
    if (paginationBulletMessage != null) __obj.updateDynamic("paginationBulletMessage")(paginationBulletMessage)
    if (prevSlideMessage != null) __obj.updateDynamic("prevSlideMessage")(prevSlideMessage)
    __obj.asInstanceOf[A11yOptions]
  }
}

