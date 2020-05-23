package typings.stripe.mod.webhookEndpoints

import typings.stripe.mod.IMetadata
import typings.stripe.mod.events.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebhookUpdateOptions extends js.Object {
  /**
    * If true, it disables the webhookendpoint.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.UndefOr[js.Array[EventType]] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * The URL of the webhook endpoint.
    */
  var url: js.UndefOr[String] = js.undefined
}

object IWebhookUpdateOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    enabled_events: js.Array[EventType] = null,
    metadata: IMetadata = null,
    url: String = null
  ): IWebhookUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (enabled_events != null) __obj.updateDynamic("enabled_events")(enabled_events.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookUpdateOptions]
  }
}

