package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

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
  sealed trait connected extends WebAccountState
  
  /** The account was unable to connect. */
  @js.native
  sealed trait error extends WebAccountState
  
  /** The account is currently not connected. */
  @js.native
  sealed trait none extends WebAccountState
  
  /* 1 */ val connected: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountState.connected with Double = js.native
  /* 2 */ val error: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountState.error with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountState.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountState with Double] = js.native
}

