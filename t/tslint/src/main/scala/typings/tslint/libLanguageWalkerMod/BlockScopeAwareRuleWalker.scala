package typings.tslint.libLanguageWalkerMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typings.tslint.libLanguageWalkerBlockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

