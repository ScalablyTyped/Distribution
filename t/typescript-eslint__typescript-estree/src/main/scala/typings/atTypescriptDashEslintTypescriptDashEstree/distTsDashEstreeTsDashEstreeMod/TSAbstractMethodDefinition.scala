package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.constructor
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.get
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.method
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSAbstractMethodDefinition
  extends MethodDefinitionBase
     with ClassElement
     with Node
     with ObjectLiteralElementLike {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAbstractMethodDefinition
}

object TSAbstractMethodDefinition {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: method | get | set | constructor,
    loc: SourceLocation,
    range: Range,
    static: Boolean,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAbstractMethodDefinition,
    value: FunctionExpression | TSEmptyBodyFunctionExpression,
    accessibility: Accessibility = null,
    decorators: js.Array[Decorator] = null,
    parent: Node = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSAbstractMethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, range = range, static = static, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSAbstractMethodDefinition]
  }
}

