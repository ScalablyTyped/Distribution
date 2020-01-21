package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11yOptions extends js.Object {
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[String] = js.undefined
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[String] = js.undefined
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[String] = js.undefined
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[String] = js.undefined
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[String] = js.undefined
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[String] = js.undefined
}

object A11yOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    firstSlideMessage: String = null,
    lastSlideMessage: String = null,
    nextSlideMessage: String = null,
    notificationClass: String = null,
    paginationBulletMessage: String = null,
    prevSlideMessage: String = null
  ): A11yOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (firstSlideMessage != null) __obj.updateDynamic("firstSlideMessage")(firstSlideMessage.asInstanceOf[js.Any])
    if (lastSlideMessage != null) __obj.updateDynamic("lastSlideMessage")(lastSlideMessage.asInstanceOf[js.Any])
    if (nextSlideMessage != null) __obj.updateDynamic("nextSlideMessage")(nextSlideMessage.asInstanceOf[js.Any])
    if (notificationClass != null) __obj.updateDynamic("notificationClass")(notificationClass.asInstanceOf[js.Any])
    if (paginationBulletMessage != null) __obj.updateDynamic("paginationBulletMessage")(paginationBulletMessage.asInstanceOf[js.Any])
    if (prevSlideMessage != null) __obj.updateDynamic("prevSlideMessage")(prevSlideMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yOptions]
  }
}

