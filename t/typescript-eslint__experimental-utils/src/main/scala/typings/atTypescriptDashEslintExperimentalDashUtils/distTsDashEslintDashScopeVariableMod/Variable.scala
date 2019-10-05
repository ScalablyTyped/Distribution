package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
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

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope/Variable", "Variable")
@js.native
object Variable extends TopLevel[Instantiable0[Variable]]

