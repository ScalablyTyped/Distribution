package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.email
import typings.stripejs.stripejsStrings.manual
import typings.stripejs.stripejsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mandate extends js.Object {
  var acceptance: js.UndefOr[Acceptance] = js.native
  /**
    * The method Stripe should use to notify the customer
    * - email: an email is sent directly to the customer
    * - manual: a source.mandate_notification event is sent to your webhooks endpoint and you should handle the notification
    * - none: the underlying debit network does not require any notification
    */
  var notification_method: js.UndefOr[email | manual | none] = js.native
}

object Mandate {
  @scala.inline
  def apply(): Mandate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mandate]
  }
  @scala.inline
  implicit class MandateOps[Self <: Mandate] (val x: Self) extends AnyVal {
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
    def setAcceptance(value: Acceptance): Self = this.set("acceptance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptance: Self = this.set("acceptance", js.undefined)
    @scala.inline
    def setNotification_method(value: email | manual | none): Self = this.set("notification_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification_method: Self = this.set("notification_method", js.undefined)
  }
  
}

