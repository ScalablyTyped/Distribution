package typings.twilsock

import typings.loglevel.mod.LogLevelDesc
import typings.twilsock.initregistrationMod.InitRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  /**
    * Settings container for the Twilsock client library
    */
  @js.native
  class Configuration protected () extends js.Object {
    /**
      * @param {String} token - authentication token
      * @param {Object} options - options to override defaults
      */
    def this(token: String, activeGrant: String) = this()
    def this(token: String, activeGrant: String, options: js.Any) = this()
    var _continuationToken: js.Any = js.native
    var _token: js.Any = js.native
    val activeGrant: String = js.native
    val clientMetadata: js.Any = js.native
    val initRegistrations: js.Array[InitRegistration] = js.native
    val logLevel: LogLevelDesc = js.native
    val retryPolicy: js.Any = js.native
    val tweaks: js.Any = js.native
    val url: String = js.native
    def continuationToken: String = js.native
    def token: String = js.native
    def updateContinuationToken(continuationToken: String): Unit = js.native
    def updateToken(token: String): Unit = js.native
  }
  
}

