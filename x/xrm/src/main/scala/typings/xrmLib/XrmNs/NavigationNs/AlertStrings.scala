package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertStrings extends js.Object {
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The message to be displyed in the alert dialog.
    */
  var text: java.lang.String
}

object AlertStrings {
  @scala.inline
  def apply(text: java.lang.String, confirmButtonLabel: java.lang.String = null): AlertStrings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel)
    __obj.asInstanceOf[AlertStrings]
  }
}

