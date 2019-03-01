package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  var options: typescriptLib.typescriptMod.tsNs.CompilerOptions
}

object Anon_Errors {
  @scala.inline
  def apply(
    errors: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Errors]
  }
}

