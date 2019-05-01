package typings
package twilioDashChatLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/configuration", "Configuration")
@js.native
class Configuration protected () extends js.Object {
  def this(options: js.Any) = this()
  val backoffConfigDefault: js.Any = js.native
  val backoffConfigOverride: js.UndefOr[js.Any] = js.native
  var baseUrl: js.Any = js.native
  val consumptionReportIntervalDefault: java.lang.String = js.native
  val consumptionReportIntervalOverride: js.UndefOr[scala.Double] = js.native
  val httpCacheIntervalDefault: java.lang.String = js.native
  val httpCacheIntervalOverride: js.UndefOr[java.lang.String] = js.native
  var region: js.Any = js.native
  val retryWhenThrottledDefault: scala.Boolean = js.native
  val retryWhenThrottledOverride: js.UndefOr[scala.Boolean] = js.native
  var token: java.lang.String = js.native
  val typingIndicatorTimeoutDefault: scala.Double = js.native
  val typingIndicatorTimeoutOverride: js.UndefOr[scala.Double] = js.native
  val typingIndicatorUri: java.lang.String = js.native
  val userInfosToSubscribeDefault: scala.Double = js.native
  val userInfosToSubscribeOverride: js.UndefOr[scala.Double] = js.native
}

