package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  /**
    * End of the date range.
    */
  var end: js.Date
  
  /**
    * Start of the date range.
    */
  var start: js.Date
}
object DateRange {
  
  inline def apply(end: js.Date, start: js.Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
