package typings
package tslintLib.libLanguageWalkerProgramAwareRuleWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", "ProgramAwareRuleWalker")
@js.native
class ProgramAwareRuleWalker protected ()
  extends tslintLib.libLanguageWalkerRuleWalkerMod.RuleWalker {
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, options: tslintLib.libLanguageRuleRuleMod.IOptions, program: typescriptLib.typescriptMod.Program) = this()
  val program: js.Any = js.native
  val typeChecker: js.Any = js.native
  def getProgram(): typescriptLib.typescriptMod.Program = js.native
  def getTypeChecker(): typescriptLib.typescriptMod.TypeChecker = js.native
}

