package typings.winrtUwp.Windows.UI.Popups

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
trait MessageDialog extends js.Object {
  /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
  var cancelCommandIndex: Double
  /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
  var commands: IVector[IUICommand]
  /** Gets or sets the message to be displayed to the user. */
  var content: String
  /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
  var defaultCommandIndex: Double
  /** Gets or sets the options for a MessageDialog . */
  var options: MessageDialogOptions
  /** Gets or sets the title to display on the dialog, if any. */
  var title: String
  /**
    * Begins an asynchronous operation showing a dialog.
    * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
    */
  def showAsync(): IPromiseWithIAsyncOperation[IUICommand]
}

object MessageDialog {
  @scala.inline
  def apply(
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    content: String,
    defaultCommandIndex: Double,
    options: MessageDialogOptions,
    showAsync: () => IPromiseWithIAsyncOperation[IUICommand],
    title: String
  ): MessageDialog = {
    val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDialog]
  }
}

