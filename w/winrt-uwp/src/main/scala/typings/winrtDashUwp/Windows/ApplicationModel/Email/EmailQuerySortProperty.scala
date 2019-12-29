package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySortProperty with Double] = js.native
  /* 0 */ @js.native
  object date extends TopLevel[date with Double]
  
}

