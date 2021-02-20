package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayedEndDate extends StObject {
  
  var displayedEndDate: String | typings.std.Date | Null = js.native
  
  var displayedStartDate: String | typings.std.Date | Null = js.native
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]] = js.native
  
  var receivedDate: String | typings.std.Date | Null = js.native
}
object DisplayedEndDate {
  
  @scala.inline
  def apply(
    mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
  ): DisplayedEndDate = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayedEndDate]
  }
  
  @scala.inline
  implicit class DisplayedEndDateMutableBuilder[Self <: DisplayedEndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayedEndDate(value: String | typings.std.Date): Self = StObject.set(x, "displayedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedEndDateNull: Self = StObject.set(x, "displayedEndDate", null)
    
    @scala.inline
    def setDisplayedStartDate(value: String | typings.std.Date): Self = StObject.set(x, "displayedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedStartDateNull: Self = StObject.set(x, "displayedStartDate", null)
    
    @scala.inline
    def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]): Self = StObject.set(x, "mergedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
