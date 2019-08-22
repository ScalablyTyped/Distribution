package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.ScopeNs

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.TDZ
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`catch`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`class`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`for`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`function-expression-name`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.`with`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.block
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.function
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.global
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.module
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.switch
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var block: Node
  var childScopes: js.Array[Scope]
  var functionExpressionScope: Boolean
  var isStrict: Boolean
  var references: js.Array[Reference]
  var set: Map[String, Variable]
  var through: js.Array[Reference]
  var `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ
  var upper: Scope | Null
  var variableScope: Scope
  var variables: js.Array[Variable]
}

object Scope {
  @scala.inline
  def apply(
    block: Node,
    childScopes: js.Array[Scope],
    functionExpressionScope: Boolean,
    isStrict: Boolean,
    references: js.Array[Reference],
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: block | `catch` | `class` | `for` | function | `function-expression-name` | global | module | switch | `with` | TDZ,
    variableScope: Scope,
    variables: js.Array[Variable],
    upper: Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(block = block, childScopes = childScopes, functionExpressionScope = functionExpressionScope, isStrict = isStrict, references = references, set = set, through = through, variableScope = variableScope, variables = variables)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[Scope]
  }
}

