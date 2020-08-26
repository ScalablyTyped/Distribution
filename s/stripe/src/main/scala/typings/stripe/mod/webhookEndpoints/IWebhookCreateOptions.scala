package typings.stripe.mod.webhookEndpoints

import typings.stripe.mod.events.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebhookCreateOptions extends js.Object {
  /**
    * Events sent to this endpoint will be generated with this Stripe Version instead of your
    * account’s default Stripe Version.
    */
  var api_version: js.UndefOr[String] = js.native
  /**
    * If true, this endpoint will receive events from connected accounts instead of just your account.
    */
  var connect: js.UndefOr[Boolean] = js.native
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.Array[EventType] = js.native
  /**
    * The URL of the webhook endpoint
    */
  var url: String = js.native
}

object IWebhookCreateOptions {
  @scala.inline
  def apply(enabled_events: js.Array[EventType], url: String): IWebhookCreateOptions = {
    val __obj = js.Dynamic.literal(enabled_events = enabled_events.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookCreateOptions]
  }
  @scala.inline
  implicit class IWebhookCreateOptionsOps[Self <: IWebhookCreateOptions] (val x: Self) extends AnyVal {
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
    def setEnabled_eventsVarargs(value: EventType*): Self = this.set("enabled_events", js.Array(value :_*))
    @scala.inline
    def setEnabled_events(value: js.Array[EventType]): Self = this.set("enabled_events", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_version(value: String): Self = this.set("api_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_version: Self = this.set("api_version", js.undefined)
    @scala.inline
    def setConnect(value: Boolean): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
  }
  
}

