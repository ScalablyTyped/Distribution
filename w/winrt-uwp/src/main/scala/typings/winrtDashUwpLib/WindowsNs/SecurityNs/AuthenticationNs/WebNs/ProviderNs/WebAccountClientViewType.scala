package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountClientViewType extends js.Object

/** Represents the levels of information about a web account shown to the client. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientViewType")
@js.native
object WebAccountClientViewType extends js.Object {
  /** Shows the Id and properties. */
  @js.native
  sealed trait idAndProperties
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountClientViewType
  
  /** Shows only the Id. */
  @js.native
  sealed trait idOnly
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountClientViewType
  
  /* 1 */ val idAndProperties: idAndProperties with scala.Double = js.native
  /* 0 */ val idOnly: idOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs.WebAccountClientViewType with scala.Double
  ] = js.native
}

