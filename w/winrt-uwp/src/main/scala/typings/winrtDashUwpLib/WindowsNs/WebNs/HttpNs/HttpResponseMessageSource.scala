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
  
  val cache: cache with java.lang.String = js.native
  val network: network with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpResponseMessageSource with java.lang.String
  ] = js.native
}

