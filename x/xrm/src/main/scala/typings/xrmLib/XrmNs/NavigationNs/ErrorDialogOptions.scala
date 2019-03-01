package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details to show in the Error dialog
  */
trait ErrorDialogOptions extends js.Object {
  /**
    * Details about the error. When you specify this, the Download Log File button is available in the error message,
    * and clicking it will let users download a text file with the content specified in this attribute.
    */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The error code. If you just set errorCode, the message for the error code is automatically
    * retrieved from the server and displayed in the error dialog.
    * If you specify an invalid errorCode value, an error dialog with a default error message is displyed.
    */
  var errorCode: js.UndefOr[scala.Double] = js.undefined
  /**
    *  The message to be displayed in the error dialog.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorDialogOptions {
  @scala.inline
  def apply(
    details: java.lang.String = null,
    errorCode: scala.Int | scala.Double = null,
    message: java.lang.String = null
  ): ErrorDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorDialogOptions]
  }
}

