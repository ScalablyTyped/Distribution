package typings.winrtDashUwp.Windows.ApplicationModel.Email

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
  sealed trait ascending extends EmailQuerySortDirection
  
  /** Sort query results in descending order. */
  @js.native
  sealed trait descending extends EmailQuerySortDirection
  
  /* 1 */ val ascending: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySortDirection.ascending with Double = js.native
  /* 0 */ val descending: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySortDirection.descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySortDirection with Double] = js.native
}

