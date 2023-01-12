package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencies extends StObject {
  
  var currencies: js.Array[String]
  
  var dateFormat: String
  
  var fullDateFormat: String
  
  var longDateFormat: String
  
  var parseDate: String
  
  var parseDateTime: String
  
  var timeFormat: String
}
object Currencies {
  
  inline def apply(
    currencies: js.Array[String],
    dateFormat: String,
    fullDateFormat: String,
    longDateFormat: String,
    parseDate: String,
    parseDateTime: String,
    timeFormat: String
  ): Currencies = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], fullDateFormat = fullDateFormat.asInstanceOf[js.Any], longDateFormat = longDateFormat.asInstanceOf[js.Any], parseDate = parseDate.asInstanceOf[js.Any], parseDateTime = parseDateTime.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currencies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currencies] (val x: Self) extends AnyVal {
    
    inline def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    inline def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value*))
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setFullDateFormat(value: String): Self = StObject.set(x, "fullDateFormat", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormat(value: String): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    inline def setParseDate(value: String): Self = StObject.set(x, "parseDate", value.asInstanceOf[js.Any])
    
    inline def setParseDateTime(value: String): Self = StObject.set(x, "parseDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
  }
}
