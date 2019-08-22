package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.get
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.init
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property
  extends BaseNode
     with Node
     with ObjectLiteralElementLike {
  var computed: Boolean
  var key: PropertyName
  var kind: init | get | set
  var method: Boolean
  var shorthand: Boolean
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Property
  var value: Expression | AssignmentPattern | BindingName
}

object Property {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PropertyName,
    kind: init | get | set,
    loc: SourceLocation,
    method: Boolean,
    range: Range,
    shorthand: Boolean,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.Property,
    value: Expression | AssignmentPattern | BindingName,
    parent: Node = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, method = method, range = range, shorthand = shorthand, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Property]
  }
}

