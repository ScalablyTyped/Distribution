package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CallExpression
import typings.vueCompilerCore.mod.DirectiveArguments
import typings.vueCompilerCore.mod.ForRenderListExpression
import typings.vueCompilerCore.mod.PropsExpression
import typings.vueCompilerCore.mod.SlotsExpression
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueCompilerCore.mod.TemplateTextChildNode
import typings.vueCompilerCore.mod.TransformContext
import typings.vueCompilerCore.mod.VNodeCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createVNodeCall")
@js.native
object createVNodeCall extends js.Object {
  
  def apply(
    context: TransformContext | Null,
    tag: String | js.Symbol | CallExpression,
    props: js.UndefOr[PropsExpression],
    children: js.UndefOr[
      js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
    ],
    patchFlag: js.UndefOr[String],
    dynamicProps: js.UndefOr[String],
    directives: js.UndefOr[DirectiveArguments],
    isBlock: js.UndefOr[Boolean],
    disableTracking: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): VNodeCall = js.native
}
