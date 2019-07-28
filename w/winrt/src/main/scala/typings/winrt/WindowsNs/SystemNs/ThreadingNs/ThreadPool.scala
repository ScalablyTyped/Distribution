package typings.winrt.WindowsNs.SystemNs.ThreadingNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
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
  def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
}

