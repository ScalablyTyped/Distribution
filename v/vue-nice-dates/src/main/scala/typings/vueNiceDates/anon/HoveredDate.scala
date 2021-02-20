package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoveredDate extends StObject {
  
  var hoveredDate: typings.std.Date | Null = js.native
  
  var receivedEndDate: String | typings.std.Date | Null = js.native
  
  var receivedStartDate: String | typings.std.Date | Null = js.native
}
object HoveredDate {
  
  @scala.inline
  def apply(): HoveredDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoveredDate]
  }
  
  @scala.inline
  implicit class HoveredDateMutableBuilder[Self <: HoveredDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoveredDate(value: typings.std.Date): Self = StObject.set(x, "hoveredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredDateNull: Self = StObject.set(x, "hoveredDate", null)
    
    @scala.inline
    def setReceivedEndDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedEndDateNull: Self = StObject.set(x, "receivedEndDate", null)
    
    @scala.inline
    def setReceivedStartDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedStartDateNull: Self = StObject.set(x, "receivedStartDate", null)
  }
}
