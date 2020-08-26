package typings.uritemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriTemplateErrorOptions extends js.Object {
  var expressionText: String = js.native
  var message: String = js.native
  var position: Double = js.native
}

object UriTemplateErrorOptions {
  @scala.inline
  def apply(expressionText: String, message: String, position: Double): UriTemplateErrorOptions = {
    val __obj = js.Dynamic.literal(expressionText = expressionText.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriTemplateErrorOptions]
  }
  @scala.inline
  implicit class UriTemplateErrorOptionsOps[Self <: UriTemplateErrorOptions] (val x: Self) extends AnyVal {
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
    def setExpressionText(value: String): Self = this.set("expressionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

