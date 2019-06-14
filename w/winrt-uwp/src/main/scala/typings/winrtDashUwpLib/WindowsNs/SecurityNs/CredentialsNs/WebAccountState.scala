package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountState extends js.Object

/** Describes the state of a WebAccount object. */
@JSGlobal("Windows.Security.Credentials.WebAccountState")
@js.native
object WebAccountState extends js.Object {
  /** The account is connected. */
  @js.native
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountState
  
  /** The account was unable to connect. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountState
  
  /** The account is currently not connected. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountState
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 2 */ val error: error with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountState with scala.Double
  ] = js.native
}

