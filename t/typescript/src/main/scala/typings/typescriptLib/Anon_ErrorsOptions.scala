package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorsOptions extends js.Object {
  var errors: js.Array[typescriptLib.typescriptMod.Diagnostic]
  var options: typescriptLib.typescriptMod.TypeAcquisition
}

object Anon_ErrorsOptions {
  @scala.inline
  def apply(
    errors: js.Array[typescriptLib.typescriptMod.Diagnostic],
    options: typescriptLib.typescriptMod.TypeAcquisition
  ): Anon_ErrorsOptions = {
    val __obj = js.Dynamic.literal(errors = errors, options = options)
  
    __obj.asInstanceOf[Anon_ErrorsOptions]
  }
}

