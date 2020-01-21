package typings.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-template-compiler", "compile")
@js.native
object compile extends js.Object {
  def apply(template: String): CompiledResult[String] = js.native
  def apply(template: String, options: CompilerOptions): CompiledResult[String] = js.native
  def apply(template: String, options: CompilerOptionsWithSourceRange): CompiledResult[ErrorWithRange] = js.native
}

