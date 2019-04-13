package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected ()
  extends tslintLib.libLanguageWalkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
}

