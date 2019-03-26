package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// AlertDialog
trait _AlertDialogProperties extends _NativeObjectProperties {
  /**
    * An object with the texts of the buttons to display. There are up to three buttons: `ok`, `cancel` and
    * `neutral`. If no text is given for a button it will not be displayed. Example: `{ok: 'Yes', cancel:
    * 'No'}` shows 'Yes' and 'No', but no 'neutral' button.
    */
  var buttons: tabrisLib.Anon_CancelNeutral
  /**
    * The message to display inside the dialog.
    */
  var message: java.lang.String
  /**
    * A list of `TextInput` widgets to be displayed alongside the `title` and `message`. The text values
    * inserted by the user can be read in the dialogs `close` event from the respective `TextInputs`. Eg.:
    * `dialog.on('close', (e) => e.target.textInputs[0].text)`
    */
  var textInputs: js.Array[TextInput]
  /**
    * The title of the dialog.
    */
  var title: java.lang.String
}

object _AlertDialogProperties {
  @scala.inline
  def apply(
    buttons: tabrisLib.Anon_CancelNeutral,
    message: java.lang.String,
    textInputs: js.Array[TextInput],
    title: java.lang.String
  ): _AlertDialogProperties = {
    val __obj = js.Dynamic.literal(buttons = buttons, message = message, textInputs = textInputs, title = title)
  
    __obj.asInstanceOf[_AlertDialogProperties]
  }
}

