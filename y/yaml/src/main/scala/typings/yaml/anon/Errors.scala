package typings.yaml.anon

import typings.yaml.utilMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[YAMLSyntaxError]
  var str: String
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[YAMLSyntaxError], str: String): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

