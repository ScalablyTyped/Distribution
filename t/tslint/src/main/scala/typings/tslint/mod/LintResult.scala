package typings.tslint.mod

import typings.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintResult extends StObject {
  
  var errorCount: Double
  
  var failures: js.Array[typings.tslint.libLanguageRuleRuleMod.RuleFailure]
  
  var fixes: js.UndefOr[js.Array[typings.tslint.libLanguageRuleRuleMod.RuleFailure]] = js.undefined
  
  var format: String | FormatterConstructor
  
  var output: String
  
  var warningCount: Double
}
object LintResult {
  
  inline def apply(
    errorCount: Double,
    failures: js.Array[typings.tslint.libLanguageRuleRuleMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LintResult] (val x: Self) extends AnyVal {
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: js.Array[typings.tslint.libLanguageRuleRuleMod.RuleFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresVarargs(value: typings.tslint.libLanguageRuleRuleMod.RuleFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setFixes(value: js.Array[typings.tslint.libLanguageRuleRuleMod.RuleFailure]): Self = StObject.set(x, "fixes", value.asInstanceOf[js.Any])
    
    inline def setFixesUndefined: Self = StObject.set(x, "fixes", js.undefined)
    
    inline def setFixesVarargs(value: typings.tslint.libLanguageRuleRuleMod.RuleFailure*): Self = StObject.set(x, "fixes", js.Array(value*))
    
    inline def setFormat(value: String | FormatterConstructor): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
  }
}
