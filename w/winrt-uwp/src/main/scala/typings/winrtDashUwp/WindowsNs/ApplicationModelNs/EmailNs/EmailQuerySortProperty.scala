package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait date extends EmailQuerySortProperty
  
  /* 0 */ val date: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySortProperty.date with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySortProperty with Double] = js.native
}

