package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary containing `daysOfWeek` and `week`.
  */
@js.native
trait daysOfTheWeekDictionary extends StObject {
  
  /**
    * The day of the week. Values are from 1 to 7, with Sunday being 1.
    */
  var daysOfWeek: js.UndefOr[Double] = js.native
  
  /**
    * The week number of the day of the week.
    * Values range from -53 to 53. A negative value indicates a value from the end of
    * the range. 0 indicates the week number is irrelevant.
    */
  var week: js.UndefOr[Double] = js.native
}
object daysOfTheWeekDictionary {
  
  @scala.inline
  def apply(): daysOfTheWeekDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[daysOfTheWeekDictionary]
  }
  
  @scala.inline
  implicit class daysOfTheWeekDictionaryMutableBuilder[Self <: daysOfTheWeekDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfWeek(value: Double): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    @scala.inline
    def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
