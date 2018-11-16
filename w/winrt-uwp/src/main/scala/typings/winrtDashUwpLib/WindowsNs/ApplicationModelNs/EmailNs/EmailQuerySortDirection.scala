package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQuerySortDirection extends js.Object

/** Defines the order in which to sort query results. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySortDirection")
@js.native
object EmailQuerySortDirection extends js.Object {
  /** Sort query results in ascending order. */
  @js.native
  sealed trait ascending
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortDirection
  
  /** Sort query results in descending order. */
  @js.native
  sealed trait descending
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortDirection
  
  val ascending: ascending with java.lang.String = js.native
  val descending: descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortDirection with java.lang.String
  ] = js.native
}

