package typings.strophe.stropheMod.Strophe

import org.scalablytyped.runtime.TopLevel
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
@JSImport("strophe", "Strophe.Status")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  /* 8 */ @js.native
  object ATTACHED extends TopLevel[ATTACHED with Double]
  
  /* 3 */ @js.native
  object AUTHENTICATING extends TopLevel[AUTHENTICATING with Double]
  
  /* 4 */ @js.native
  object AUTHFAIL extends TopLevel[AUTHFAIL with Double]
  
  /* 5 */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with Double]
  
  /* 1 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  /* 2 */ @js.native
  object CONNFAIL extends TopLevel[CONNFAIL with Double]
  
  /* 10 */ @js.native
  object CONNTIMEOUT extends TopLevel[CONNTIMEOUT with Double]
  
  /* 6 */ @js.native
  object DISCONNECTED extends TopLevel[DISCONNECTED with Double]
  
  /* 7 */ @js.native
  object DISCONNECTING extends TopLevel[DISCONNECTING with Double]
  
  /* 0 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 9 */ @js.native
  object REDIRECT extends TopLevel[REDIRECT with Double]
  
}

