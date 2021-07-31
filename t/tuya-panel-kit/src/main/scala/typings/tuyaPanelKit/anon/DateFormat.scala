package typings.tuyaPanelKit.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat extends StObject {
  
  def dateFormat(fmt: String, date: Date): Double
  
  def dateToTimer(timeStr: String): Double
  
  def parseHour12(second: Double): String
  
  def parseSecond(time: Double, n: Double): js.Array[String]
  
  def parseTimer(second: Double): String
  
  def parseTimers(second: Double): String
  
  def stringToSecond(timeStr: String): Double
  
  def timezone(): String
}
object DateFormat {
  
  @scala.inline
  def apply(
    dateFormat: (String, Date) => Double,
    dateToTimer: String => Double,
    parseHour12: Double => String,
    parseSecond: (Double, Double) => js.Array[String],
    parseTimer: Double => String,
    parseTimers: Double => String,
    stringToSecond: String => Double,
    timezone: () => String
  ): DateFormat = {
    val __obj = js.Dynamic.literal(dateFormat = js.Any.fromFunction2(dateFormat), dateToTimer = js.Any.fromFunction1(dateToTimer), parseHour12 = js.Any.fromFunction1(parseHour12), parseSecond = js.Any.fromFunction2(parseSecond), parseTimer = js.Any.fromFunction1(parseTimer), parseTimers = js.Any.fromFunction1(parseTimers), stringToSecond = js.Any.fromFunction1(stringToSecond), timezone = js.Any.fromFunction0(timezone))
    __obj.asInstanceOf[DateFormat]
  }
  
  @scala.inline
  implicit class DateFormatMutableBuilder[Self <: DateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: (String, Date) => Double): Self = StObject.set(x, "dateFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDateToTimer(value: String => Double): Self = StObject.set(x, "dateToTimer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseHour12(value: Double => String): Self = StObject.set(x, "parseHour12", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseSecond(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "parseSecond", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseTimer(value: Double => String): Self = StObject.set(x, "parseTimer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTimers(value: Double => String): Self = StObject.set(x, "parseTimers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringToSecond(value: String => Double): Self = StObject.set(x, "stringToSecond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimezone(value: () => String): Self = StObject.set(x, "timezone", js.Any.fromFunction0(value))
  }
}
