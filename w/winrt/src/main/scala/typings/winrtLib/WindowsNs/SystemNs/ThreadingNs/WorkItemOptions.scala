package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemOptions extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemOptions")
@js.native
object WorkItemOptions extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
  
  @js.native
  sealed trait timeSliced
    extends winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val timeSliced: timeSliced with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions with scala.Double] = js.native
}

