package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var error: String = js.native
  var root: String = js.native
  var saveAgainButton: String = js.native
  var saving: String = js.native
  var success: String = js.native
}

object Error {
  @scala.inline
  def apply(error: String, root: String, saveAgainButton: String, saving: String, success: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], saveAgainButton = saveAgainButton.asInstanceOf[js.Any], saving = saving.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveAgainButton(value: String): Self = this.set("saveAgainButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaving(value: String): Self = this.set("saving", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

