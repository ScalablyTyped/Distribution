package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait filters extends StObject {
  
  var date: dateFilter
  
  var number: numberFilter
  
  var text: textFilter
}
object filters {
  
  inline def apply(date: dateFilter, number: numberFilter, text: textFilter): filters = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[filters]
  }
  
  extension [Self <: filters](x: Self) {
    
    inline def setDate(value: dateFilter): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: numberFilter): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setText(value: textFilter): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
