package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  /**
  			 * The column of the inclusive start position of the warning.
  			 */
  var column: Double
  
  /**
  			 * The column of the exclusive end position of the warning.
  			 */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The line of the exclusive end position of the warning.
  			 */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The line of the inclusive start position of the warning.
  			 */
  var line: Double
  
  var rule: String
  
  var severity: Severity
  
  var stylelintType: js.UndefOr[String] = js.undefined
  
  var text: String
}
object Warning {
  
  inline def apply(column: Double, line: Double, rule: String, severity: Severity, text: String): Warning = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  extension [Self <: Warning](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setStylelintType(value: String): Self = StObject.set(x, "stylelintType", value.asInstanceOf[js.Any])
    
    inline def setStylelintTypeUndefined: Self = StObject.set(x, "stylelintType", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
