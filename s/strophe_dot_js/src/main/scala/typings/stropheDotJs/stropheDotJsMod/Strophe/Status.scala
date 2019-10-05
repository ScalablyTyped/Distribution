package typings.stropheDotJs.stropheDotJsMod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

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
@JSImport("strophe.js", "Strophe.Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait ATTACHED extends Status
  
  @js.native
  sealed trait AUTHENTICATING extends Status
  
  @js.native
  sealed trait AUTHFAIL extends Status
  
  @js.native
  sealed trait CONNECTED extends Status
  
  @js.native
  sealed trait CONNECTING extends Status
  
  @js.native
  sealed trait CONNFAIL extends Status
  
  @js.native
  sealed trait CONNTIMEOUT extends Status
  
  @js.native
  sealed trait DISCONNECTED extends Status
  
  @js.native
  sealed trait DISCONNECTING extends Status
  
  @js.native
  sealed trait ERROR extends Status
  
  @js.native
  sealed trait REDIRECT extends Status
  
  /* 8 */ val ATTACHED: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.ATTACHED with Double = js.native
  /* 3 */ val AUTHENTICATING: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.AUTHENTICATING with Double = js.native
  /* 4 */ val AUTHFAIL: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.AUTHFAIL with Double = js.native
  /* 5 */ val CONNECTED: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.CONNECTED with Double = js.native
  /* 1 */ val CONNECTING: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.CONNECTING with Double = js.native
  /* 2 */ val CONNFAIL: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.CONNFAIL with Double = js.native
  /* 10 */ val CONNTIMEOUT: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.CONNTIMEOUT with Double = js.native
  /* 6 */ val DISCONNECTED: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.DISCONNECTED with Double = js.native
  /* 7 */ val DISCONNECTING: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.DISCONNECTING with Double = js.native
  /* 0 */ val ERROR: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.ERROR with Double = js.native
  /* 9 */ val REDIRECT: typings.stropheDotJs.stropheDotJsMod.Strophe.Status.REDIRECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
}

