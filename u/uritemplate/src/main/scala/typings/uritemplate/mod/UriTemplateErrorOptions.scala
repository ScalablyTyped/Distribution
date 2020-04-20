package typings.uritemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriTemplateErrorOptions extends js.Object {
  var expressionText: String
  var message: String
  var position: Double
}

object UriTemplateErrorOptions {
  @scala.inline
  def apply(expressionText: String, message: String, position: Double): UriTemplateErrorOptions = {
    val __obj = js.Dynamic.literal(expressionText = expressionText.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriTemplateErrorOptions]
  }
}

