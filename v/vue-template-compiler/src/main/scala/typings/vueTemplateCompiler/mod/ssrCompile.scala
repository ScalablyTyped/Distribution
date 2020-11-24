package typings.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-template-compiler", "ssrCompile")
@js.native
object ssrCompile extends js.Object {
  
  def apply(template: String): CompiledResult[String] = js.native
  def apply(template: String, options: CompilerOptions): CompiledResult[String] = js.native
  def apply(template: String, options: CompilerOptionsWithSourceRange): CompiledResult[ErrorWithRange] = js.native
}
