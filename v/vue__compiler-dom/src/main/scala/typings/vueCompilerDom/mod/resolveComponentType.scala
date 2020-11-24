package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CallExpression
import typings.vueCompilerCore.mod.ComponentNode
import typings.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "resolveComponentType")
@js.native
object resolveComponentType extends js.Object {
  
  def apply(node: ComponentNode, context: TransformContext): String | js.Symbol | CallExpression = js.native
  def apply(node: ComponentNode, context: TransformContext, ssr: Boolean): String | js.Symbol | CallExpression = js.native
}
