package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendar extends js.Object {
  var day: scala.Double = js.native
  var dayOfWeek: DayOfWeek = js.native
  var era: scala.Double = js.native
  var firstDayInThisMonth: scala.Double = js.native
  var firstEra: scala.Double = js.native
  var firstHourInThisPeriod: scala.Double = js.native
  var firstMinuteInThisHour: scala.Double = js.native
  var firstMonthInThisYear: scala.Double = js.native
  var firstPeriodInThisDay: scala.Double = js.native
  var firstSecondInThisMinute: scala.Double = js.native
  var firstYearInThisEra: scala.Double = js.native
  var hour: scala.Double = js.native
  var isDaylightSavingTime: scala.Boolean = js.native
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  var lastDayInThisMonth: scala.Double = js.native
  var lastEra: scala.Double = js.native
  var lastHourInThisPeriod: scala.Double = js.native
  var lastMinuteInThisHour: scala.Double = js.native
  var lastMonthInThisYear: scala.Double = js.native
  var lastPeriodInThisDay: scala.Double = js.native
  var lastSecondInThisMinute: scala.Double = js.native
  var lastYearInThisEra: scala.Double = js.native
  var minute: scala.Double = js.native
  var month: scala.Double = js.native
  var nanosecond: scala.Double = js.native
  var numberOfDaysInThisMonth: scala.Double = js.native
  var numberOfEras: scala.Double = js.native
  var numberOfHoursInThisPeriod: scala.Double = js.native
  var numberOfMinutesInThisHour: scala.Double = js.native
  var numberOfMonthsInThisYear: scala.Double = js.native
  var numberOfPeriodsInThisDay: scala.Double = js.native
  var numberOfSecondsInThisMinute: scala.Double = js.native
  var numberOfYearsInThisEra: scala.Double = js.native
  var numeralSystem: java.lang.String = js.native
  var period: scala.Double = js.native
  var resolvedLanguage: java.lang.String = js.native
  var second: scala.Double = js.native
  var year: scala.Double = js.native
  def addDays(days: scala.Double): scala.Unit = js.native
  def addEras(eras: scala.Double): scala.Unit = js.native
  def addHours(hours: scala.Double): scala.Unit = js.native
  def addMinutes(minutes: scala.Double): scala.Unit = js.native
  def addMonths(months: scala.Double): scala.Unit = js.native
  def addNanoseconds(nanoseconds: scala.Double): scala.Unit = js.native
  def addPeriods(periods: scala.Double): scala.Unit = js.native
  def addSeconds(seconds: scala.Double): scala.Unit = js.native
  def addWeeks(weeks: scala.Double): scala.Unit = js.native
  def addYears(years: scala.Double): scala.Unit = js.native
  def changeCalendarSystem(value: java.lang.String): scala.Unit = js.native
  def changeClock(value: java.lang.String): scala.Unit = js.native
  def compare(other: Calendar): scala.Double = js.native
  def compareDateTime(other: stdLib.Date): scala.Double = js.native
  def copyTo(other: Calendar): scala.Unit = js.native
  def dayAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def dayAsString(): java.lang.String = js.native
  def dayOfWeekAsSoloString(): java.lang.String = js.native
  def dayOfWeekAsSoloString(idealLength: scala.Double): java.lang.String = js.native
  def dayOfWeekAsString(): java.lang.String = js.native
  def dayOfWeekAsString(idealLength: scala.Double): java.lang.String = js.native
  def eraAsString(): java.lang.String = js.native
  def eraAsString(idealLength: scala.Double): java.lang.String = js.native
  def getCalendarSystem(): java.lang.String = js.native
  def getClock(): java.lang.String = js.native
  def getDateTime(): stdLib.Date = js.native
  def hourAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def hourAsString(): java.lang.String = js.native
  def minuteAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def minuteAsString(): java.lang.String = js.native
  def monthAsNumericString(): java.lang.String = js.native
  def monthAsPaddedNumericString(minDigits: scala.Double): java.lang.String = js.native
  def monthAsSoloString(): java.lang.String = js.native
  def monthAsSoloString(idealLength: scala.Double): java.lang.String = js.native
  def monthAsString(): java.lang.String = js.native
  def monthAsString(idealLength: scala.Double): java.lang.String = js.native
  def nanosecondAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def nanosecondAsString(): java.lang.String = js.native
  def periodAsString(): java.lang.String = js.native
  def periodAsString(idealLength: scala.Double): java.lang.String = js.native
  def secondAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def secondAsString(): java.lang.String = js.native
  def setDateTime(value: stdLib.Date): scala.Unit = js.native
  def setToMax(): scala.Unit = js.native
  def setToMin(): scala.Unit = js.native
  def setToNow(): scala.Unit = js.native
  def yearAsPaddedString(minDigits: scala.Double): java.lang.String = js.native
  def yearAsString(): java.lang.String = js.native
  def yearAsTruncatedString(remainingDigits: scala.Double): java.lang.String = js.native
}

