package typings.stylelint.mod

import typings.stylelint.anon.Reference
import typings.stylelint.anon.Text
import typings.stylelint.anon.WarningstylelintTypestrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintResult extends StObject {
  
  /**
  			 * Internal use only. Do not use or rely on this property. It may
  			 * change at any time.
  			 * @internal
  			 */
  var _postcssResult: js.UndefOr[PostcssResult] = js.undefined
  
  var deprecations: js.Array[Reference]
  
  var errored: js.UndefOr[Boolean] = js.undefined
  
  var ignored: js.UndefOr[Boolean] = js.undefined
  
  var invalidOptionWarnings: js.Array[Text]
  
  var parseErrors: js.Array[WarningstylelintTypestrin]
  
  var source: js.UndefOr[String] = js.undefined
  
  var warnings: js.Array[Warning]
}
object LintResult {
  
  inline def apply(
    deprecations: js.Array[Reference],
    invalidOptionWarnings: js.Array[Text],
    parseErrors: js.Array[WarningstylelintTypestrin],
    warnings: js.Array[Warning]
  ): LintResult = {
    val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], parseErrors = parseErrors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  
  extension [Self <: LintResult](x: Self) {
    
    inline def setDeprecations(value: js.Array[Reference]): Self = StObject.set(x, "deprecations", value.asInstanceOf[js.Any])
    
    inline def setDeprecationsVarargs(value: Reference*): Self = StObject.set(x, "deprecations", js.Array(value*))
    
    inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setInvalidOptionWarnings(value: js.Array[Text]): Self = StObject.set(x, "invalidOptionWarnings", value.asInstanceOf[js.Any])
    
    inline def setInvalidOptionWarningsVarargs(value: Text*): Self = StObject.set(x, "invalidOptionWarnings", js.Array(value*))
    
    inline def setParseErrors(value: js.Array[WarningstylelintTypestrin]): Self = StObject.set(x, "parseErrors", value.asInstanceOf[js.Any])
    
    inline def setParseErrorsVarargs(value: WarningstylelintTypestrin*): Self = StObject.set(x, "parseErrors", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value*))
    
    inline def set_postcssResult(value: PostcssResult): Self = StObject.set(x, "_postcssResult", value.asInstanceOf[js.Any])
    
    inline def set_postcssResultUndefined: Self = StObject.set(x, "_postcssResult", js.undefined)
  }
}
