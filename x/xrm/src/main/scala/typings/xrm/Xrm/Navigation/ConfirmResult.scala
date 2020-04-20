package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
  */
trait ConfirmResult extends js.Object {
  /**
    * true if the confirm button was clicked to close the dialog.
    */
  var confirmed: Boolean
}

object ConfirmResult {
  @scala.inline
  def apply(confirmed: Boolean): ConfirmResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmResult]
  }
}

