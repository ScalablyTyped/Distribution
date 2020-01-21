package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", JSImport.Namespace)
@js.native
object walkerMod extends js.Object {
  @js.native
  abstract class AbstractWalker[T] ()
    extends typings.tslint.walkerWalkerMod.AbstractWalker[T]
  
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typings.tslint.blockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typings.tslint.programAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @js.native
  class RuleWalker protected ()
    extends typings.tslint.ruleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typings.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class SyntaxWalker ()
    extends typings.tslint.syntaxWalkerMod.SyntaxWalker
  
  @js.native
  class WalkContext[T] protected ()
    extends typings.tslint.walkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
}

