package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.RootNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "parse")
@js.native
object parse extends js.Object {
  
  def apply(template: String): RootNode = js.native
  def apply(template: String, options: ParserOptions): RootNode = js.native
}
