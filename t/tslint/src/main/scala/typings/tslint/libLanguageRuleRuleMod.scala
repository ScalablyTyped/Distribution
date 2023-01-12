package typings.tslint

import org.scalablytyped.runtime.Instantiable1
import typings.tslint.anon.OptionsAny
import typings.tslint.libLanguageWalkerWalkerMod.IWalker
import typings.tslint.tslintBooleans.`true`
import typings.typescript.mod.LineAndCharacter
import typings.typescript.mod.Node
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageRuleRuleMod {
  
  @JSImport("tslint/lib/language/rule/rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint/lib/language/rule/rule", "Replacement")
  @js.native
  open class Replacement protected () extends StObject {
    def this(start: Double, length: Double, text: String) = this()
    
    @JSName("apply")
    def apply(content: String): String = js.native
    
    def end: Double = js.native
    
    val length: Double = js.native
    
    val start: Double = js.native
    
    val text: String = js.native
    
    def toJson(): ReplacementJson = js.native
  }
  /* static members */
  object Replacement {
    
    @JSImport("tslint/lib/language/rule/rule", "Replacement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appendText(start: Double, text: String): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("appendText")(start.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Replacement]
    
    inline def applyAll(content: String, replacements: js.Array[Replacement]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAll")(content.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def applyFixes(content: String, fixes: js.Array[Fix]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFixes")(content.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def deleteFromTo(start: Double, end: Double): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Replacement]
    
    inline def deleteText(start: Double, length: Double): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteText")(start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Replacement]
    
    inline def replaceFromTo(start: Double, end: Double, text: String): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Replacement]
    
    inline def replaceNode(node: Node, text: String): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Replacement]
    inline def replaceNode(node: Node, text: String, sourceFile: SourceFile): Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Replacement]
  }
  
  @JSImport("tslint/lib/language/rule/rule", "RuleFailure")
  @js.native
  open class RuleFailure protected () extends StObject {
    def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
    def this(
      sourceFile: SourceFile,
      start: Double,
      end: Double,
      failure: String,
      ruleName: String,
      fix: js.Array[Replacement]
    ) = this()
    def this(
      sourceFile: SourceFile,
      start: Double,
      end: Double,
      failure: String,
      ruleName: String,
      fix: Replacement
    ) = this()
    
    /* private */ var createFailurePosition: Any = js.native
    
    /* private */ val endPosition: Any = js.native
    
    def equals(ruleFailure: RuleFailure): Boolean = js.native
    
    /* private */ val failure: Any = js.native
    
    /* private */ val fileName: Any = js.native
    
    /* private */ val fix: Any = js.native
    
    def getEndPosition(): RuleFailurePosition = js.native
    
    def getFailure(): String = js.native
    
    def getFileName(): String = js.native
    
    def getFix(): js.UndefOr[Replacement | js.Array[Replacement]] = js.native
    
    def getRawLines(): String = js.native
    
    def getRuleName(): String = js.native
    
    def getRuleSeverity(): RuleSeverity = js.native
    
    def getStartPosition(): RuleFailurePosition = js.native
    
    def hasFix(): Boolean = js.native
    
    /* private */ val rawLines: Any = js.native
    
    /* private */ val ruleName: Any = js.native
    
    /* private */ var ruleSeverity: Any = js.native
    
    def setRuleSeverity(value: RuleSeverity): Unit = js.native
    
    /* private */ val sourceFile: Any = js.native
    
    /* private */ val startPosition: Any = js.native
    
    def toJson(): IRuleFailureJson = js.native
  }
  /* static members */
  object RuleFailure {
    
    @JSImport("tslint/lib/language/rule/rule", "RuleFailure")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compare(a: RuleFailure, b: RuleFailure): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("tslint/lib/language/rule/rule", "RuleFailurePosition")
  @js.native
  open class RuleFailurePosition protected () extends StObject {
    def this(position: Double, lineAndCharacter: LineAndCharacter) = this()
    
    def equals(ruleFailurePosition: RuleFailurePosition): Boolean = js.native
    
    def getLineAndCharacter(): LineAndCharacter = js.native
    
    def getPosition(): Double = js.native
    
    /* private */ val lineAndCharacter: Any = js.native
    
    /* private */ val position: Any = js.native
    
    def toJson(): IRuleFailurePositionJson = js.native
  }
  
  inline def isTypedRule(rule: IRule): /* is tslint.tslint/lib/language/rule/rule.ITypedRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedRule")(rule.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.tslint/lib/language/rule/rule.ITypedRule */ Boolean]
  
  type Fix = Replacement | js.Array[Replacement]
  
  type FixJson = ReplacementJson | js.Array[ReplacementJson]
  
  trait ICodeExample extends StObject {
    
    var config: String
    
    var description: String
    
    var fail: js.UndefOr[String] = js.undefined
    
    var pass: String
  }
  object ICodeExample {
    
    inline def apply(config: String, description: String, pass: String): ICodeExample = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICodeExample]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICodeExample] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFail(value: String): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDisabledInterval extends StObject {
    
    var endPosition: Double
    
    var startPosition: Double
  }
  object IDisabledInterval {
    
    inline def apply(endPosition: Double, startPosition: Double): IDisabledInterval = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDisabledInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDisabledInterval] (val x: Self) extends AnyVal {
      
      inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions extends StObject {
    
    /**
      * @deprecated
      * Tslint now handles disables itself.
      * This will be empty.
      */
    var disabledIntervals: js.Array[IDisabledInterval]
    
    var ruleArguments: js.Array[Any]
    
    var ruleName: String
    
    var ruleSeverity: RuleSeverity
  }
  object IOptions {
    
    inline def apply(
      disabledIntervals: js.Array[IDisabledInterval],
      ruleArguments: js.Array[Any],
      ruleName: String,
      ruleSeverity: RuleSeverity
    ): IOptions = {
      val __obj = js.Dynamic.literal(disabledIntervals = disabledIntervals.asInstanceOf[js.Any], ruleArguments = ruleArguments.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setDisabledIntervals(value: js.Array[IDisabledInterval]): Self = StObject.set(x, "disabledIntervals", value.asInstanceOf[js.Any])
      
      inline def setDisabledIntervalsVarargs(value: IDisabledInterval*): Self = StObject.set(x, "disabledIntervals", js.Array(value*))
      
      inline def setRuleArguments(value: js.Array[Any]): Self = StObject.set(x, "ruleArguments", value.asInstanceOf[js.Any])
      
      inline def setRuleArgumentsVarargs(value: Any*): Self = StObject.set(x, "ruleArguments", js.Array(value*))
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleSeverity(value: RuleSeverity): Self = StObject.set(x, "ruleSeverity", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRule extends StObject {
    
    @JSName("apply")
    def apply(sourceFile: SourceFile): js.Array[RuleFailure]
    
    def applyWithWalker(walker: IWalker): js.Array[RuleFailure]
    
    def getOptions(): IOptions
    
    def isEnabled(): Boolean
  }
  object IRule {
    
    inline def apply(
      apply: SourceFile => js.Array[RuleFailure],
      applyWithWalker: IWalker => js.Array[RuleFailure],
      getOptions: () => IOptions,
      isEnabled: () => Boolean
    ): IRule = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
      __obj.asInstanceOf[IRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
      
      inline def setApply(value: SourceFile => js.Array[RuleFailure]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyWithWalker(value: IWalker => js.Array[RuleFailure]): Self = StObject.set(x, "applyWithWalker", js.Any.fromFunction1(value))
      
      inline def setGetOptions(value: () => IOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    }
  }
  
  trait IRuleFailureJson extends StObject {
    
    var endPosition: IRuleFailurePositionJson
    
    var failure: String
    
    var fix: js.UndefOr[FixJson] = js.undefined
    
    var name: String
    
    var ruleName: String
    
    var ruleSeverity: String
    
    var startPosition: IRuleFailurePositionJson
  }
  object IRuleFailureJson {
    
    inline def apply(
      endPosition: IRuleFailurePositionJson,
      failure: String,
      name: String,
      ruleName: String,
      ruleSeverity: String,
      startPosition: IRuleFailurePositionJson
    ): IRuleFailureJson = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRuleFailureJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuleFailureJson] (val x: Self) extends AnyVal {
      
      inline def setEndPosition(value: IRuleFailurePositionJson): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setFix(value: FixJson): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFixVarargs(value: ReplacementJson*): Self = StObject.set(x, "fix", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleSeverity(value: String): Self = StObject.set(x, "ruleSeverity", value.asInstanceOf[js.Any])
      
      inline def setStartPosition(value: IRuleFailurePositionJson): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRuleFailurePositionJson extends StObject {
    
    var character: Double
    
    var line: Double
    
    var position: Double
  }
  object IRuleFailurePositionJson {
    
    inline def apply(character: Double, line: Double, position: Double): IRuleFailurePositionJson = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRuleFailurePositionJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuleFailurePositionJson] (val x: Self) extends AnyVal {
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRuleMetadata extends StObject {
    
    /**
      * Examples demonstrating what the lint rule will pass and fail
      */
    var codeExamples: js.UndefOr[js.Array[ICodeExample]] = js.undefined
    
    /**
      * A rule deprecation message, if applicable.
      */
    var deprecationMessage: js.UndefOr[String] = js.undefined
    
    /**
      * A short, one line description of what the rule does.
      */
    var description: String
    
    /**
      * More elaborate details about the rule.
      */
    var descriptionDetails: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the rule will provide fix suggestions.
      */
    var hasFix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Examples of what a standard config for the rule might look like.
      * Using a string[] here is deprecated. Write the options as a JSON object instead.
      */
    var optionExamples: js.UndefOr[js.Array[`true` | js.Array[Any] | OptionsAny | String]] = js.undefined
    
    /**
      * Schema of the options the rule accepts.
      * The first boolean for whether the rule is enabled or not is already implied.
      * This field describes the options after that boolean.
      * If null, this rule has no options and is not configurable.
      */
    var options: Any
    
    /**
      * An explanation of the available options for the rule.
      */
    var optionsDescription: String
    
    /**
      * An explanation of why the rule is useful.
      */
    var rationale: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the rule requires type info to run.
      */
    var requiresTypeInfo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The kebab-case name of the rule.
      */
    var ruleName: String
    
    /**
      * The type of the rule - its overall purpose
      */
    var `type`: RuleType
    
    /**
      * Whether or not the rule use for TypeScript only. If `false`, this rule may be used with .js files.
      */
    var typescriptOnly: Boolean
  }
  object IRuleMetadata {
    
    inline def apply(
      description: String,
      options: Any,
      optionsDescription: String,
      ruleName: String,
      `type`: RuleType,
      typescriptOnly: Boolean
    ): IRuleMetadata = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsDescription = optionsDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], typescriptOnly = typescriptOnly.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRuleMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuleMetadata] (val x: Self) extends AnyVal {
      
      inline def setCodeExamples(value: js.Array[ICodeExample]): Self = StObject.set(x, "codeExamples", value.asInstanceOf[js.Any])
      
      inline def setCodeExamplesUndefined: Self = StObject.set(x, "codeExamples", js.undefined)
      
      inline def setCodeExamplesVarargs(value: ICodeExample*): Self = StObject.set(x, "codeExamples", js.Array(value*))
      
      inline def setDeprecationMessage(value: String): Self = StObject.set(x, "deprecationMessage", value.asInstanceOf[js.Any])
      
      inline def setDeprecationMessageUndefined: Self = StObject.set(x, "deprecationMessage", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDetails(value: String): Self = StObject.set(x, "descriptionDetails", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDetailsUndefined: Self = StObject.set(x, "descriptionDetails", js.undefined)
      
      inline def setHasFix(value: Boolean): Self = StObject.set(x, "hasFix", value.asInstanceOf[js.Any])
      
      inline def setHasFixUndefined: Self = StObject.set(x, "hasFix", js.undefined)
      
      inline def setOptionExamples(value: js.Array[`true` | js.Array[Any] | OptionsAny | String]): Self = StObject.set(x, "optionExamples", value.asInstanceOf[js.Any])
      
      inline def setOptionExamplesUndefined: Self = StObject.set(x, "optionExamples", js.undefined)
      
      inline def setOptionExamplesVarargs(value: (`true` | js.Array[Any] | OptionsAny | String)*): Self = StObject.set(x, "optionExamples", js.Array(value*))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsDescription(value: String): Self = StObject.set(x, "optionsDescription", value.asInstanceOf[js.Any])
      
      inline def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
      
      inline def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
      
      inline def setRequiresTypeInfo(value: Boolean): Self = StObject.set(x, "requiresTypeInfo", value.asInstanceOf[js.Any])
      
      inline def setRequiresTypeInfoUndefined: Self = StObject.set(x, "requiresTypeInfo", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypescriptOnly(value: Boolean): Self = StObject.set(x, "typescriptOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITypedRule
    extends StObject
       with IRule {
    
    def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure]
  }
  object ITypedRule {
    
    inline def apply(
      apply: SourceFile => js.Array[RuleFailure],
      applyWithProgram: (SourceFile, Program) => js.Array[RuleFailure],
      applyWithWalker: IWalker => js.Array[RuleFailure],
      getOptions: () => IOptions,
      isEnabled: () => Boolean
    ): ITypedRule = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithProgram = js.Any.fromFunction2(applyWithProgram), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
      __obj.asInstanceOf[ITypedRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITypedRule] (val x: Self) extends AnyVal {
      
      inline def setApplyWithProgram(value: (SourceFile, Program) => js.Array[RuleFailure]): Self = StObject.set(x, "applyWithProgram", js.Any.fromFunction2(value))
    }
  }
  
  trait ReplacementJson extends StObject {
    
    var innerLength: Double
    
    var innerStart: Double
    
    var innerText: String
  }
  object ReplacementJson {
    
    inline def apply(innerLength: Double, innerStart: Double, innerText: String): ReplacementJson = {
      val __obj = js.Dynamic.literal(innerLength = innerLength.asInstanceOf[js.Any], innerStart = innerStart.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacementJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplacementJson] (val x: Self) extends AnyVal {
      
      inline def setInnerLength(value: Double): Self = StObject.set(x, "innerLength", value.asInstanceOf[js.Any])
      
      inline def setInnerStart(value: Double): Self = StObject.set(x, "innerStart", value.asInstanceOf[js.Any])
      
      inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuleConstructor
    extends StObject
       with Instantiable1[/* options */ IOptions, IRule] {
    
    var metadata: IRuleMetadata = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintStrings.warning
    - typings.tslint.tslintStrings.error
    - typings.tslint.tslintStrings.off
  */
  trait RuleSeverity extends StObject
  object RuleSeverity {
    
    inline def error: typings.tslint.tslintStrings.error = "error".asInstanceOf[typings.tslint.tslintStrings.error]
    
    inline def off: typings.tslint.tslintStrings.off = "off".asInstanceOf[typings.tslint.tslintStrings.off]
    
    inline def warning: typings.tslint.tslintStrings.warning = "warning".asInstanceOf[typings.tslint.tslintStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintStrings.functionality
    - typings.tslint.tslintStrings.maintainability
    - typings.tslint.tslintStrings.style
    - typings.tslint.tslintStrings.typescript
    - typings.tslint.tslintStrings.formatting
  */
  trait RuleType extends StObject
  object RuleType {
    
    inline def formatting: typings.tslint.tslintStrings.formatting = "formatting".asInstanceOf[typings.tslint.tslintStrings.formatting]
    
    inline def functionality: typings.tslint.tslintStrings.functionality = "functionality".asInstanceOf[typings.tslint.tslintStrings.functionality]
    
    inline def maintainability: typings.tslint.tslintStrings.maintainability = "maintainability".asInstanceOf[typings.tslint.tslintStrings.maintainability]
    
    inline def style: typings.tslint.tslintStrings.style = "style".asInstanceOf[typings.tslint.tslintStrings.style]
    
    inline def typescript: typings.tslint.tslintStrings.typescript = "typescript".asInstanceOf[typings.tslint.tslintStrings.typescript]
  }
}
