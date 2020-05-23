package typings.twilioChat.mod.Client

import typings.twilioChat.transportMod.Transport
import typings.twilioNotifications.mod.Notifications
import typings.twilioSync.mod.SyncClient
import typings.twilsock.mod.Twilsock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Chat: js.UndefOr[js.Any] = js.undefined
  var Notification: js.UndefOr[js.Any] = js.undefined
  var Sync: js.UndefOr[js.Any] = js.undefined
  var Twilsock: js.UndefOr[js.Any] = js.undefined
  var backoffConfigOverride: js.UndefOr[js.Any] = js.undefined
  var clientMetadata: js.UndefOr[js.Any] = js.undefined
  var consumptionReportIntervalOverride: js.UndefOr[String] = js.undefined
  var httpCacheIntervalOverride: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var notificationsClient: js.UndefOr[Notifications] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var retryWhenThrottledOverride: js.UndefOr[Boolean] = js.undefined
  var syncClient: js.UndefOr[SyncClient] = js.undefined
  var transport: js.UndefOr[Transport] = js.undefined
  var twilsockClient: js.UndefOr[Twilsock] = js.undefined
  var typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.undefined
  var userInfosToSubscribeOverride: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Chat: js.Any = null,
    Notification: js.Any = null,
    Sync: js.Any = null,
    Twilsock: js.Any = null,
    backoffConfigOverride: js.Any = null,
    clientMetadata: js.Any = null,
    consumptionReportIntervalOverride: String = null,
    httpCacheIntervalOverride: String = null,
    logLevel: js.UndefOr[Null | LogLevel] = js.undefined,
    notificationsClient: Notifications = null,
    productId: String = null,
    region: String = null,
    retryWhenThrottledOverride: js.UndefOr[Boolean] = js.undefined,
    syncClient: SyncClient = null,
    transport: Transport = null,
    twilsockClient: Twilsock = null,
    typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.undefined,
    userInfosToSubscribeOverride: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Chat != null) __obj.updateDynamic("Chat")(Chat.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Sync != null) __obj.updateDynamic("Sync")(Sync.asInstanceOf[js.Any])
    if (Twilsock != null) __obj.updateDynamic("Twilsock")(Twilsock.asInstanceOf[js.Any])
    if (backoffConfigOverride != null) __obj.updateDynamic("backoffConfigOverride")(backoffConfigOverride.asInstanceOf[js.Any])
    if (clientMetadata != null) __obj.updateDynamic("clientMetadata")(clientMetadata.asInstanceOf[js.Any])
    if (consumptionReportIntervalOverride != null) __obj.updateDynamic("consumptionReportIntervalOverride")(consumptionReportIntervalOverride.asInstanceOf[js.Any])
    if (httpCacheIntervalOverride != null) __obj.updateDynamic("httpCacheIntervalOverride")(httpCacheIntervalOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(logLevel)) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (notificationsClient != null) __obj.updateDynamic("notificationsClient")(notificationsClient.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(retryWhenThrottledOverride)) __obj.updateDynamic("retryWhenThrottledOverride")(retryWhenThrottledOverride.get.asInstanceOf[js.Any])
    if (syncClient != null) __obj.updateDynamic("syncClient")(syncClient.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (twilsockClient != null) __obj.updateDynamic("twilsockClient")(twilsockClient.asInstanceOf[js.Any])
    if (!js.isUndefined(typingIndicatorTimeoutOverride)) __obj.updateDynamic("typingIndicatorTimeoutOverride")(typingIndicatorTimeoutOverride.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userInfosToSubscribeOverride)) __obj.updateDynamic("userInfosToSubscribeOverride")(userInfosToSubscribeOverride.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

