package typings.winrt.Windows.Globalization

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendar extends StObject {
  
  def addDays(days: Double): Unit = js.native
  
  def addEras(eras: Double): Unit = js.native
  
  def addHours(hours: Double): Unit = js.native
  
  def addMinutes(minutes: Double): Unit = js.native
  
  def addMonths(months: Double): Unit = js.native
  
  def addNanoseconds(nanoseconds: Double): Unit = js.native
  
  def addPeriods(periods: Double): Unit = js.native
  
  def addSeconds(seconds: Double): Unit = js.native
  
  def addWeeks(weeks: Double): Unit = js.native
  
  def addYears(years: Double): Unit = js.native
  
  def changeCalendarSystem(value: String): Unit = js.native
  
  def changeClock(value: String): Unit = js.native
  
  def compare(other: Calendar): Double = js.native
  
  def compareDateTime(other: Date): Double = js.native
  
  def copyTo(other: Calendar): Unit = js.native
  
  var day: Double = js.native
  
  def dayAsPaddedString(minDigits: Double): String = js.native
  
  def dayAsString(): String = js.native
  
  var dayOfWeek: DayOfWeek = js.native
  
  def dayOfWeekAsSoloString(): String = js.native
  def dayOfWeekAsSoloString(idealLength: Double): String = js.native
  
  def dayOfWeekAsString(): String = js.native
  def dayOfWeekAsString(idealLength: Double): String = js.native
  
  var era: Double = js.native
  
  def eraAsString(): String = js.native
  def eraAsString(idealLength: Double): String = js.native
  
  var firstDayInThisMonth: Double = js.native
  
  var firstEra: Double = js.native
  
  var firstHourInThisPeriod: Double = js.native
  
  var firstMinuteInThisHour: Double = js.native
  
  var firstMonthInThisYear: Double = js.native
  
  var firstPeriodInThisDay: Double = js.native
  
  var firstSecondInThisMinute: Double = js.native
  
  var firstYearInThisEra: Double = js.native
  
  def getCalendarSystem(): String = js.native
  
  def getClock(): String = js.native
  
  def getDateTime(): Date = js.native
  
  var hour: Double = js.native
  
  def hourAsPaddedString(minDigits: Double): String = js.native
  
  def hourAsString(): String = js.native
  
  var isDaylightSavingTime: Boolean = js.native
  
  var languages: IVectorView[String] = js.native
  
  var lastDayInThisMonth: Double = js.native
  
  var lastEra: Double = js.native
  
  var lastHourInThisPeriod: Double = js.native
  
  var lastMinuteInThisHour: Double = js.native
  
  var lastMonthInThisYear: Double = js.native
  
  var lastPeriodInThisDay: Double = js.native
  
  var lastSecondInThisMinute: Double = js.native
  
  var lastYearInThisEra: Double = js.native
  
  var minute: Double = js.native
  
  def minuteAsPaddedString(minDigits: Double): String = js.native
  
  def minuteAsString(): String = js.native
  
  var month: Double = js.native
  
  def monthAsNumericString(): String = js.native
  
  def monthAsPaddedNumericString(minDigits: Double): String = js.native
  
  def monthAsSoloString(): String = js.native
  def monthAsSoloString(idealLength: Double): String = js.native
  
  def monthAsString(): String = js.native
  def monthAsString(idealLength: Double): String = js.native
  
  var nanosecond: Double = js.native
  
  def nanosecondAsPaddedString(minDigits: Double): String = js.native
  
  def nanosecondAsString(): String = js.native
  
  var numberOfDaysInThisMonth: Double = js.native
  
  var numberOfEras: Double = js.native
  
  var numberOfHoursInThisPeriod: Double = js.native
  
  var numberOfMinutesInThisHour: Double = js.native
  
  var numberOfMonthsInThisYear: Double = js.native
  
  var numberOfPeriodsInThisDay: Double = js.native
  
  var numberOfSecondsInThisMinute: Double = js.native
  
  var numberOfYearsInThisEra: Double = js.native
  
  var numeralSystem: String = js.native
  
  var period: Double = js.native
  
  def periodAsString(): String = js.native
  def periodAsString(idealLength: Double): String = js.native
  
  var resolvedLanguage: String = js.native
  
  var second: Double = js.native
  
  def secondAsPaddedString(minDigits: Double): String = js.native
  
  def secondAsString(): String = js.native
  
  def setDateTime(value: Date): Unit = js.native
  
  def setToMax(): Unit = js.native
  
  def setToMin(): Unit = js.native
  
  def setToNow(): Unit = js.native
  
  var year: Double = js.native
  
  def yearAsPaddedString(minDigits: Double): String = js.native
  
  def yearAsString(): String = js.native
  
  def yearAsTruncatedString(remainingDigits: Double): String = js.native
}
