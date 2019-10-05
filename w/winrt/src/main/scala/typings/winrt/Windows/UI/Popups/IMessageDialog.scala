package typings.winrt.Windows.UI.Popups

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialog extends js.Object {
  var cancelCommandIndex: Double
  var commands: IVector[IUICommand]
  var content: String
  var defaultCommandIndex: Double
  var options: MessageDialogOptions
  var title: String
  def showAsync(): IAsyncOperation[IUICommand]
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
    val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex, commands = commands, content = content, defaultCommandIndex = defaultCommandIndex, options = options, showAsync = js.Any.fromFunction0(showAsync), title = title)
  
    __obj.asInstanceOf[IMessageDialog]
  }
}

