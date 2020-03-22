package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.TaggedTemplateExpression
import typings.typescript.mod.TemplateLiteral
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTaggedTemplate")
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

