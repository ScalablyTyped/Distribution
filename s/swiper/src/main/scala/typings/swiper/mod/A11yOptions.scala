package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yOptions extends js.Object {
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[String] = js.native
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[String] = js.native
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[String] = js.native
}

object A11yOptions {
  @scala.inline
  def apply(): A11yOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yOptions]
  }
  @scala.inline
  implicit class A11yOptionsOps[Self <: A11yOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFirstSlideMessage(value: String): Self = this.set("firstSlideMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSlideMessage: Self = this.set("firstSlideMessage", js.undefined)
    @scala.inline
    def setLastSlideMessage(value: String): Self = this.set("lastSlideMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSlideMessage: Self = this.set("lastSlideMessage", js.undefined)
    @scala.inline
    def setNextSlideMessage(value: String): Self = this.set("nextSlideMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSlideMessage: Self = this.set("nextSlideMessage", js.undefined)
    @scala.inline
    def setNotificationClass(value: String): Self = this.set("notificationClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationClass: Self = this.set("notificationClass", js.undefined)
    @scala.inline
    def setPaginationBulletMessage(value: String): Self = this.set("paginationBulletMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationBulletMessage: Self = this.set("paginationBulletMessage", js.undefined)
    @scala.inline
    def setPrevSlideMessage(value: String): Self = this.set("prevSlideMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevSlideMessage: Self = this.set("prevSlideMessage", js.undefined)
  }
  
}

