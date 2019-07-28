package typings.typescript

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[Diagnostic]
  var options: CompilerOptions
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: CompilerOptions): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors, options = options)
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

