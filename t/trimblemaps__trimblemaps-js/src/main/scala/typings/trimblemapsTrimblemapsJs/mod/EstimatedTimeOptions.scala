package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsNumbers.`0`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsNumbers.`1`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedTimeOptions extends StObject {
  
  var dateAndTime: js.UndefOr[DateTimeType] = js.undefined
  
  var dateOption: js.UndefOr[`0` | `1` | `2`] = js.undefined
  
  var eTAETDType: js.UndefOr[`0` | `1`] = js.undefined
}
object EstimatedTimeOptions {
  
  inline def apply(): EstimatedTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedTimeOptions]
  }
  
  extension [Self <: EstimatedTimeOptions](x: Self) {
    
    inline def setDateAndTime(value: DateTimeType): Self = StObject.set(x, "dateAndTime", value.asInstanceOf[js.Any])
    
    inline def setDateAndTimeUndefined: Self = StObject.set(x, "dateAndTime", js.undefined)
    
    inline def setDateOption(value: `0` | `1` | `2`): Self = StObject.set(x, "dateOption", value.asInstanceOf[js.Any])
    
    inline def setDateOptionUndefined: Self = StObject.set(x, "dateOption", js.undefined)
    
    inline def setETAETDType(value: `0` | `1`): Self = StObject.set(x, "eTAETDType", value.asInstanceOf[js.Any])
    
    inline def setETAETDTypeUndefined: Self = StObject.set(x, "eTAETDType", js.undefined)
  }
}
