package typings
package tslintLib.libLanguageWalkerScopeAwareRuleWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/scopeAwareRuleWalker", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected ()
  extends tslintLib.libLanguageWalkerRuleWalkerMod.RuleWalker {
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
  val scopeStack: js.Any = js.native
  def createScope(node: typescriptLib.typescriptMod.Node): T = js.native
  def getAllScopes(): js.Array[T] = js.native
  def getCurrentDepth(): scala.Double = js.native
  def getCurrentScope(): T = js.native
  /* protected */ def isScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def onScopeEnd(): scala.Unit = js.native
  def onScopeStart(): scala.Unit = js.native
}

