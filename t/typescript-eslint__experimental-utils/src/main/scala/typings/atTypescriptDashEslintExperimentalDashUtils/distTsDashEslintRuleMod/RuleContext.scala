package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter.ParserOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Scope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.Variable
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleContext[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */] extends js.Object {
  /**
    * The rule ID.
    */
  var id: String
  /**
    * An array of the configured options for this rule.
    * This array does not include the rule severity.
    */
  var options: TOptions
  /**
    * The parser options configured for this run
    */
  var parserOptions: ParserOptions
  /**
    * The name of the parser from configuration.
    */
  var parserPath: String
  /**
    * An object containing parser-provided services for rules
    */
  var parserServices: js.UndefOr[ParserServices] = js.undefined
  /**
    * Returns an array of the ancestors of the currently-traversed node, starting at
    * the root of the AST and continuing through the direct parent of the current node.
    * This array does not include the currently-traversed node itself.
    */
  def getAncestors(): js.Array[Node]
  /**
    * Returns a list of variables declared by the given node.
    * This information can be used to track references to variables.
    */
  def getDeclaredVariables(node: Node): js.Array[Variable]
  /**
    * Returns the filename associated with the source.
    */
  def getFilename(): String
  /**
    * Returns the scope of the currently-traversed node.
    * This information can be used track references to variables.
    */
  def getScope(): Scope
  /**
    * Returns a SourceCode object that you can use to work with the source that
    * was passed to ESLint.
    */
  def getSourceCode(): SourceCode
  /**
    * Marks a variable with the given name in the current scope as used.
    * This affects the no-unused-vars rule.
    */
  def markVariableAsUsed(name: String): Boolean
  /**
    * Reports a problem in the code.
    */
  def report(descriptor: ReportDescriptor[TMessageIds]): Unit
}

object RuleContext {
  @scala.inline
  def apply[TMessageIds /* <: String */, TOptions /* <: js.Array[_] */](
    getAncestors: () => js.Array[Node],
    getDeclaredVariables: Node => js.Array[Variable],
    getFilename: () => String,
    getScope: () => Scope,
    getSourceCode: () => SourceCode,
    id: String,
    markVariableAsUsed: String => Boolean,
    options: TOptions,
    parserOptions: ParserOptions,
    parserPath: String,
    report: ReportDescriptor[TMessageIds] => Unit,
    parserServices: ParserServices = null
  ): RuleContext[TMessageIds, TOptions] = {
    val __obj = js.Dynamic.literal(getAncestors = js.Any.fromFunction0(getAncestors), getDeclaredVariables = js.Any.fromFunction1(getDeclaredVariables), getFilename = js.Any.fromFunction0(getFilename), getScope = js.Any.fromFunction0(getScope), getSourceCode = js.Any.fromFunction0(getSourceCode), id = id, markVariableAsUsed = js.Any.fromFunction1(markVariableAsUsed), options = options.asInstanceOf[js.Any], parserOptions = parserOptions, parserPath = parserPath, report = js.Any.fromFunction1(report))
    if (parserServices != null) __obj.updateDynamic("parserServices")(parserServices)
    __obj.asInstanceOf[RuleContext[TMessageIds, TOptions]]
  }
}

