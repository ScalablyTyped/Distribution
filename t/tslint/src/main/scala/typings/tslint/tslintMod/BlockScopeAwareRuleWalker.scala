package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typings.tslint.libLanguageWalkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

