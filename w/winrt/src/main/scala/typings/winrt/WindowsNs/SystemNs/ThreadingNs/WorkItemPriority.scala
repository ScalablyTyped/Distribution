package typings.winrt.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemPriority extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemPriority")
@js.native
object WorkItemPriority extends js.Object {
  @js.native
  sealed trait high extends WorkItemPriority
  
  @js.native
  sealed trait low extends WorkItemPriority
  
  @js.native
  sealed trait normal extends WorkItemPriority
  
  /* 2 */ val high: typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority.high with Double = js.native
  /* 0 */ val low: typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority.low with Double = js.native
  /* 1 */ val normal: typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemPriority with Double] = js.native
}

