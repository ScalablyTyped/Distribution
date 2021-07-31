package typings.tslint.mod

import typings.tslint.formatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintResult extends StObject {
  
  var errorCount: Double
  
  var failures: js.Array[typings.tslint.ruleMod.RuleFailure]
  
  var fixes: js.UndefOr[js.Array[typings.tslint.ruleMod.RuleFailure]] = js.undefined
  
  var format: String | FormatterConstructor
  
  var output: String
  
  var warningCount: Double
}
object LintResult {
  
  @scala.inline
  def apply(
    errorCount: Double,
    failures: js.Array[typings.tslint.ruleMod.RuleFailure],
    format: String | FormatterConstructor,
    output: String,
    warningCount: Double
  ): LintResult = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  
  @scala.inline
  implicit class LintResultMutableBuilder[Self <: LintResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailures(value: js.Array[typings.tslint.ruleMod.RuleFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresVarargs(value: typings.tslint.ruleMod.RuleFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setFixes(value: js.Array[typings.tslint.ruleMod.RuleFailure]): Self = StObject.set(x, "fixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixesUndefined: Self = StObject.set(x, "fixes", js.undefined)
    
    @scala.inline
    def setFixesVarargs(value: typings.tslint.ruleMod.RuleFailure*): Self = StObject.set(x, "fixes", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String | FormatterConstructor): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
  }
}
