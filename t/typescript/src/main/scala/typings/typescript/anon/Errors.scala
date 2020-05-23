package typings.typescript.anon

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: CompilerOptions
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: CompilerOptions): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

