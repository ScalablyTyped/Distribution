package typings
package stropheLib.stropheMod.stropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants: Connection Status Constants
  *  Connection status constants for use by the connection handler
  *  callback.
  *
  *  Status.ERROR - An error has occurred
  *  Status.CONNECTING - The connection is currently being made
  *  Status.CONNFAIL - The connection attempt failed
  *  Status.AUTHENTICATING - The connection is authenticating
  *  Status.AUTHFAIL - The authentication attempt failed
  *  Status.CONNECTED - The connection has succeeded
  *  Status.DISCONNECTED - The connection has been terminated
  *  Status.DISCONNECTING - The connection is currently being terminated
  *  Status.ATTACHED - The connection has been attached
  */
@JSImport("Strophe", "Status")
@js.native
object Status extends js.Object {
  val ATTACHED: stropheLib.stropheMod.StropheNs.Status.ATTACHED with java.lang.String = js.native
  val AUTHENTICATING: stropheLib.stropheMod.StropheNs.Status.AUTHENTICATING with java.lang.String = js.native
  val AUTHFAIL: stropheLib.stropheMod.StropheNs.Status.AUTHFAIL with java.lang.String = js.native
  val CONNECTED: stropheLib.stropheMod.StropheNs.Status.CONNECTED with java.lang.String = js.native
  val CONNECTING: stropheLib.stropheMod.StropheNs.Status.CONNECTING with java.lang.String = js.native
  val CONNFAIL: stropheLib.stropheMod.StropheNs.Status.CONNFAIL with java.lang.String = js.native
  val CONNTIMEOUT: stropheLib.stropheMod.StropheNs.Status.CONNTIMEOUT with java.lang.String = js.native
  val DISCONNECTED: stropheLib.stropheMod.StropheNs.Status.DISCONNECTED with java.lang.String = js.native
  val DISCONNECTING: stropheLib.stropheMod.StropheNs.Status.DISCONNECTING with java.lang.String = js.native
  val ERROR: stropheLib.stropheMod.StropheNs.Status.ERROR with java.lang.String = js.native
  val REDIRECT: stropheLib.stropheMod.StropheNs.Status.REDIRECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stropheLib.stropheMod.StropheNs.Status with java.lang.String] = js.native
}

