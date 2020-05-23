package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.TaggedTemplateExpression
import typings.typescript.mod.TemplateLiteral
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTaggedTemplate")
@js.native
object createTaggedTemplate extends js.Object {
  /** @deprecated */ def apply(tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def apply(tag: Expression, typeArguments: js.UndefOr[js.Array[TypeNode]], template: TemplateLiteral): TaggedTemplateExpression = js.native
}

