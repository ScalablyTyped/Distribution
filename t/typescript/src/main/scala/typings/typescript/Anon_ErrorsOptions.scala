package typings.typescript

import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.TypeAcquisition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorsOptions extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: TypeAcquisition
}

object Anon_ErrorsOptions {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Anon_ErrorsOptions = {
    val __obj = js.Dynamic.literal(errors = errors, options = options)
  
    __obj.asInstanceOf[Anon_ErrorsOptions]
  }
}

