package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stylelint.anon.FoundWarnings
import typings.stylelint.anon.PartialRuleMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinterResult extends StObject {
  
  /**
  			 * The working directory from which the linter was run when the
  			 * results were generated.
  			 */
  var cwd: String
  
  var descriptionlessDisables: js.UndefOr[DisableOptionsReport] = js.undefined
  
  var errored: Boolean
  
  var invalidScopeDisables: js.UndefOr[DisableOptionsReport] = js.undefined
  
  var maxWarningsExceeded: js.UndefOr[FoundWarnings] = js.undefined
  
  var needlessDisables: js.UndefOr[DisableOptionsReport] = js.undefined
  
  var output: Any
  
  var reportedDisables: DisableOptionsReport
  
  var results: js.Array[LintResult]
  
  /**
  			 * Each rule metadata by name.
  			 */
  var ruleMetadata: StringDictionary[PartialRuleMeta]
}
object LinterResult {
  
  inline def apply(
    cwd: String,
    errored: Boolean,
    output: Any,
    reportedDisables: DisableOptionsReport,
    results: js.Array[LintResult],
    ruleMetadata: StringDictionary[PartialRuleMeta]
  ): LinterResult = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], errored = errored.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reportedDisables = reportedDisables.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], ruleMetadata = ruleMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinterResult]
  }
  
  extension [Self <: LinterResult](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setDescriptionlessDisables(value: DisableOptionsReport): Self = StObject.set(x, "descriptionlessDisables", value.asInstanceOf[js.Any])
    
    inline def setDescriptionlessDisablesUndefined: Self = StObject.set(x, "descriptionlessDisables", js.undefined)
    
    inline def setDescriptionlessDisablesVarargs(value: DisableReportEntry*): Self = StObject.set(x, "descriptionlessDisables", js.Array(value*))
    
    inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setInvalidScopeDisables(value: DisableOptionsReport): Self = StObject.set(x, "invalidScopeDisables", value.asInstanceOf[js.Any])
    
    inline def setInvalidScopeDisablesUndefined: Self = StObject.set(x, "invalidScopeDisables", js.undefined)
    
    inline def setInvalidScopeDisablesVarargs(value: DisableReportEntry*): Self = StObject.set(x, "invalidScopeDisables", js.Array(value*))
    
    inline def setMaxWarningsExceeded(value: FoundWarnings): Self = StObject.set(x, "maxWarningsExceeded", value.asInstanceOf[js.Any])
    
    inline def setMaxWarningsExceededUndefined: Self = StObject.set(x, "maxWarningsExceeded", js.undefined)
    
    inline def setNeedlessDisables(value: DisableOptionsReport): Self = StObject.set(x, "needlessDisables", value.asInstanceOf[js.Any])
    
    inline def setNeedlessDisablesUndefined: Self = StObject.set(x, "needlessDisables", js.undefined)
    
    inline def setNeedlessDisablesVarargs(value: DisableReportEntry*): Self = StObject.set(x, "needlessDisables", js.Array(value*))
    
    inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setReportedDisables(value: DisableOptionsReport): Self = StObject.set(x, "reportedDisables", value.asInstanceOf[js.Any])
    
    inline def setReportedDisablesVarargs(value: DisableReportEntry*): Self = StObject.set(x, "reportedDisables", js.Array(value*))
    
    inline def setResults(value: js.Array[LintResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: LintResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setRuleMetadata(value: StringDictionary[PartialRuleMeta]): Self = StObject.set(x, "ruleMetadata", value.asInstanceOf[js.Any])
  }
}
