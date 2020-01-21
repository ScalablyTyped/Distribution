package typings.timezonecomplete.localeMod

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
  var eraAbbreviated: js.Tuple2[String, String]
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.Tuple2[String, String]
  var eraWide: js.Tuple2[String, String]
  /**
    * Month names
    */
  var longMonthNames: js.Array[String]
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.Array[String]
  /**
    * Month letters
    */
  var monthLetters: js.Array[String]
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.Array[String]
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: String
  /**
    * The word for 'quarter'
    */
  var quarterWord: String
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.Array[String]
  var shortWeekdayNames: js.Array[String]
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.Array[String]
  var standAloneMonthLetters: js.Array[String]
  var standAloneQuarterAbbreviations: js.Array[String]
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: String
  var standAloneQuarterWord: String
  var standAloneShortMonthNames: js.Array[String]
  var weekdayLetters: js.Array[String]
  var weekdayTwoLetters: js.Array[String]
}

object Locale {
  @scala.inline
  def apply(
    dayPeriodAbbreviated: DayPeriod,
    dayPeriodNarrow: DayPeriod,
    dayPeriodWide: DayPeriod,
    eraAbbreviated: js.Tuple2[String, String],
    eraNarrow: js.Tuple2[String, String],
    eraWide: js.Tuple2[String, String],
    longMonthNames: js.Array[String],
    longWeekdayNames: js.Array[String],
    monthLetters: js.Array[String],
    quarterAbbreviations: js.Array[String],
    quarterLetter: String,
    quarterWord: String,
    shortMonthNames: js.Array[String],
    shortWeekdayNames: js.Array[String],
    standAloneLongMonthNames: js.Array[String],
    standAloneMonthLetters: js.Array[String],
    standAloneQuarterAbbreviations: js.Array[String],
    standAloneQuarterLetter: String,
    standAloneQuarterWord: String,
    standAloneShortMonthNames: js.Array[String],
    weekdayLetters: js.Array[String],
    weekdayTwoLetters: js.Array[String]
  ): Locale = {
    val __obj = js.Dynamic.literal(dayPeriodAbbreviated = dayPeriodAbbreviated.asInstanceOf[js.Any], dayPeriodNarrow = dayPeriodNarrow.asInstanceOf[js.Any], dayPeriodWide = dayPeriodWide.asInstanceOf[js.Any], eraAbbreviated = eraAbbreviated.asInstanceOf[js.Any], eraNarrow = eraNarrow.asInstanceOf[js.Any], eraWide = eraWide.asInstanceOf[js.Any], longMonthNames = longMonthNames.asInstanceOf[js.Any], longWeekdayNames = longWeekdayNames.asInstanceOf[js.Any], monthLetters = monthLetters.asInstanceOf[js.Any], quarterAbbreviations = quarterAbbreviations.asInstanceOf[js.Any], quarterLetter = quarterLetter.asInstanceOf[js.Any], quarterWord = quarterWord.asInstanceOf[js.Any], shortMonthNames = shortMonthNames.asInstanceOf[js.Any], shortWeekdayNames = shortWeekdayNames.asInstanceOf[js.Any], standAloneLongMonthNames = standAloneLongMonthNames.asInstanceOf[js.Any], standAloneMonthLetters = standAloneMonthLetters.asInstanceOf[js.Any], standAloneQuarterAbbreviations = standAloneQuarterAbbreviations.asInstanceOf[js.Any], standAloneQuarterLetter = standAloneQuarterLetter.asInstanceOf[js.Any], standAloneQuarterWord = standAloneQuarterWord.asInstanceOf[js.Any], standAloneShortMonthNames = standAloneShortMonthNames.asInstanceOf[js.Any], weekdayLetters = weekdayLetters.asInstanceOf[js.Any], weekdayTwoLetters = weekdayTwoLetters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

