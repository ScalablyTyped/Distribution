package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleWalkerMod.RuleWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programAwareRuleWalkerMod {
  
  @JSImport("tslint/lib/language/walker/programAwareRuleWalker", "ProgramAwareRuleWalker")
  @js.native
  class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    
    def getProgram(): Program = js.native
    
    def getTypeChecker(): TypeChecker = js.native
    
    val program: js.Any = js.native
    
    val typeChecker: js.Any = js.native
  }
}
