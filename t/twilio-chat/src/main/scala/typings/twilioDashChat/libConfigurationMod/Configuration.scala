package typings.twilioDashChat.libConfigurationMod

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
  val consumptionReportIntervalDefault: String = js.native
  val consumptionReportIntervalOverride: js.UndefOr[Double] = js.native
  val httpCacheIntervalDefault: String = js.native
  val httpCacheIntervalOverride: js.UndefOr[String] = js.native
  var region: js.Any = js.native
  val retryWhenThrottledDefault: Boolean = js.native
  val retryWhenThrottledOverride: js.UndefOr[Boolean] = js.native
  var token: String = js.native
  val typingIndicatorTimeoutDefault: Double = js.native
  val typingIndicatorTimeoutOverride: js.UndefOr[Double] = js.native
  val typingIndicatorUri: String = js.native
  val userInfosToSubscribeDefault: Double = js.native
  val userInfosToSubscribeOverride: js.UndefOr[Double] = js.native
}

