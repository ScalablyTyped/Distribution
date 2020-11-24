package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "createCallExpression")
@js.native
object createCallExpression extends js.Object {
  
  def apply[T /* <: String | js.Symbol */](callee: T): InferCodegenNodeType[T] = js.native
  def apply[T /* <: String | js.Symbol */](callee: T, args: js.UndefOr[scala.Nothing], loc: SourceLocation): InferCodegenNodeType[T] = js.native
  def apply[T /* <: String | js.Symbol */](
    callee: T,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[T] = js.native
  def apply[T /* <: String | js.Symbol */](
    callee: T,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[T] = js.native
}
