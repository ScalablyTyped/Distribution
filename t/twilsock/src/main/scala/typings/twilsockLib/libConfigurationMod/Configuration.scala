package typings
package twilsockLib.libConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings container for the Twilsock client library
  */
@JSImport("twilsock/lib/configuration", "Configuration")
@js.native
class Configuration protected () extends js.Object {
  /**
    * @param {String} token - authentication token
    * @param {Object} options - options to override defaults
    */
  def this(token: java.lang.String, activeGrant: java.lang.String) = this()
  def this(token: java.lang.String, activeGrant: java.lang.String, options: js.Any) = this()
  var _continuationToken: js.Any = js.native
  var _token: js.Any = js.native
  val activeGrant: java.lang.String = js.native
  val clientMetadata: js.Any = js.native
  val continuationToken: java.lang.String = js.native
  val initRegistrations: js.Array[twilsockLib.libProtocolInitregistrationMod.InitRegistration] = js.native
  val logLevel: loglevelLib.loglevelMod.LogLevelDesc = js.native
  val retryPolicy: js.Any = js.native
  val token: java.lang.String = js.native
  val tweaks: js.Any = js.native
  val url: java.lang.String = js.native
  def updateContinuationToken(continuationToken: java.lang.String): scala.Unit = js.native
  def updateToken(token: java.lang.String): scala.Unit = js.native
}

