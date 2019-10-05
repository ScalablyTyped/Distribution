package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertStrings extends js.Object {
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  /**
    *  The message to be displyed in the alert dialog.
    */
  var text: String
}

object AlertStrings {
  @scala.inline
  def apply(text: String, confirmButtonLabel: String = null): AlertStrings = {
    val __obj = js.Dynamic.literal(text = text)
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel)
    __obj.asInstanceOf[AlertStrings]
  }
}

