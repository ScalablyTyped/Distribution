package typings.tslint.libLanguageWalkerMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected ()
  extends typings.tslint.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

