package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait local extends EmailQuerySearchScope
  
  /** Query the entire email message collection contained on the email server. */
  @js.native
  sealed trait server extends EmailQuerySearchScope
  
  /* 0 */ val local: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchScope.local with Double = js.native
  /* 1 */ val server: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchScope.server with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySearchScope with Double] = js.native
}

