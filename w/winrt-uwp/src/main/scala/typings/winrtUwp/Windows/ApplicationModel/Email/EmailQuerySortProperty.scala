package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailQuerySortProperty extends js.Object
/** The property by which to sort. Currently limited to date. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySortProperty")
@js.native
object EmailQuerySortProperty extends js.Object {
  
  /** Sort by date. */
  @js.native
  sealed trait date extends EmailQuerySortProperty
}
