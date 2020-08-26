package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
  */
@js.native
trait ConfirmResult extends js.Object {
  /**
    * true if the confirm button was clicked to close the dialog.
    */
  var confirmed: Boolean = js.native
}

object ConfirmResult {
  @scala.inline
  def apply(confirmed: Boolean): ConfirmResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmResult]
  }
  @scala.inline
  implicit class ConfirmResultOps[Self <: ConfirmResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfirmed(value: Boolean): Self = this.set("confirmed", value.asInstanceOf[js.Any])
  }
  
}

