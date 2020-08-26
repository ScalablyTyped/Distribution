package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxClosingTagInfo extends js.Object {
  val newText: java.lang.String = js.native
}

object JsxClosingTagInfo {
  @scala.inline
  def apply(newText: java.lang.String): JsxClosingTagInfo = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxClosingTagInfo]
  }
  @scala.inline
  implicit class JsxClosingTagInfoOps[Self <: JsxClosingTagInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewText(value: java.lang.String): Self = this.set("newText", value.asInstanceOf[js.Any])
  }
  
}

