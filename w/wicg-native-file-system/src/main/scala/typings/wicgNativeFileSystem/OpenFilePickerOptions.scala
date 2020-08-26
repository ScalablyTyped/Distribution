package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFilePickerOptions extends FilePickerOptions {
  var multiple: js.UndefOr[Boolean] = js.native
}

object OpenFilePickerOptions {
  @scala.inline
  def apply(): OpenFilePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenFilePickerOptions]
  }
  @scala.inline
  implicit class OpenFilePickerOptionsOps[Self <: OpenFilePickerOptions] (val x: Self) extends AnyVal {
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
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

