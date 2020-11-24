package typings.strophe.mod.Strophe

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait ATTACHED extends Status
  /* 8 */ @js.native
  object ATTACHED extends TopLevel[ATTACHED with Double]
  
  @js.native
  sealed trait AUTHENTICATING extends Status
  /* 3 */ @js.native
  object AUTHENTICATING extends TopLevel[AUTHENTICATING with Double]
  
  @js.native
  sealed trait AUTHFAIL extends Status
  /* 4 */ @js.native
  object AUTHFAIL extends TopLevel[AUTHFAIL with Double]
  
  @js.native
  sealed trait CONNECTED extends Status
  /* 5 */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with Double]
  
  @js.native
  sealed trait CONNECTING extends Status
  /* 1 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  @js.native
  sealed trait CONNFAIL extends Status
  /* 2 */ @js.native
  object CONNFAIL extends TopLevel[CONNFAIL with Double]
  
  @js.native
  sealed trait CONNTIMEOUT extends Status
  /* 10 */ @js.native
  object CONNTIMEOUT extends TopLevel[CONNTIMEOUT with Double]
  
  @js.native
  sealed trait DISCONNECTED extends Status
  /* 6 */ @js.native
  object DISCONNECTED extends TopLevel[DISCONNECTED with Double]
  
  @js.native
  sealed trait DISCONNECTING extends Status
  /* 7 */ @js.native
  object DISCONNECTING extends TopLevel[DISCONNECTING with Double]
  
  @js.native
  sealed trait ERROR extends Status
  /* 0 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait REDIRECT extends Status
  /* 9 */ @js.native
  object REDIRECT extends TopLevel[REDIRECT with Double]
}
