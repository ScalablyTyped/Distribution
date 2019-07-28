package typings.tslint.libLanguageWalkerProgramAwareRuleWalkerMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", "ProgramAwareRuleWalker")
@js.native
class ProgramAwareRuleWalker protected () extends RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  val program: js.Any = js.native
  val typeChecker: js.Any = js.native
  def getProgram(): Program = js.native
  def getTypeChecker(): TypeChecker = js.native
}

