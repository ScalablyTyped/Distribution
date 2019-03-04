package typings
package timezonecompleteLib.distLibLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var dayPeriodAbbreviated: DayPeriod
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: DayPeriod
  var dayPeriodWide: DayPeriod
  var eraAbbreviated: js.Tuple2[java.lang.String, java.lang.String]
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.Tuple2[java.lang.String, java.lang.String]
  var eraWide: js.Tuple2[java.lang.String, java.lang.String]
  /**
    * Month names
    */
  var longMonthNames: js.Array[java.lang.String]
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.Array[java.lang.String]
  /**
    * Month letters
    */
  var monthLetters: js.Array[java.lang.String]
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.Array[java.lang.String]
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: java.lang.String
  /**
    * The word for 'quarter'
    */
  var quarterWord: java.lang.String
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.Array[java.lang.String]
  var shortWeekdayNames: js.Array[java.lang.String]
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.Array[java.lang.String]
  var standAloneMonthLetters: js.Array[java.lang.String]
  var standAloneQuarterAbbreviations: js.Array[java.lang.String]
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: java.lang.String
  var standAloneQuarterWord: java.lang.String
  var standAloneShortMonthNames: js.Array[java.lang.String]
  var weekdayLetters: js.Array[java.lang.String]
  var weekdayTwoLetters: js.Array[java.lang.String]
}

object Locale {
  @scala.inline
  def apply(
    dayPeriodAbbreviated: DayPeriod,
    dayPeriodNarrow: DayPeriod,
    dayPeriodWide: DayPeriod,
    eraAbbreviated: js.Tuple2[java.lang.String, java.lang.String],
    eraNarrow: js.Tuple2[java.lang.String, java.lang.String],
    eraWide: js.Tuple2[java.lang.String, java.lang.String],
    longMonthNames: js.Array[java.lang.String],
    longWeekdayNames: js.Array[java.lang.String],
    monthLetters: js.Array[java.lang.String],
    quarterAbbreviations: js.Array[java.lang.String],
    quarterLetter: java.lang.String,
    quarterWord: java.lang.String,
    shortMonthNames: js.Array[java.lang.String],
    shortWeekdayNames: js.Array[java.lang.String],
    standAloneLongMonthNames: js.Array[java.lang.String],
    standAloneMonthLetters: js.Array[java.lang.String],
    standAloneQuarterAbbreviations: js.Array[java.lang.String],
    standAloneQuarterLetter: java.lang.String,
    standAloneQuarterWord: java.lang.String,
    standAloneShortMonthNames: js.Array[java.lang.String],
    weekdayLetters: js.Array[java.lang.String],
    weekdayTwoLetters: js.Array[java.lang.String]
  ): Locale = {
    val __obj = js.Dynamic.literal(dayPeriodAbbreviated = dayPeriodAbbreviated, dayPeriodNarrow = dayPeriodNarrow, dayPeriodWide = dayPeriodWide, eraAbbreviated = eraAbbreviated, eraNarrow = eraNarrow, eraWide = eraWide, longMonthNames = longMonthNames, longWeekdayNames = longWeekdayNames, monthLetters = monthLetters, quarterAbbreviations = quarterAbbreviations, quarterLetter = quarterLetter, quarterWord = quarterWord, shortMonthNames = shortMonthNames, shortWeekdayNames = shortWeekdayNames, standAloneLongMonthNames = standAloneLongMonthNames, standAloneMonthLetters = standAloneMonthLetters, standAloneQuarterAbbreviations = standAloneQuarterAbbreviations, standAloneQuarterLetter = standAloneQuarterLetter, standAloneQuarterWord = standAloneQuarterWord, standAloneShortMonthNames = standAloneShortMonthNames, weekdayLetters = weekdayLetters, weekdayTwoLetters = weekdayTwoLetters)
  
    __obj.asInstanceOf[Locale]
  }
}

