package typings.winrt.Windows.System.Threading.Core

import typings.winrt.Windows.System.Threading.WorkItemHandler
import typings.winrt.Windows.System.Threading.WorkItemOptions
import typings.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItemFactory extends js.Object {
  def createWorkItem(handler: WorkItemHandler): PreallocatedWorkItem
  def createWorkItemWithPriority(handler: WorkItemHandler, priority: WorkItemPriority): PreallocatedWorkItem
  def createWorkItemWithPriorityAndOptions(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): PreallocatedWorkItem
}

object IPreallocatedWorkItemFactory {
  @scala.inline
  def apply(
    createWorkItem: WorkItemHandler => PreallocatedWorkItem,
    createWorkItemWithPriority: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem,
    createWorkItemWithPriorityAndOptions: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem
  ): IPreallocatedWorkItemFactory = {
    val __obj = js.Dynamic.literal(createWorkItem = js.Any.fromFunction1(createWorkItem), createWorkItemWithPriority = js.Any.fromFunction2(createWorkItemWithPriority), createWorkItemWithPriorityAndOptions = js.Any.fromFunction3(createWorkItemWithPriorityAndOptions))
    __obj.asInstanceOf[IPreallocatedWorkItemFactory]
  }
}

