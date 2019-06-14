package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountScope extends js.Object

/** Represents the scope of a web account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountScope")
@js.native
object WebAccountScope extends js.Object {
  /** Scope that hides the account from PC settings. Use this scope if you do not want the user's login to persist. For these accounts, only per-app tokens should be retained. */
  @js.native
  sealed trait perApplication
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope
  
  /** Scope for single-sign-on accounts that appear in PC settings. This is the default scope. */
  @js.native
  sealed trait perUser
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope
  
  /* 1 */ val perApplication: perApplication with scala.Double = js.native
  /* 0 */ val perUser: perUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountScope with scala.Double
  ] = js.native
}

