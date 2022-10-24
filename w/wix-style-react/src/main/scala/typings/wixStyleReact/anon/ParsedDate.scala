package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedDate extends StObject {
  
  var dateFormat: Any
  
  var parsedDate: Unit
}
object ParsedDate {
  
  inline def apply(dateFormat: Any, parsedDate: Unit): ParsedDate = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], parsedDate = parsedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDate]
  }
  
  extension [Self <: ParsedDate](x: Self) {
    
    inline def setDateFormat(value: Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setParsedDate(value: Unit): Self = StObject.set(x, "parsedDate", value.asInstanceOf[js.Any])
  }
}
