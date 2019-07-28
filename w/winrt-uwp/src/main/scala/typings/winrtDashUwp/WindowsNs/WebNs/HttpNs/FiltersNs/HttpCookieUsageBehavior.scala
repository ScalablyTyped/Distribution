package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs

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
  sealed trait default extends HttpCookieUsageBehavior
  
  /** Do not handle cookies automatically. */
  @js.native
  sealed trait noCookies extends HttpCookieUsageBehavior
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCookieUsageBehavior.default with Double = js.native
  /* 1 */ val noCookies: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCookieUsageBehavior.noCookies with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCookieUsageBehavior with Double] = js.native
}

