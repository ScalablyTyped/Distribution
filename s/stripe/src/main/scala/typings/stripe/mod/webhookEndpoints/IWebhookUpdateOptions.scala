package typings.stripe.mod.webhookEndpoints

import typings.stripe.mod.IMetadata
import typings.stripe.mod.events.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebhookUpdateOptions extends js.Object {
  /**
    * If true, it disables the webhookendpoint.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.UndefOr[js.Array[EventType]] = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * The URL of the webhook endpoint.
    */
  var url: js.UndefOr[String] = js.native
}

object IWebhookUpdateOptions {
  @scala.inline
  def apply(): IWebhookUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebhookUpdateOptions]
  }
  @scala.inline
  implicit class IWebhookUpdateOptionsOps[Self <: IWebhookUpdateOptions] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnabled_eventsVarargs(value: EventType*): Self = this.set("enabled_events", js.Array(value :_*))
    @scala.inline
    def setEnabled_events(value: js.Array[EventType]): Self = this.set("enabled_events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled_events: Self = this.set("enabled_events", js.undefined)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

