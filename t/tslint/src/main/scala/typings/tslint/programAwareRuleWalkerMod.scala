package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleWalkerMod.RuleWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", JSImport.Namespace)
@js.native
object programAwareRuleWalkerMod extends js.Object {
  @js.native
  class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    val program: js.Any = js.native
    val typeChecker: js.Any = js.native
    def getProgram(): Program = js.native
    def getTypeChecker(): TypeChecker = js.native
  }
  
}

