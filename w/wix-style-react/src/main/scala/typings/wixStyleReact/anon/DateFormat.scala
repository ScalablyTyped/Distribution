package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat extends StObject {
  
  var dateFormat: Any
  
  var parsedDate: js.Date | Null
}
object DateFormat {
  
  inline def apply(dateFormat: Any): DateFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], parsedDate = null)
    __obj.asInstanceOf[DateFormat]
  }
  
  extension [Self <: DateFormat](x: Self) {
    
    inline def setDateFormat(value: Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setParsedDate(value: js.Date): Self = StObject.set(x, "parsedDate", value.asInstanceOf[js.Any])
    
    inline def setParsedDateNull: Self = StObject.set(x, "parsedDate", null)
  }
}
