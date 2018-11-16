package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQuerySortProperty extends js.Object

/** The property by which to sort. Currently limited to date. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySortProperty")
@js.native
object EmailQuerySortProperty extends js.Object {
  /** Sort by date. */
  @js.native
  sealed trait date
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortProperty
  
  val date: date with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortProperty with java.lang.String
  ] = js.native
}

