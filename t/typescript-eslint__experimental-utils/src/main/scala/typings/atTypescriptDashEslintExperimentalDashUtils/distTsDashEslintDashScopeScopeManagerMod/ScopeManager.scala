package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeManager extends js.Object {
  var __currentScope: Scope = js.native
  var __options: ScopeManagerOptions = js.native
  var globalScope: Scope = js.native
  var scopes: js.Array[Scope] = js.native
  def __get(node: Node): Scope = js.native
  def __ignoreEval(): Boolean = js.native
  def __isES6(): Boolean = js.native
  def __isNodejsScope(): Boolean = js.native
  def __isOptimistic(): Boolean = js.native
  def __nestBlockScope(node: Node): Scope = js.native
  def __nestCatchScope(node: Node): Scope = js.native
  def __nestClassScope(node: Node): Scope = js.native
  def __nestForScope(node: Node): Scope = js.native
  def __nestFunctionExpressionNameScope(node: Node): Scope = js.native
  def __nestFunctionScope(node: Node, isMethodDefinition: Boolean): Scope = js.native
  def __nestGlobalScope(node: Node): Scope = js.native
  def __nestModuleScope(node: Node): Scope = js.native
  def __nestScope(scope: Scope): Scope = js.native
  def __nestSwitchScope(node: Node): Scope = js.native
  def __nestWithScope(node: Node): Scope = js.native
  def __useDirective(): Boolean = js.native
  def acquire(node: Node): Scope | Null = js.native
  def acquire(node: Node, inner: Boolean): Scope | Null = js.native
  def acquireAll(node: Node): Scope | Null = js.native
  def attach(): Unit = js.native
  def detach(): Unit = js.native
  def getDeclaredVariables(node: Node): js.Array[Variable] = js.native
  def isImpliedStrict(): Boolean = js.native
  def isModule(): Boolean = js.native
  def isStrictModeSupported(): Boolean = js.native
  def release(node: Node): Scope | Null = js.native
  def release(node: Node, inner: Boolean): Scope | Null = js.native
}

