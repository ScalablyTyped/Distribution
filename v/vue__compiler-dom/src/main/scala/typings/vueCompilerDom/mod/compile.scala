package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "compile")
@js.native
object compile extends js.Object {
  
  def apply(template: String): CodegenResult = js.native
  def apply(template: String, options: CompilerOptions): CodegenResult = js.native
}
