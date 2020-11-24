package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.RootNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "baseCompile")
@js.native
object baseCompile extends js.Object {
  
  def apply(template: String): CodegenResult = js.native
  def apply(template: String, options: CompilerOptions): CodegenResult = js.native
  def apply(template: RootNode): CodegenResult = js.native
  def apply(template: RootNode, options: CompilerOptions): CodegenResult = js.native
}
