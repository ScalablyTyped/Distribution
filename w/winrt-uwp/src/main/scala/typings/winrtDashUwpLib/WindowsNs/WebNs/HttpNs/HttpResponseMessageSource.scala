package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

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
  sealed trait cache
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessageSource
  
  /** The data was received over the network. */
  @js.native
  sealed trait network
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessageSource
  
  /** A default value that should not be returned under normal circumstances. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessageSource
  
  /* 1 */ val cache: cache with scala.Double = js.native
  /* 2 */ val network: network with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessageSource with scala.Double
  ] = js.native
}

