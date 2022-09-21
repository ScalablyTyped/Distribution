package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.am
import typings.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.pm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeControlMod {
  
  @JSImport("@wordpress/customize-browser/DateTimeControl", "DateTimeControl")
  @js.native
  open class DateTimeControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def convertHourToTwentyFourHourFormat(hourInTwelveHourFormat: String, meridian: am | pm): String = js.native
    
    def convertInputDateToString(): String = js.native
    
    def isFutureDate(): Boolean = js.native
    
    def parseDateTime(datetime: String): DateTime | Null = js.native
    
    def populateDateInputs(): Boolean = js.native
    
    def populateSetting(): Boolean = js.native
    
    def toggleFutureDateNotification(notify: Boolean): DateTimeControl = js.native
    
    def updateDaysForMonth(): Unit = js.native
    
    def validateInputs(): Boolean = js.native
  }
  
  trait DateTime extends StObject {
    
    var day: String
    
    var hour: String
    
    var minute: String
    
    var month: String
    
    var second: String
    
    var year: String
  }
  object DateTime {
    
    inline def apply(day: String, hour: String, minute: String, month: String, second: String, year: String): DateTime = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTime]
    }
    
    extension [Self <: DateTime](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
