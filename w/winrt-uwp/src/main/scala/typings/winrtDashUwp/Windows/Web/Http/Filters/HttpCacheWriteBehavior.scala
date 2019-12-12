package typings.winrtDashUwp.Windows.Web.Http.Filters

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.default
import typings.winrtDashUwp.Windows.Web.Http.Filters.HttpCacheWriteBehavior.noCache
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpCacheWriteBehavior with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object noCache extends TopLevel[noCache with Double]
  
}

