package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
@JSGlobal("Windows.UI.Popups.MessageDialog")
@js.native
class MessageDialog protected () extends js.Object {
  /**
    * Initializes a new instance of the MessageDialog class to display an untitled message dialog that can be used to ask your user simple questions.
    * @param content The message displayed to the user.
    */
  def this(content: java.lang.String) = this()
  /**
    * Initializes a new instance of the MessageDialog class to display a titled message dialog that can be used to ask your user simple questions.
    * @param content The message displayed to the user.
    * @param title The title you want displayed on the dialog.
    */
  def this(content: java.lang.String, title: java.lang.String) = this()
  /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
  var cancelCommandIndex: scala.Double = js.native
  /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
  var commands: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand] = js.native
  /** Gets or sets the message to be displayed to the user. */
  var content: java.lang.String = js.native
  /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
  var defaultCommandIndex: scala.Double = js.native
  /** Gets or sets the options for a MessageDialog . */
  var options: MessageDialogOptions = js.native
  /** Gets or sets the title to display on the dialog, if any. */
  var title: java.lang.String = js.native
  /**
    * Begins an asynchronous operation showing a dialog.
    * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
    */
  def showAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[IUICommand] = js.native
}

