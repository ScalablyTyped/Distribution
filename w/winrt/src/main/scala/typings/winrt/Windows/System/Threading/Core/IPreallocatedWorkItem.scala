package typings.winrt.Windows.System.Threading.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreallocatedWorkItem extends js.Object {
  
  def runAsync(): IAsyncAction = js.native
}
object IPreallocatedWorkItem {
  
  @scala.inline
  def apply(runAsync: () => IAsyncAction): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
  
  @scala.inline
  implicit class IPreallocatedWorkItemOps[Self <: IPreallocatedWorkItem] (val x: Self) extends AnyVal {
    
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
    def setRunAsync(value: () => IAsyncAction): Self = this.set("runAsync", js.Any.fromFunction0(value))
  }
}
