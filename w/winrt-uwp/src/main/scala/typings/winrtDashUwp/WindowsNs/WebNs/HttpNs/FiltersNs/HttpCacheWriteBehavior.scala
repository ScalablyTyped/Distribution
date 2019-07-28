package typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCacheWriteBehavior extends js.Object

/** Indicates if content returned by requests used by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces is written to the local HTTP cache. */
@JSGlobal("Windows.Web.Http.Filters.HttpCacheWriteBehavior")
@js.native
object HttpCacheWriteBehavior extends js.Object {
  /** Use the default behavior of WinInet. This usually results in writing the response to the local HTTP cache. */
  @js.native
  sealed trait default extends HttpCacheWriteBehavior
  
  /** Never write the response to the local HTTP cache. */
  @js.native
  sealed trait noCache extends HttpCacheWriteBehavior
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheWriteBehavior.default with Double = js.native
  /* 1 */ val noCache: typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheWriteBehavior.noCache with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCacheWriteBehavior with Double] = js.native
}

