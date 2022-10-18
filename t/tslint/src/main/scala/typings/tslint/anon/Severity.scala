package typings.tslint.anon

import typings.tslint.libLanguageRuleRuleMod.RuleSeverity
import typings.tslint.tslintStrings.default
import typings.tslint.tslintStrings.none
import typings.tslint.tslintStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  var options: js.UndefOr[Any] = js.undefined
  
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.undefined
}
object Severity {
  
  inline def apply(): Severity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Severity]
  }
  
  extension [Self <: Severity](x: Self) {
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSeverity(value: RuleSeverity | warn | none | default): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
