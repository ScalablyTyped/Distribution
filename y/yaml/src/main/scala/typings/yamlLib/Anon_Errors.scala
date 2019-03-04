package typings
package yamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[yamlLib.yamlMod.YAMLSyntaxError]
  var str: java.lang.String
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[yamlLib.yamlMod.YAMLSyntaxError], str: java.lang.String): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors, str = str)
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

