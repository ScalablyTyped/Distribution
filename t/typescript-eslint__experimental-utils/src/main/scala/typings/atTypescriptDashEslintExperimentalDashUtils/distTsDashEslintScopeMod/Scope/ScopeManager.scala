package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Scope | Null = js.native
  var scopes: js.Array[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Scope
  ] = js.native
  def acquire(node: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

