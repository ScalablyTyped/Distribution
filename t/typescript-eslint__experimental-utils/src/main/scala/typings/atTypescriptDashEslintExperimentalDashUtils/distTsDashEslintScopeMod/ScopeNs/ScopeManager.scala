package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.ScopeNs

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var globalScope: Scope | Null = js.native
  var scopes: js.Array[Scope] = js.native
  def acquire(node: Node): Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): Scope | Null = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
}

