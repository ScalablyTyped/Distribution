package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", JSImport.Namespace)
@js.native
object libLanguageWalkerMod extends js.Object {
  @js.native
  abstract class AbstractWalker[T] ()
    extends typings.tslint.libLanguageWalkerWalkerMod.AbstractWalker[T]
  
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typings.tslint.libLanguageWalkerBlockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typings.tslint.libLanguageWalkerProgramAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @js.native
  class RuleWalker protected ()
    extends typings.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typings.tslint.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class SyntaxWalker ()
    extends typings.tslint.libLanguageWalkerSyntaxWalkerMod.SyntaxWalker
  
  @js.native
  class WalkContext[T] protected ()
    extends typings.tslint.libLanguageWalkerWalkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
}

