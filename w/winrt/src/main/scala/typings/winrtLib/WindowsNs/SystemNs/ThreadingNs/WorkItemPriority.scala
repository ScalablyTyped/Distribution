package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemPriority extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemPriority")
@js.native
object WorkItemPriority extends js.Object {
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  
  @js.native
  sealed trait low
    extends winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority with scala.Double] = js.native
}

