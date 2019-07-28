package typings.tslint.libLanguageWalkerScopeAwareRuleWalkerMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/scopeAwareRuleWalker", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected () extends RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
  val scopeStack: js.Any = js.native
  def createScope(node: Node): T = js.native
  def getAllScopes(): js.Array[T] = js.native
  def getCurrentDepth(): Double = js.native
  def getCurrentScope(): T = js.native
  /* protected */ def isScopeBoundary(node: Node): Boolean = js.native
  def onScopeEnd(): Unit = js.native
  def onScopeStart(): Unit = js.native
}

