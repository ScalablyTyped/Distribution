package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends PrimaryExpression
     with BaseNode
     with BindingName
     with EntityName
     with Node
     with Parameter
     with PropertyName {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var name: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Identifier
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object Identifier {
  @scala.inline
  def apply(
    loc: SourceLocation,
    name: String,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Identifier,
    decorators: js.Array[Decorator] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(loc = loc, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[Identifier]
  }
}

