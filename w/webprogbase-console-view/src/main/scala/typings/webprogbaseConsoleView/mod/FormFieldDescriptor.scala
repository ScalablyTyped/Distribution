package typings.webprogbaseConsoleView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFieldDescriptor extends js.Object {
  var auto: js.UndefOr[String] = js.native
  var default: js.UndefOr[String] = js.native
  var description: String = js.native
}

object FormFieldDescriptor {
  @scala.inline
  def apply(description: String): FormFieldDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldDescriptor]
  }
  @scala.inline
  implicit class FormFieldDescriptorOps[Self <: FormFieldDescriptor] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto(value: String): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

