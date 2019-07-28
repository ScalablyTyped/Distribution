package typings.twilioDashMcsDashClient.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-mcs-client/lib/configuration", "Configuration")
@js.native
class Configuration protected () extends js.Object {
  def this(token: String, baseUrl: String, options: js.Any) = this()
  val backoffConfigOverride: js.Any = js.native
  val baseUrl: String = js.native
  var region: js.Any = js.native
  val retryWhenThrottledOverride: Boolean = js.native
  var token: String = js.native
  def updateToken(token: String): Unit = js.native
}

/* static members */
@JSImport("twilio-mcs-client/lib/configuration", "Configuration")
@js.native
object Configuration extends js.Object {
  val backoffConfigDefault: js.Any = js.native
  val retryWhenThrottledDefault: Boolean = js.native
}

