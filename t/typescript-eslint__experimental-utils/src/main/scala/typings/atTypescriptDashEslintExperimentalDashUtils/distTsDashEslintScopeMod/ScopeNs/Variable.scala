package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.ScopeNs

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
  var scope: Scope
}

object Variable {
  @scala.inline
  def apply(
    defs: js.Array[Definition],
    identifiers: js.Array[Identifier],
    name: String,
    references: js.Array[Reference],
    scope: Scope,
    eslintUsed: js.UndefOr[Boolean] = js.undefined
  ): Variable = {
    val __obj = js.Dynamic.literal(defs = defs, identifiers = identifiers, name = name, references = references, scope = scope)
    if (!js.isUndefined(eslintUsed)) __obj.updateDynamic("eslintUsed")(eslintUsed)
    __obj.asInstanceOf[Variable]
  }
}

