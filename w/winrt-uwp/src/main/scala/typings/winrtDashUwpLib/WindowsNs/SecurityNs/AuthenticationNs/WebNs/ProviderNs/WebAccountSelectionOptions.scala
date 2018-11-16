package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountSelectionOptions extends js.Object

/** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions")
@js.native
object WebAccountSelectionOptions extends js.Object {
  /** The user selected the default account. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountSelectionOptions
  
  /** The user selected to add a new account. */
  @js.native
  sealed trait `new`
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountSelectionOptions
  
  val default: default with java.lang.String = js.native
  val `new`: `new` with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountSelectionOptions with java.lang.String
  ] = js.native
}

