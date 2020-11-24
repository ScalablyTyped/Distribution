package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.RootNode
import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "traverseNode")
@js.native
object traverseNode extends js.Object {
  
  def apply(node: RootNode, context: TransformContext): Unit = js.native
  def apply(node: TemplateChildNode, context: TransformContext): Unit = js.native
}
