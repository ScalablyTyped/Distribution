package typings
package twilioDashChatLib.twilioDashChatMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Chat: js.UndefOr[js.Any] = js.undefined
  var Notification: js.UndefOr[js.Any] = js.undefined
  var Sync: js.UndefOr[js.Any] = js.undefined
  var Twilsock: js.UndefOr[js.Any] = js.undefined
  var backoffConfigOverride: js.UndefOr[js.Any] = js.undefined
  var consumptionReportIntervalOverride: js.UndefOr[java.lang.String] = js.undefined
  var httpCacheIntervalOverride: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var notificationsClient: js.UndefOr[twilioDashNotificationsLib.twilioDashNotificationsMod.Notifications] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var retryWhenThrottledOverride: js.UndefOr[scala.Boolean] = js.undefined
  var syncClient: js.UndefOr[twilioDashSyncLib.twilioDashSyncMod.SyncClient] = js.undefined
  var transport: js.UndefOr[twilioDashChatLib.libInterfacesTransportMod.Transport] = js.undefined
  var twilsockClient: js.UndefOr[twilsockLib.twilsockMod.Twilsock] = js.undefined
  var typingIndicatorTimeoutOverride: js.UndefOr[scala.Double] = js.undefined
  var userInfosToSubscribeOverride: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Chat: js.Any = null,
    Notification: js.Any = null,
    Sync: js.Any = null,
    Twilsock: js.Any = null,
    backoffConfigOverride: js.Any = null,
    consumptionReportIntervalOverride: java.lang.String = null,
    httpCacheIntervalOverride: java.lang.String = null,
    logLevel: LogLevel = null,
    notificationsClient: twilioDashNotificationsLib.twilioDashNotificationsMod.Notifications = null,
    productId: java.lang.String = null,
    region: java.lang.String = null,
    retryWhenThrottledOverride: js.UndefOr[scala.Boolean] = js.undefined,
    syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient = null,
    transport: twilioDashChatLib.libInterfacesTransportMod.Transport = null,
    twilsockClient: twilsockLib.twilsockMod.Twilsock = null,
    typingIndicatorTimeoutOverride: scala.Int | scala.Double = null,
    userInfosToSubscribeOverride: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Chat != null) __obj.updateDynamic("Chat")(Chat)
    if (Notification != null) __obj.updateDynamic("Notification")(Notification)
    if (Sync != null) __obj.updateDynamic("Sync")(Sync)
    if (Twilsock != null) __obj.updateDynamic("Twilsock")(Twilsock)
    if (backoffConfigOverride != null) __obj.updateDynamic("backoffConfigOverride")(backoffConfigOverride)
    if (consumptionReportIntervalOverride != null) __obj.updateDynamic("consumptionReportIntervalOverride")(consumptionReportIntervalOverride)
    if (httpCacheIntervalOverride != null) __obj.updateDynamic("httpCacheIntervalOverride")(httpCacheIntervalOverride)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (notificationsClient != null) __obj.updateDynamic("notificationsClient")(notificationsClient)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(retryWhenThrottledOverride)) __obj.updateDynamic("retryWhenThrottledOverride")(retryWhenThrottledOverride)
    if (syncClient != null) __obj.updateDynamic("syncClient")(syncClient)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (twilsockClient != null) __obj.updateDynamic("twilsockClient")(twilsockClient)
    if (typingIndicatorTimeoutOverride != null) __obj.updateDynamic("typingIndicatorTimeoutOverride")(typingIndicatorTimeoutOverride.asInstanceOf[js.Any])
    if (userInfosToSubscribeOverride != null) __obj.updateDynamic("userInfosToSubscribeOverride")(userInfosToSubscribeOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

