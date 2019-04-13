package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[typescriptLib.typescriptMod.Diagnostic]
  var options: typescriptLib.typescriptMod.CompilerOptions
}

object Anon_Errors {
  @scala.inline
  def apply(
    errors: js.Array[typescriptLib.typescriptMod.Diagnostic],
    options: typescriptLib.typescriptMod.CompilerOptions
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors, options = options)
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

