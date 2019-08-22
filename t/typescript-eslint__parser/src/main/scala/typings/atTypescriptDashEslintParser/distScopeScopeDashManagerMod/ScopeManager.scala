package typings.atTypescriptDashEslintParser.distScopeScopeDashManagerMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManagerOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.TSDeclareFunction
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.TSEnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/parser/dist/scope/scope-manager", "ScopeManager")
@js.native
class ScopeManager protected ()
  extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager {
  def this(options: ScopeManagerOptions) = this()
  /** @internal */
  def __nestEmptyFunctionScope(node: TSDeclareFunction): Scope = js.native
  /** @internal */
  def __nestEnumScope(node: TSEnumDeclaration): Scope = js.native
}

