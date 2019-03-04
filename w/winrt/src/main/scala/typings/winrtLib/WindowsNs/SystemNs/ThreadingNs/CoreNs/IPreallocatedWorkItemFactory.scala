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
    createWorkItem: js.Function1[winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, PreallocatedWorkItem],
    createWorkItemWithPriority: js.Function2[
      winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, 
      winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority, 
      PreallocatedWorkItem
    ],
    createWorkItemWithPriorityAndOptions: js.Function3[
      winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemHandler, 
      winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemPriority, 
      winrtLib.WindowsNs.SystemNs.ThreadingNs.WorkItemOptions, 
      PreallocatedWorkItem
    ]
  ): IPreallocatedWorkItemFactory = {
    val __obj = js.Dynamic.literal(createWorkItem = createWorkItem, createWorkItemWithPriority = createWorkItemWithPriority, createWorkItemWithPriorityAndOptions = createWorkItemWithPriorityAndOptions)
  
    __obj.asInstanceOf[IPreallocatedWorkItemFactory]
  }
}

