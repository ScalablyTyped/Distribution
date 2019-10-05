package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopePatternVisitorMod

import org.scalablytyped.runtime.Instantiable3
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorCallback
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.Visitor
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternVisitor extends Visitor {
  var options: js.Any = js.native
  var parent: js.UndefOr[Node] = js.native
  var rightHandNodes: js.Array[Node] = js.native
  var scopeManager: ScopeManager = js.native
  def ArrayExpression(node: Node): Unit = js.native
  def ArrayPattern(pattern: Node): Unit = js.native
  def AssignmentExpression(node: Node): Unit = js.native
  def AssignmentPattern(pattern: Node): Unit = js.native
  def CallExpression(node: Node): Unit = js.native
  def Identifier(pattern: Node): Unit = js.native
  def MemberExpression(node: Node): Unit = js.native
  def Property(property: Node): Unit = js.native
  def RestElement(pattern: Node): Unit = js.native
  def SpreadElement(node: Node): Unit = js.native
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope/PatternVisitor", "PatternVisitor")
@js.native
object PatternVisitor
  extends Instantiable3[
      /* options */ PatternVisitorOptions, 
      /* rootPattern */ js.Any, 
      /* callback */ PatternVisitorCallback, 
      PatternVisitor
    ] {
  def isPattern(node: Node): Boolean = js.native
}

