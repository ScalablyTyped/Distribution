package typings
package tslintLib.libLanguageWalkerWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/walker", "AbstractWalker")
@js.native
abstract class AbstractWalker[T] ()
  extends tslintLib.libLanguageWalkerWalkContextMod.WalkContext[T]
     with IWalker {
  /* CompleteClass */
  override def getFailures(): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def getSourceFile(): typescriptLib.typescriptMod.SourceFile = js.native
  /* CompleteClass */
  override def walk(sourceFile: typescriptLib.typescriptMod.SourceFile): scala.Unit = js.native
}

