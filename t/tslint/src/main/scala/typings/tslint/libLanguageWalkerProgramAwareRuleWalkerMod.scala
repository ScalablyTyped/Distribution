package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageWalkerProgramAwareRuleWalkerMod {
  
  @JSImport("tslint/lib/language/walker/programAwareRuleWalker", "ProgramAwareRuleWalker")
  @js.native
  open class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    
    def getProgram(): Program = js.native
    
    def getTypeChecker(): TypeChecker = js.native
    
    /* private */ val program: Any = js.native
    
    /* private */ val typeChecker: Any = js.native
  }
}
