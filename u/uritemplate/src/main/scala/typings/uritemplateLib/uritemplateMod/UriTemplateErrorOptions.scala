package typings
package uritemplateLib.uritemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriTemplateErrorOptions extends js.Object {
  var expressionText: java.lang.String
  var message: java.lang.String
  var position: scala.Double
}

object UriTemplateErrorOptions {
  @scala.inline
  def apply(expressionText: java.lang.String, message: java.lang.String, position: scala.Double): UriTemplateErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expressionText")(expressionText)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[UriTemplateErrorOptions]
  }
}

