package typings.yaml

import typings.yaml.yamlMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[YAMLSyntaxError]
  var str: String
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[YAMLSyntaxError], str: String): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors, str = str)
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

