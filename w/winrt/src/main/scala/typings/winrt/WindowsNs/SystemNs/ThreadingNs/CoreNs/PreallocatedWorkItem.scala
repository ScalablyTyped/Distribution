package typings.winrt.WindowsNs.SystemNs.ThreadingNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler
import typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
import typings.winrt.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.PreallocatedWorkItem")
@js.native
class PreallocatedWorkItem protected () extends IPreallocatedWorkItem {
  def this(handler: WorkItemHandler) = this()
  def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
  def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
  /* CompleteClass */
  override def runAsync(): IAsyncAction = js.native
}

