package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var defs: js.Array[Definition]
  var eslintUsed: js.UndefOr[Boolean] = js.undefined
  var identifiers: js.Array[Identifier]
  var name: String
  var references: js.Array[Reference]
}

object Variable {
  @scala.inline
  def apply(
    defs: js.Array[Definition],
    identifiers: js.Array[Identifier],
    name: String,
    references: js.Array[Reference],
    eslintUsed: js.UndefOr[Boolean] = js.undefined
  ): Variable = {
    val __obj = js.Dynamic.literal(defs = defs, identifiers = identifiers, name = name, references = references)
    if (!js.isUndefined(eslintUsed)) __obj.updateDynamic("eslintUsed")(eslintUsed)
    __obj.asInstanceOf[Variable]
  }
}

