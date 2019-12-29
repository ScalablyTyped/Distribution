package typings.winrtDashUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpResponseMessageSource with Double] = js.native
  /* 1 */ @js.native
  object cache extends TopLevel[cache with Double]
  
  /* 2 */ @js.native
  object network extends TopLevel[network with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

