package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySortDirection.ascending
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySortDirection.descending
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySortDirection with Double] = js.native
  /* 1 */ @js.native
  object ascending extends TopLevel[ascending with Double]
  
  /* 0 */ @js.native
  object descending extends TopLevel[descending with Double]
  
}

