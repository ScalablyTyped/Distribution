package typings.winrt.Windows.System.Threading.Core

import typings.winrt.Windows.System.Threading.WorkItemHandler
import typings.winrt.Windows.System.Threading.WorkItemOptions
import typings.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreallocatedWorkItemFactory extends js.Object {
  
  def createWorkItem(handler: WorkItemHandler): PreallocatedWorkItem = js.native
  
  def createWorkItemWithPriority(handler: WorkItemHandler, priority: WorkItemPriority): PreallocatedWorkItem = js.native
  
  def createWorkItemWithPriorityAndOptions(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): PreallocatedWorkItem = js.native
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
  
  @scala.inline
  implicit class IPreallocatedWorkItemFactoryOps[Self <: IPreallocatedWorkItemFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateWorkItem(value: WorkItemHandler => PreallocatedWorkItem): Self = this.set("createWorkItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWorkItemWithPriority(value: (WorkItemHandler, WorkItemPriority) => PreallocatedWorkItem): Self = this.set("createWorkItemWithPriority", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateWorkItemWithPriorityAndOptions(value: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => PreallocatedWorkItem): Self = this.set("createWorkItemWithPriorityAndOptions", js.Any.fromFunction3(value))
  }
}
