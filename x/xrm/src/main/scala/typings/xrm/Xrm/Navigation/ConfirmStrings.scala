package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmStrings extends js.Object {
  /**
    * (Optional) The cancel button label. If you do not specify the cancel button label, Cancel is used as the button label.
    */
  var cancelButtonLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) The subtitle to be displayed in the confirmation dialog.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The message to be displyed in the alert dialog.
    */
  var text: String = js.native
  /**
    * (Optional) The title to be displyed in the confirmation dialog.
    */
  var title: js.UndefOr[String] = js.native
}

object ConfirmStrings {
  @scala.inline
  def apply(text: String): ConfirmStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmStrings]
  }
  @scala.inline
  implicit class ConfirmStringsOps[Self <: ConfirmStrings] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelButtonLabel(value: String): Self = this.set("cancelButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonLabel: Self = this.set("cancelButtonLabel", js.undefined)
    @scala.inline
    def setConfirmButtonLabel(value: String): Self = this.set("confirmButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmButtonLabel: Self = this.set("confirmButtonLabel", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

