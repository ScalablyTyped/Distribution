package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern
  extends PrimaryExpression
     with BaseNode
     with BindingPattern
     with Node
     with Parameter {
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var properties: js.Array[ObjectLiteralElementLike]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ObjectPattern
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object ObjectPattern {
  @scala.inline
  def apply(
    loc: SourceLocation,
    properties: js.Array[ObjectLiteralElementLike],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ObjectPattern,
    decorators: js.Array[Decorator] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    typeAnnotation: TSTypeAnnotation = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(loc = loc, properties = properties, range = range)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ObjectPattern]
  }
}

