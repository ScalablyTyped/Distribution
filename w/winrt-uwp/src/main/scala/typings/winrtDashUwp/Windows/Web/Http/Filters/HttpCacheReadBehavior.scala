package typings.winrtDashUwp.Windows.Web.Http.Filters

import org.scalablytyped.runtime.TopLevel
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
  sealed trait default extends HttpCacheReadBehavior
  
  /** Use the local HTTP cache if possible but always ask the server if more recent content is available. */
  @js.native
  sealed trait mostRecent extends HttpCacheReadBehavior
  
  /** Only use data from the local HTTP cache. This is the offline behavior. */
  @js.native
  sealed trait onlyFromCache extends HttpCacheReadBehavior
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCacheReadBehavior with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object mostRecent extends TopLevel[mostRecent with Double]
  
  /* 2 */ @js.native
  object onlyFromCache extends TopLevel[onlyFromCache with Double]
  
}

