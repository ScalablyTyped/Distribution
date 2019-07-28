package typings.strophe.stropheMod.stropheMod

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
  /* 8 */ val ATTACHED: typings.strophe.stropheMod.StropheNs.Status.ATTACHED with Double = js.native
  /* 3 */ val AUTHENTICATING: typings.strophe.stropheMod.StropheNs.Status.AUTHENTICATING with Double = js.native
  /* 4 */ val AUTHFAIL: typings.strophe.stropheMod.StropheNs.Status.AUTHFAIL with Double = js.native
  /* 5 */ val CONNECTED: typings.strophe.stropheMod.StropheNs.Status.CONNECTED with Double = js.native
  /* 1 */ val CONNECTING: typings.strophe.stropheMod.StropheNs.Status.CONNECTING with Double = js.native
  /* 2 */ val CONNFAIL: typings.strophe.stropheMod.StropheNs.Status.CONNFAIL with Double = js.native
  /* 10 */ val CONNTIMEOUT: typings.strophe.stropheMod.StropheNs.Status.CONNTIMEOUT with Double = js.native
  /* 6 */ val DISCONNECTED: typings.strophe.stropheMod.StropheNs.Status.DISCONNECTED with Double = js.native
  /* 7 */ val DISCONNECTING: typings.strophe.stropheMod.StropheNs.Status.DISCONNECTING with Double = js.native
  /* 0 */ val ERROR: typings.strophe.stropheMod.StropheNs.Status.ERROR with Double = js.native
  /* 9 */ val REDIRECT: typings.strophe.stropheMod.StropheNs.Status.REDIRECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.strophe.stropheMod.StropheNs.Status with Double] = js.native
}

