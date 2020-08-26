package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInput extends js.Object {
  var chooseFile: String = js.native
  var disabled: String = js.native
  var fileDecorator: String = js.native
  var fileInput: String = js.native
  var fileSign: String = js.native
  var fileSignBottom: String = js.native
  var noFileChosen: String = js.native
  var other: String = js.native
  var placeholderInput: String = js.native
  var preview: String = js.native
  var removeButton: String = js.native
  var removeButtonBottom: String = js.native
  var removeFile: String = js.native
  var removeFileSvg: String = js.native
  var root: String = js.native
  var wrapper: String = js.native
}

object FileInput {
  @scala.inline
  def apply(
    chooseFile: String,
    disabled: String,
    fileDecorator: String,
    fileInput: String,
    fileSign: String,
    fileSignBottom: String,
    noFileChosen: String,
    other: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeButtonBottom: String,
    removeFile: String,
    removeFileSvg: String,
    root: String,
    wrapper: String
  ): FileInput = {
    val __obj = js.Dynamic.literal(chooseFile = chooseFile.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileSign = fileSign.asInstanceOf[js.Any], fileSignBottom = fileSignBottom.asInstanceOf[js.Any], noFileChosen = noFileChosen.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeButtonBottom = removeButtonBottom.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], removeFileSvg = removeFileSvg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInput]
  }
  @scala.inline
  implicit class FileInputOps[Self <: FileInput] (val x: Self) extends AnyVal {
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
    def setChooseFile(value: String): Self = this.set("chooseFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDecorator(value: String): Self = this.set("fileDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileInput(value: String): Self = this.set("fileInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSign(value: String): Self = this.set("fileSign", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSignBottom(value: String): Self = this.set("fileSignBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoFileChosen(value: String): Self = this.set("noFileChosen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholderInput(value: String): Self = this.set("placeholderInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveButton(value: String): Self = this.set("removeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveButtonBottom(value: String): Self = this.set("removeButtonBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveFile(value: String): Self = this.set("removeFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveFileSvg(value: String): Self = this.set("removeFileSvg", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

