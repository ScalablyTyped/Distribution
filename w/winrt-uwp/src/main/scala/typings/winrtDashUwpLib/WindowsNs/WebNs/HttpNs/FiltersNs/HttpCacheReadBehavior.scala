package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpCacheReadBehavior extends js.Object

/** Indicates if read requests by class methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces use the local HTTP cache for the response. */
@JSGlobal("Windows.Web.Http.Filters.HttpCacheReadBehavior")
@js.native
object HttpCacheReadBehavior extends js.Object {
  /** Always use the cache algorithm specified in RFC 2616 by the IETF to optimize network bandwidth. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheReadBehavior
  
  /** Use the local HTTP cache if possible but always ask the server if more recent content is available. */
  @js.native
  sealed trait mostRecent
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheReadBehavior
  
  /** Only use data from the local HTTP cache. This is the offline behavior. */
  @js.native
  sealed trait onlyFromCache
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheReadBehavior
  
  val default: default with java.lang.String = js.native
  val mostRecent: mostRecent with java.lang.String = js.native
  val onlyFromCache: onlyFromCache with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.FiltersNs.HttpCacheReadBehavior with java.lang.String
  ] = js.native
}

