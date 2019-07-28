package typings.uritemplate.uritemplateMod

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
    val __obj = js.Dynamic.literal(expressionText = expressionText, message = message, position = position)
  
    __obj.asInstanceOf[UriTemplateErrorOptions]
  }
}

