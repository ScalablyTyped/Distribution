package typings
package tslintLib.libLanguageWalkerBlockScopeAwareRuleWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/blockScopeAwareRuleWalker", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends tslintLib.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
  val blockScopeStack: js.Any = js.native
  var isBlockScopeBoundary: js.Any = js.native
  def createBlockScope(node: typescriptLib.typescriptMod.Node): U = js.native
  def findBlockScope(predicate: js.Function1[/* scope */ U, scala.Boolean]): js.UndefOr[U] = js.native
  def getAllBlockScopes(): js.Array[U] = js.native
  def getCurrentBlockDepth(): scala.Double = js.native
  def getCurrentBlockScope(): U = js.native
  def onBlockScopeEnd(): scala.Unit = js.native
  def onBlockScopeStart(): scala.Unit = js.native
}

