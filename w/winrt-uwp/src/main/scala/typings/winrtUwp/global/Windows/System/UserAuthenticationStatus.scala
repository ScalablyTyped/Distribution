package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the authentication status of a user. */
@JSGlobal("Windows.System.UserAuthenticationStatus")
@js.native
object UserAuthenticationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.UserAuthenticationStatus with Double] = js.native
  
  /* 1 */ val locallyAuthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.locallyAuthenticated with Double = js.native
  
  /* 2 */ val remotelyAuthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.remotelyAuthenticated with Double = js.native
  
  /* 0 */ val unauthenticated: typings.winrtUwp.Windows.System.UserAuthenticationStatus.unauthenticated with Double = js.native
}
