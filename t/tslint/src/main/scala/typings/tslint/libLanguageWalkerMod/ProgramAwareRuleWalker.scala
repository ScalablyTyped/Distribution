package typings.tslint.libLanguageWalkerMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", "ProgramAwareRuleWalker")
@js.native
class ProgramAwareRuleWalker protected ()
  extends typings.tslint.libLanguageWalkerProgramAwareRuleWalkerMod.ProgramAwareRuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
}

