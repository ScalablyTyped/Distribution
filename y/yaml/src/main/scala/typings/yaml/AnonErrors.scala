package typings.yaml

import typings.yaml.mod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[YAMLSyntaxError]
  var str: String
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[YAMLSyntaxError], str: String): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

