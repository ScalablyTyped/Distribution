package typings.stripe.mod.webhookEndpoints

import typings.stripe.mod.events.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebhookCreateOptions extends js.Object {
  /**
    * Events sent to this endpoint will be generated with this Stripe Version instead of your
    * account’s default Stripe Version.
    */
  var api_version: js.UndefOr[String] = js.undefined
  /**
    * If true, this endpoint will receive events from connected accounts instead of just your account.
    */
  var connect: js.UndefOr[Boolean] = js.undefined
  /**
    * The list of enabled events for this webhook endpoint.
    * Use '*' to enable all events, except those that require explicit selection.
    */
  var enabled_events: js.Array[EventType]
  /**
    * The URL of the webhook endpoint
    */
  var url: String
}

object IWebhookCreateOptions {
  @scala.inline
  def apply(
    enabled_events: js.Array[EventType],
    url: String,
    api_version: String = null,
    connect: js.UndefOr[Boolean] = js.undefined
  ): IWebhookCreateOptions = {
    val __obj = js.Dynamic.literal(enabled_events = enabled_events.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (api_version != null) __obj.updateDynamic("api_version")(api_version.asInstanceOf[js.Any])
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebhookCreateOptions]
  }
}

