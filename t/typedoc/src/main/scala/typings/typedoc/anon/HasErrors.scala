package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasErrors extends js.Object {
  var hasErrors: Boolean = js.native
  var inputFiles: js.Array[String] = js.native
}

object HasErrors {
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): HasErrors = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrors]
  }
  @scala.inline
  implicit class HasErrorsOps[Self <: HasErrors] (val x: Self) extends AnyVal {
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
    def setHasErrors(value: Boolean): Self = this.set("hasErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = this.set("inputFiles", js.Array(value :_*))
    @scala.inline
    def setInputFiles(value: js.Array[String]): Self = this.set("inputFiles", value.asInstanceOf[js.Any])
  }
  
}

