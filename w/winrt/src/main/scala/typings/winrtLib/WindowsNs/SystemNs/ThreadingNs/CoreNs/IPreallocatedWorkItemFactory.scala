package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItemFactory extends js.Object {
  def createWorkItem(handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler): PreallocatedWorkItem
  def createWorkItemWithPriority(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority
  ): PreallocatedWorkItem
  def createWorkItemWithPriorityAndOptions(
    handler: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler,
    priority: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority,
    options: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions
  ): PreallocatedWorkItem
}

object IPreallocatedWorkItemFactory {
  @scala.inline
  def apply(
    createWorkItem: winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler => PreallocatedWorkItem,
    createWorkItemWithPriority: (winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority) => PreallocatedWorkItem,
    createWorkItemWithPriorityAndOptions: (winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority, winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions) => PreallocatedWorkItem
  ): IPreallocatedWorkItemFactory = {
    val __obj = js.Dynamic.literal(createWorkItem = js.Any.fromFunction1(createWorkItem), createWorkItemWithPriority = js.Any.fromFunction2(createWorkItemWithPriority), createWorkItemWithPriorityAndOptions = js.Any.fromFunction3(createWorkItemWithPriorityAndOptions))
  
    __obj.asInstanceOf[IPreallocatedWorkItemFactory]
  }
}

