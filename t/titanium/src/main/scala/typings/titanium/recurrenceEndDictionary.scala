package typings.titanium

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary containing either `endDate` or `occurrenceCount` property.
  */
@js.native
trait recurrenceEndDictionary extends StObject {
  
  /**
    * End date of the recurrence end, or undefined if the recurrence end is count-based.
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /**
    * Occurrence count of the recurrence end, or 0 if the recurrence end is date-based.
    */
  var occurrenceCount: js.UndefOr[Double] = js.native
}
object recurrenceEndDictionary {
  
  @scala.inline
  def apply(): recurrenceEndDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[recurrenceEndDictionary]
  }
  
  @scala.inline
  implicit class recurrenceEndDictionaryMutableBuilder[Self <: recurrenceEndDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setOccurrenceCount(value: Double): Self = StObject.set(x, "occurrenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceCountUndefined: Self = StObject.set(x, "occurrenceCount", js.undefined)
  }
}
