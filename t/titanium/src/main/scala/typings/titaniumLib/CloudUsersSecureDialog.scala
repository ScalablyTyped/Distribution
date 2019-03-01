package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for the modal dialog used in 3-Legged OAuth
  */
trait CloudUsersSecureDialog extends js.Object {
  /**
  	 * Defines the title for the dialog.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CloudUsersSecureDialog {
  @scala.inline
  def apply(title: java.lang.String = null): CloudUsersSecureDialog = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CloudUsersSecureDialog]
  }
}

