package typings.vueCompilerDom.mod

import typings.vueCompilerCore.anon.Directives
import typings.vueCompilerCore.mod.AttributeNode
import typings.vueCompilerCore.mod.DirectiveNode
import typings.vueCompilerCore.mod.ElementNode
import typings.vueCompilerCore.mod.TransformContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "buildProps")
@js.native
object buildProps extends js.Object {
  
  def apply(node: ElementNode, context: TransformContext): Directives = js.native
  def apply(node: ElementNode, context: TransformContext, props: js.UndefOr[scala.Nothing], ssr: Boolean): Directives = js.native
  def apply(node: ElementNode, context: TransformContext, props: js.Array[AttributeNode | DirectiveNode]): Directives = js.native
  def apply(
    node: ElementNode,
    context: TransformContext,
    props: js.Array[AttributeNode | DirectiveNode],
    ssr: Boolean
  ): Directives = js.native
}
