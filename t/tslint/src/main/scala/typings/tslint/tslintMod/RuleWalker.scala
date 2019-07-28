package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typings.tslint.libLanguageWalkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

