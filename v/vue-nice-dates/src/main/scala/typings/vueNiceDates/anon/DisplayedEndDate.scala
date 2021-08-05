package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayedEndDate extends StObject {
  
  var displayedEndDate: String | typings.std.Date | Null
  
  var displayedStartDate: String | typings.std.Date | Null
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
  
  var receivedDate: String | typings.std.Date | Null
}
object DisplayedEndDate {
  
  inline def apply(
    mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
  ): DisplayedEndDate = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any], displayedEndDate = null, displayedStartDate = null, receivedDate = null)
    __obj.asInstanceOf[DisplayedEndDate]
  }
  
  extension [Self <: DisplayedEndDate](x: Self) {
    
    inline def setDisplayedEndDate(value: String | typings.std.Date): Self = StObject.set(x, "displayedEndDate", value.asInstanceOf[js.Any])
    
    inline def setDisplayedEndDateNull: Self = StObject.set(x, "displayedEndDate", null)
    
    inline def setDisplayedStartDate(value: String | typings.std.Date): Self = StObject.set(x, "displayedStartDate", value.asInstanceOf[js.Any])
    
    inline def setDisplayedStartDateNull: Self = StObject.set(x, "displayedStartDate", null)
    
    inline def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]): Self = StObject.set(x, "mergedModifiers", value.asInstanceOf[js.Any])
    
    inline def setReceivedDate(value: String | typings.std.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedDateNull: Self = StObject.set(x, "receivedDate", null)
  }
}
