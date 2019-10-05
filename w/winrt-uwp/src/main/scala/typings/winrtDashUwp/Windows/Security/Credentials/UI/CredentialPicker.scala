package typings.winrtDashUwp.Windows.Security.Credentials.UI

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an asynchronous object that displays a dialog box of credentials to the user and collects the user's response. */
@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
abstract class CredentialPicker () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
object CredentialPicker extends js.Object {
  /**
    * Displays a dialog box to the user and collects credentials from the user.
    * @param options The options on displaying and collecting the credential box.
    * @return The credential and options from the user.
    */
  def pickAsync(options: CredentialPickerOptions): IPromiseWithIAsyncOperation[CredentialPickerResults] = js.native
  /**
    * Constructor used to initiate asynchronous prompting operations using two inputs.
    * @param targetName The target name to display.
    * @param message The message to display in the dialog box.
    * @return The credential and options from the user.
    */
  def pickAsync(targetName: String, message: String): IPromiseWithIAsyncOperation[CredentialPickerResults] = js.native
  /**
    * Constructor used to initiate asynchronous prompting operations using three inputs.
    * @param targetName The target name to display.
    * @param message The message to display in the dialog box.
    * @param caption The caption to display in the dialog box.
    * @return The credential and options from the user.
    */
  def pickAsync(targetName: String, message: String, caption: String): IPromiseWithIAsyncOperation[CredentialPickerResults] = js.native
}

