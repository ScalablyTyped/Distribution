package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQuerySearchScope extends js.Object

/** Defines the scope of a query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchScope")
@js.native
object EmailQuerySearchScope extends js.Object {
  /** Query only the local email message collection. */
  @js.native
  sealed trait local
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchScope
  
  /** Query the entire email message collection contained on the email server. */
  @js.native
  sealed trait server
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchScope
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 1 */ val server: server with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchScope with scala.Double
  ] = js.native
}

