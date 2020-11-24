package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateTaggedTemplate")
@js.native
object updateTaggedTemplate extends js.Object {
  
  /** @deprecated Use `factory.updateTaggedTemplate` or the factory supplied by your transformation context instead. */
  def apply(node: TaggedTemplateExpression, tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  /** @deprecated Use `factory.updateTaggedTemplate` or the factory supplied by your transformation context instead. */
  def apply(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.Array[TypeNode],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
}
