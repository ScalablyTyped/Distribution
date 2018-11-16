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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority with java.lang.String] = js.native
}

