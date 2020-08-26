package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateTaggedTemplate")
@js.native
object updateTaggedTemplate extends js.Object {
  /** @deprecated */ def apply(node: TaggedTemplateExpression, tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  def apply(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.Array[TypeNode],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
}

