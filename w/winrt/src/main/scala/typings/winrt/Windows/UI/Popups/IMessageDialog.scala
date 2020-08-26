package typings.winrt.Windows.UI.Popups

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageDialog extends js.Object {
  var cancelCommandIndex: Double = js.native
  var commands: IVector[IUICommand] = js.native
  var content: String = js.native
  var defaultCommandIndex: Double = js.native
  var options: MessageDialogOptions = js.native
  var title: String = js.native
  def showAsync(): IAsyncOperation[IUICommand] = js.native
}

object IMessageDialog {
  @scala.inline
  def apply(
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    content: String,
    defaultCommandIndex: Double,
    options: MessageDialogOptions,
    showAsync: () => IAsyncOperation[IUICommand],
    title: String
  ): IMessageDialog = {
    val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageDialog]
  }
  @scala.inline
  implicit class IMessageDialogOps[Self <: IMessageDialog] (val x: Self) extends AnyVal {
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
    def setCancelCommandIndex(value: Double): Self = this.set("cancelCommandIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommands(value: IVector[IUICommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCommandIndex(value: Double): Self = this.set("defaultCommandIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: MessageDialogOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAsync(value: () => IAsyncOperation[IUICommand]): Self = this.set("showAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

