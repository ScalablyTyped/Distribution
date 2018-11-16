package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.PreallocatedWorkItem")
@js.native
class PreallocatedWorkItem protected () extends IPreallocatedWorkItem {
  def this(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler) = this()
  def this(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority) = this()
  def this(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority, options: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions) = this()
  /* CompleteClass */
  override def runAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

