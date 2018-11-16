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

