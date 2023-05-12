package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait WarningOptions
  extends StObject
     with typings.postcss.libWarningMod.WarningOptions {
  
  var rule: js.UndefOr[String] = js.undefined
  
  var severity: js.UndefOr[Severity] = js.undefined
  
  var stylelintType: js.UndefOr[String] = js.undefined
}
object WarningOptions {
  
  inline def apply(): WarningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningOptions] (val x: Self) extends AnyVal {
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStylelintType(value: String): Self = StObject.set(x, "stylelintType", value.asInstanceOf[js.Any])
    
    inline def setStylelintTypeUndefined: Self = StObject.set(x, "stylelintType", js.undefined)
  }
}
