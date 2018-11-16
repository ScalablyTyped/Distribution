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
  
  val none: none with java.lang.String = js.native
  val timeSliced: timeSliced with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions with java.lang.String] = js.native
}

