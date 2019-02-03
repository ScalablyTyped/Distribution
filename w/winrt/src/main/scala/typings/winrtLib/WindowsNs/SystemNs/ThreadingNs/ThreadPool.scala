package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.ThreadPool")
@js.native
class ThreadPool () extends js.Object

/* static members */
@JSGlobal("Windows.System.Threading.ThreadPool")
@js.native
object ThreadPool extends js.Object {
  def runAsync(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def runAsync(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def runAsync(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority,
    options: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

