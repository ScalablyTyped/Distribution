package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data associated with hiding a dialog.
  **/
trait ContentDialogHideInfo extends js.Object {
  /***
    * The dialog's dismissal result. May be 'primary', 'secondary', 'none', or whatever custom value was passed to hide.
    **/
  var result: String
}

object ContentDialogHideInfo {
  @scala.inline
  def apply(result: String): ContentDialogHideInfo = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentDialogHideInfo]
  }
}

