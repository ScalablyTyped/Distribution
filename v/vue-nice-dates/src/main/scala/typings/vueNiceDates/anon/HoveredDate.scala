package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredDate extends StObject {
  
  var hoveredDate: typings.std.Date | Null
  
  var receivedEndDate: String | typings.std.Date | Null
  
  var receivedStartDate: String | typings.std.Date | Null
}
object HoveredDate {
  
  inline def apply(): HoveredDate = {
    val __obj = js.Dynamic.literal(hoveredDate = null, receivedEndDate = null, receivedStartDate = null)
    __obj.asInstanceOf[HoveredDate]
  }
  
  extension [Self <: HoveredDate](x: Self) {
    
    inline def setHoveredDate(value: typings.std.Date): Self = StObject.set(x, "hoveredDate", value.asInstanceOf[js.Any])
    
    inline def setHoveredDateNull: Self = StObject.set(x, "hoveredDate", null)
    
    inline def setReceivedEndDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedEndDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedEndDateNull: Self = StObject.set(x, "receivedEndDate", null)
    
    inline def setReceivedStartDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedStartDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedStartDateNull: Self = StObject.set(x, "receivedStartDate", null)
  }
}
