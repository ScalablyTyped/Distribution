package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCookieUsageBehavior extends js.Object

/** Defines the cookie usage behavior that is used in the CookieUsageBehavior property. */
@JSGlobal("Windows.Web.Http.Filters.HttpCookieUsageBehavior")
@js.native
object HttpCookieUsageBehavior extends js.Object {
  /** Automatically handle cookies. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCookieUsageBehavior
  
  /** Do not handle cookies automatically. */
  @js.native
  sealed trait noCookies
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCookieUsageBehavior
  
  val default: default with java.lang.String = js.native
  val noCookies: noCookies with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCookieUsageBehavior with java.lang.String
  ] = js.native
}

