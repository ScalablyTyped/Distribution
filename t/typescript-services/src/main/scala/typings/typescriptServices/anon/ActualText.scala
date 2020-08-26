package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActualText extends js.Object {
  var actualText: String = js.native
  var memberName: String = js.native
}

object ActualText {
  @scala.inline
  def apply(actualText: String, memberName: String): ActualText = {
    val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualText]
  }
  @scala.inline
  implicit class ActualTextOps[Self <: ActualText] (val x: Self) extends AnyVal {
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
    def setActualText(value: String): Self = this.set("actualText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemberName(value: String): Self = this.set("memberName", value.asInstanceOf[js.Any])
  }
  
}

