package typings.winrtUwp.Windows.ApplicationModel.Email

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
  
}

