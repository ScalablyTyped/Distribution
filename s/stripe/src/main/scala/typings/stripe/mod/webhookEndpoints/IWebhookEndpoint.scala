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

trait IWebhookEndpoint extends IObject {
  /**
    * The Stripe API version used to render data.
    */
  var api_version: String
  /**
    * ID of the Application.
    */
  var application: String | Null
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.Array[EventType]
  var id: String
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * Value is 'webhook_endpoint'
    */
  @JSName("object")
  var object_IWebhookEndpoint: webhook_endpoint
  /**
    * The endpoint’s secret, used to generate webhook signatures. Only returned at creation.
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * The status of the webhook.
    */
  var status: enabled | disabled
  /**
    * The URL of the webhook endpoint.
    */
  var url: String
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
    url: String,
    application: String = null,
    metadata: IMetadata = null,
    secret: String = null
  ): IWebhookEndpoint = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], enabled_events = enabled_events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookEndpoint]
  }
}

