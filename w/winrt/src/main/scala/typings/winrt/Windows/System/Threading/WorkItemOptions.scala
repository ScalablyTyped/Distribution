package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemOptions extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemOptions")
@js.native
object WorkItemOptions extends js.Object {
  @js.native
  sealed trait none extends WorkItemOptions
  
  @js.native
  sealed trait timeSliced extends WorkItemOptions
  
  /* 0 */ val none: typings.winrt.Windows.System.Threading.WorkItemOptions.none with Double = js.native
  /* 1 */ val timeSliced: typings.winrt.Windows.System.Threading.WorkItemOptions.timeSliced with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemOptions with Double] = js.native
}

