package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Months extends StObject {
  
  var ariaLabel: Any
  
  var ariaLabelledBy: Any
  
  var className: Any
  
  var date: Any
  
  var months: Any
  
  var onChange: Any
}
object Months {
  
  inline def apply(ariaLabel: Any, ariaLabelledBy: Any, className: Any, date: Any, months: Any, onChange: Any): Months = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelledBy = ariaLabelledBy.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Months]
  }
  
  extension [Self <: Months](x: Self) {
    
    inline def setAriaLabel(value: Any): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledBy(value: Any): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Any): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
