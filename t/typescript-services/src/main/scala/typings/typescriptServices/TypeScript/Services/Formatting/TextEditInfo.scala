package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditInfo extends js.Object {
  var length: Double = js.native
  var position: Double = js.native
  var replaceWith: String = js.native
}

object TextEditInfo {
  @scala.inline
  def apply(length: Double, position: Double, replaceWith: String): TextEditInfo = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditInfo]
  }
  @scala.inline
  implicit class TextEditInfoOps[Self <: TextEditInfo] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceWith(value: String): Self = this.set("replaceWith", value.asInstanceOf[js.Any])
  }
  
}

