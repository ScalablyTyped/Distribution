package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageDialogFactory extends js.Object {
  
  def create(content: String): MessageDialog = js.native
  
  def createWithTitle(content: String, title: String): MessageDialog = js.native
}
object IMessageDialogFactory {
  
  @scala.inline
  def apply(create: String => MessageDialog, createWithTitle: (String, String) => MessageDialog): IMessageDialogFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[IMessageDialogFactory]
  }
  
  @scala.inline
  implicit class IMessageDialogFactoryOps[Self <: IMessageDialogFactory] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String => MessageDialog): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithTitle(value: (String, String) => MessageDialog): Self = this.set("createWithTitle", js.Any.fromFunction2(value))
  }
}
