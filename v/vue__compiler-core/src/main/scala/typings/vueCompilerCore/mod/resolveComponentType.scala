package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "resolveComponentType")
@js.native
object resolveComponentType extends js.Object {
  
  def apply(node: ComponentNode, context: TransformContext): String | js.Symbol | CallExpression = js.native
  def apply(node: ComponentNode, context: TransformContext, ssr: Boolean): String | js.Symbol | CallExpression = js.native
}
