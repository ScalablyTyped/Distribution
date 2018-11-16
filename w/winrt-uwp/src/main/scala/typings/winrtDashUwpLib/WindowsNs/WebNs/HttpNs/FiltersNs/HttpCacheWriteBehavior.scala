package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheWriteBehavior
  
  /** Never write the response to the local HTTP cache. */
  @js.native
  sealed trait noCache
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheWriteBehavior
  
  val default: default with java.lang.String = js.native
  val noCache: noCache with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheWriteBehavior with java.lang.String
  ] = js.native
}

