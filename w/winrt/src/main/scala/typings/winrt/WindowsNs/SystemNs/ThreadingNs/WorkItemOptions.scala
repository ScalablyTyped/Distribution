package typings.winrt.WindowsNs.SystemNs.ThreadingNs

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
  
  /* 0 */ val none: typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions.none with Double = js.native
  /* 1 */ val timeSliced: typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions.timeSliced with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemOptions with Double] = js.native
}

