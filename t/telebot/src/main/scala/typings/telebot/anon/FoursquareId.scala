package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoursquareId extends js.Object {
  var foursquareId: js.UndefOr[String] = js.native
  var notification: js.UndefOr[Boolean] = js.native
  var replyMarkup: js.UndefOr[js.Any] = js.native
  var replyToMessage: js.UndefOr[Double] = js.native
}

object FoursquareId {
  @scala.inline
  def apply(): FoursquareId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoursquareId]
  }
  @scala.inline
  implicit class FoursquareIdOps[Self <: FoursquareId] (val x: Self) extends AnyVal {
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
    def setFoursquareId(value: String): Self = this.set("foursquareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoursquareId: Self = this.set("foursquareId", js.undefined)
    @scala.inline
    def setNotification(value: Boolean): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = this.set("replyMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyMarkup: Self = this.set("replyMarkup", js.undefined)
    @scala.inline
    def setReplyToMessage(value: Double): Self = this.set("replyToMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToMessage: Self = this.set("replyToMessage", js.undefined)
  }
  
}

