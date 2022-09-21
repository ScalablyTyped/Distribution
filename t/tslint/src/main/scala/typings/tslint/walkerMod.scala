package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("tslint/lib/language/walker", "AbstractWalker")
  @js.native
  abstract class AbstractWalker[T] protected ()
    extends typings.tslint.walkerWalkerMod.AbstractWalker[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "BlockScopeAwareRuleWalker")
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typings.tslint.blockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "ProgramAwareRuleWalker")
  @js.native
  open class ProgramAwareRuleWalker protected ()
    extends typings.tslint.programAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "RuleWalker")
  @js.native
  open class RuleWalker protected ()
    extends typings.tslint.ruleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "ScopeAwareRuleWalker")
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typings.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "SyntaxWalker")
  @js.native
  open class SyntaxWalker ()
    extends typings.tslint.syntaxWalkerMod.SyntaxWalker
  
  @JSImport("tslint/lib/language/walker", "WalkContext")
  @js.native
  open class WalkContext[T] protected ()
    extends typings.tslint.walkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
}
