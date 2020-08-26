package typings.stripe.mod.webhookEndpoints

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IObject
import typings.stripe.mod.events.EventType
import typings.stripe.stripeStrings.disabled
import typings.stripe.stripeStrings.enabled
import typings.stripe.stripeStrings.webhook_endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebhookEndpoint extends IObject {
  /**
    * The Stripe API version used to render data.
    */
  var api_version: String = js.native
  /**
    * ID of the Application.
    */
  var application: String | Null = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.Array[EventType] = js.native
  var id: String = js.native
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * Value is 'webhook_endpoint'
    */
  @JSName("object")
  var object_IWebhookEndpoint: webhook_endpoint = js.native
  /**
    * The endpoint’s secret, used to generate webhook signatures. Only returned at creation.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * The status of the webhook.
    */
  var status: enabled | disabled = js.native
  /**
    * The URL of the webhook endpoint.
    */
  var url: String = js.native
}

object IWebhookEndpoint {
  @scala.inline
  def apply(
    api_version: String,
    created: Double,
    enabled_events: js.Array[EventType],
    id: String,
    livemode: Boolean,
    `object`: webhook_endpoint,
    status: enabled | disabled,
    url: String
  ): IWebhookEndpoint = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], enabled_events = enabled_events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookEndpoint]
  }
  @scala.inline
  implicit class IWebhookEndpointOps[Self <: IWebhookEndpoint] (val x: Self) extends AnyVal {
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
    def setApi_version(value: String): Self = this.set("api_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled_eventsVarargs(value: EventType*): Self = this.set("enabled_events", js.Array(value :_*))
    @scala.inline
    def setEnabled_events(value: js.Array[EventType]): Self = this.set("enabled_events", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: webhook_endpoint): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: enabled | disabled): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
  
}

