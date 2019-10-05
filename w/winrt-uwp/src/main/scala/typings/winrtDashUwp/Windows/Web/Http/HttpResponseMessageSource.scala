package typings.winrtDashUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HttpResponseMessageSource extends js.Object

/** Indicates the source of the data received in the HttpResponseMessage . */
@JSGlobal("Windows.Web.Http.HttpResponseMessageSource")
@js.native
object HttpResponseMessageSource extends js.Object {
  /** The data was from the local cache. */
  @js.native
  sealed trait cache extends HttpResponseMessageSource
  
  /** The data was received over the network. */
  @js.native
  sealed trait network extends HttpResponseMessageSource
  
  /** A default value that should not be returned under normal circumstances. */
  @js.native
  sealed trait none extends HttpResponseMessageSource
  
  /* 1 */ val cache: typings.winrtDashUwp.Windows.Web.Http.HttpResponseMessageSource.cache with Double = js.native
  /* 2 */ val network: typings.winrtDashUwp.Windows.Web.Http.HttpResponseMessageSource.network with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Web.Http.HttpResponseMessageSource.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpResponseMessageSource with Double] = js.native
}

