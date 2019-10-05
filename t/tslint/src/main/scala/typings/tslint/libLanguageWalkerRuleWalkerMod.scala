package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.Fix
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.Replacement
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import typings.tslint.libLanguageWalkerSyntaxWalkerMod.SyntaxWalker
import typings.tslint.libLanguageWalkerWalkerMod.IWalker
import typings.typescript.typescriptMod.LineAndCharacter
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/ruleWalker", JSImport.Namespace)
@js.native
object libLanguageWalkerRuleWalkerMod extends js.Object {
  @js.native
  class RuleWalker protected ()
    extends SyntaxWalker
       with IWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    val failures: js.Any = js.native
    val limit: js.Any = js.native
    val options: js.UndefOr[js.Any] = js.native
    val ruleName: js.Any = js.native
    val sourceFile: js.Any = js.native
    /** @deprecated Prefer `addFailureAt` and its variants. */
    def addFailure(failure: RuleFailure): Unit = js.native
    /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
    def addFailureAt(start: Double, width: Double, failure: String): Unit = js.native
    def addFailureAt(start: Double, width: Double, failure: String, fix: Fix): Unit = js.native
    /** Add a failure using a node's span. */
    def addFailureAtNode(node: Node, failure: String): Unit = js.native
    def addFailureAtNode(node: Node, failure: String, fix: Fix): Unit = js.native
    /** Like `addFailureAt` but uses start and end instead of start and width. */
    def addFailureFromStartToEnd(start: Double, end: Double, failure: String): Unit = js.native
    def addFailureFromStartToEnd(start: Double, end: Double, failure: String, fix: Fix): Unit = js.native
    def appendText(start: Double, text: String): Replacement = js.native
    /** @deprecated Prefer `addFailureAt` and its variants. */
    def createFailure(start: Double, width: Double, failure: String): RuleFailure = js.native
    def createFailure(start: Double, width: Double, failure: String, fix: Fix): RuleFailure = js.native
    def createReplacement(start: Double, length: Double, text: String): Replacement = js.native
    def deleteFromTo(start: Double, end: Double): Replacement = js.native
    def deleteText(start: Double, length: Double): Replacement = js.native
    /* CompleteClass */
    override def getFailures(): js.Array[RuleFailure] = js.native
    def getLimit(): Double = js.native
    def getLineAndCharacterOfPosition(position: Double): LineAndCharacter = js.native
    def getOptions(): js.Any = js.native
    def getRuleName(): String = js.native
    /* CompleteClass */
    override def getSourceFile(): SourceFile = js.native
    def hasOption(option: String): Boolean = js.native
    /* CompleteClass */
    override def walk(sourceFile: SourceFile): Unit = js.native
  }
  
}

