package typings.stripe.stripeMod.webhookEndpoints

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.events.EventType
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enabled_events != null) __obj.updateDynamic("enabled_events")(enabled_events)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IWebhookUpdateOptions]
  }
}

