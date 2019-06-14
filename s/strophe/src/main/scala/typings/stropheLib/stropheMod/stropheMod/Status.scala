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
  /* 8 */ val ATTACHED: stropheLib.stropheMod.StropheNs.Status.ATTACHED with scala.Double = js.native
  /* 3 */ val AUTHENTICATING: stropheLib.stropheMod.StropheNs.Status.AUTHENTICATING with scala.Double = js.native
  /* 4 */ val AUTHFAIL: stropheLib.stropheMod.StropheNs.Status.AUTHFAIL with scala.Double = js.native
  /* 5 */ val CONNECTED: stropheLib.stropheMod.StropheNs.Status.CONNECTED with scala.Double = js.native
  /* 1 */ val CONNECTING: stropheLib.stropheMod.StropheNs.Status.CONNECTING with scala.Double = js.native
  /* 2 */ val CONNFAIL: stropheLib.stropheMod.StropheNs.Status.CONNFAIL with scala.Double = js.native
  /* 10 */ val CONNTIMEOUT: stropheLib.stropheMod.StropheNs.Status.CONNTIMEOUT with scala.Double = js.native
  /* 6 */ val DISCONNECTED: stropheLib.stropheMod.StropheNs.Status.DISCONNECTED with scala.Double = js.native
  /* 7 */ val DISCONNECTING: stropheLib.stropheMod.StropheNs.Status.DISCONNECTING with scala.Double = js.native
  /* 0 */ val ERROR: stropheLib.stropheMod.StropheNs.Status.ERROR with scala.Double = js.native
  /* 9 */ val REDIRECT: stropheLib.stropheMod.StropheNs.Status.REDIRECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[stropheLib.stropheMod.StropheNs.Status with scala.Double] = js.native
}

