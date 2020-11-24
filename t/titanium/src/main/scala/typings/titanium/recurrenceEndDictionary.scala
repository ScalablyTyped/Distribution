package typings.titanium

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary containing either `endDate` or `occurrenceCount` property.
  */
@js.native
trait recurrenceEndDictionary extends js.Object {
  
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
  implicit class recurrenceEndDictionaryOps[Self <: recurrenceEndDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setOccurrenceCount(value: Double): Self = this.set("occurrenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceCount: Self = this.set("occurrenceCount", js.undefined)
  }
}
