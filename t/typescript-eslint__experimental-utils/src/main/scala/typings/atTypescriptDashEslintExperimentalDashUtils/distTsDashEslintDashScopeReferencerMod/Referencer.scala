package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferencerMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorCallback
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.Visitor
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Referencer[SM /* <: ScopeManager */] extends Visitor {
  var isInnerMethodDefinition: Boolean = js.native
  var options: js.Any = js.native
  var parent: js.UndefOr[Node] = js.native
  var scopeManager: SM = js.native
  def ArrowFunctionExpression(node: Node): Unit = js.native
  def AssignmentExpression(node: Node): Unit = js.native
  def BlockStatement(node: Node): Unit = js.native
  def BreakStatement(): Unit = js.native
  def CallExpression(node: Node): Unit = js.native
  def CatchClause(node: Node): Unit = js.native
  def ClassDeclaration(node: Node): Unit = js.native
  def ClassExpression(node: Node): Unit = js.native
  def ContinueStatement(): Unit = js.native
  def ExportDeclaration(node: Node): Unit = js.native
  def ExportNamedDeclaration(node: Node): Unit = js.native
  def ExportSpecifier(node: Node): Unit = js.native
  def ForInStatement(node: Node): Unit = js.native
  def ForOfStatement(node: Node): Unit = js.native
  def ForStatement(node: Node): Unit = js.native
  def FunctionDeclaration(node: Node): Unit = js.native
  def FunctionExpression(node: Node): Unit = js.native
  def Identifier(node: Node): Unit = js.native
  def ImportDeclaration(node: Node): Unit = js.native
  def LabeledStatement(node: Node): Unit = js.native
  def MemberExpression(node: Node): Unit = js.native
  def MetaProperty(): Unit = js.native
  def MethodDefinition(node: Node): Unit = js.native
  def Program(node: Node): Unit = js.native
  def Property(node: Node): Unit = js.native
  def SwitchStatement(node: Node): Unit = js.native
  def ThisExpression(): Unit = js.native
  def UpdateExpression(node: Node): Unit = js.native
  def VariableDeclaration(node: Node): Unit = js.native
  def WithStatement(node: Node): Unit = js.native
  def close(node: Node): Unit = js.native
  def currentScope(): Scope = js.native
  def popInnerMethodDefinition(isInnerMethodDefinition: Boolean): Unit = js.native
  def pushInnerMethodDefinition(isInnerMethodDefinition: Boolean): Boolean = js.native
  def referencingDefaultValue(pattern: js.Any, assignments: js.Any, maybeImplicitGlobal: js.Any, init: Boolean): Unit = js.native
  def visitClass(node: Node): Unit = js.native
  def visitExportDeclaration(node: Node): Unit = js.native
  def visitForIn(node: Node): Unit = js.native
  def visitFunction(node: Node): Unit = js.native
  def visitPattern(node: Node, options: PatternVisitorOptions, callback: PatternVisitorCallback): Unit = js.native
  def visitProperty(node: Node): Unit = js.native
  def visitVariableDeclaration(variableTargetScope: js.Any, `type`: js.Any, node: Node, index: js.Any): Unit = js.native
}

