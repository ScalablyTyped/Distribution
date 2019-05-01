package typings
package twilioDashMcsDashClientLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-mcs-client/lib/configuration", "Configuration")
@js.native
class Configuration protected () extends js.Object {
  def this(token: java.lang.String, baseUrl: java.lang.String, options: js.Any) = this()
  val backoffConfigOverride: js.Any = js.native
  val baseUrl: java.lang.String = js.native
  var region: js.Any = js.native
  val retryWhenThrottledOverride: scala.Boolean = js.native
  var token: java.lang.String = js.native
  def updateToken(token: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("twilio-mcs-client/lib/configuration", "Configuration")
@js.native
object Configuration extends js.Object {
  val backoffConfigDefault: js.Any = js.native
  val retryWhenThrottledDefault: scala.Boolean = js.native
}

