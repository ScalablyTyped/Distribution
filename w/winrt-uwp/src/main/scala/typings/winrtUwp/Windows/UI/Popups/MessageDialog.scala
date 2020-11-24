package typings.winrtUwp.Windows.UI.Popups

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
@js.native
trait MessageDialog extends js.Object {
  
  /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
  var cancelCommandIndex: Double = js.native
  
  /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
  var commands: IVector[IUICommand] = js.native
  
  /** Gets or sets the message to be displayed to the user. */
  var content: String = js.native
  
  /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
  var defaultCommandIndex: Double = js.native
  
  /** Gets or sets the options for a MessageDialog . */
  var options: MessageDialogOptions = js.native
  
  /**
    * Begins an asynchronous operation showing a dialog.
    * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
    */
  def showAsync(): IPromiseWithIAsyncOperation[IUICommand] = js.native
  
  /** Gets or sets the title to display on the dialog, if any. */
  var title: String = js.native
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
  
  @scala.inline
  implicit class MessageDialogOps[Self <: MessageDialog] (val x: Self) extends AnyVal {
    
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
    def setShowAsync(value: () => IPromiseWithIAsyncOperation[IUICommand]): Self = this.set("showAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
