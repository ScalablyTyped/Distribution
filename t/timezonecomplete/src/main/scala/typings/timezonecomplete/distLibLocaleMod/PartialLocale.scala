package typings.timezonecomplete.distLibLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialLocale extends js.Object {
  var dayPeriodAbbreviated: js.UndefOr[DayPeriod] = js.undefined
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: js.UndefOr[DayPeriod] = js.undefined
  var dayPeriodWide: js.UndefOr[DayPeriod] = js.undefined
  var eraAbbreviated: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var eraWide: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  /**
    * Month names
    */
  var longMonthNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Month letters
    */
  var monthLetters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: js.UndefOr[String] = js.undefined
  /**
    * The word for 'quarter'
    */
  var quarterWord: js.UndefOr[String] = js.undefined
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.UndefOr[js.Array[String]] = js.undefined
  var shortWeekdayNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.UndefOr[js.Array[String]] = js.undefined
  var standAloneMonthLetters: js.UndefOr[js.Array[String]] = js.undefined
  var standAloneQuarterAbbreviations: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: js.UndefOr[String] = js.undefined
  var standAloneQuarterWord: js.UndefOr[String] = js.undefined
  var standAloneShortMonthNames: js.UndefOr[js.Array[String]] = js.undefined
  var weekdayLetters: js.UndefOr[js.Array[String]] = js.undefined
  var weekdayTwoLetters: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialLocale {
  @scala.inline
  def apply(
    dayPeriodAbbreviated: DayPeriod = null,
    dayPeriodNarrow: DayPeriod = null,
    dayPeriodWide: DayPeriod = null,
    eraAbbreviated: js.Tuple2[String, String] = null,
    eraNarrow: js.Tuple2[String, String] = null,
    eraWide: js.Tuple2[String, String] = null,
    longMonthNames: js.Array[String] = null,
    longWeekdayNames: js.Array[String] = null,
    monthLetters: js.Array[String] = null,
    quarterAbbreviations: js.Array[String] = null,
    quarterLetter: String = null,
    quarterWord: String = null,
    shortMonthNames: js.Array[String] = null,
    shortWeekdayNames: js.Array[String] = null,
    standAloneLongMonthNames: js.Array[String] = null,
    standAloneMonthLetters: js.Array[String] = null,
    standAloneQuarterAbbreviations: js.Array[String] = null,
    standAloneQuarterLetter: String = null,
    standAloneQuarterWord: String = null,
    standAloneShortMonthNames: js.Array[String] = null,
    weekdayLetters: js.Array[String] = null,
    weekdayTwoLetters: js.Array[String] = null
  ): PartialLocale = {
    val __obj = js.Dynamic.literal()
    if (dayPeriodAbbreviated != null) __obj.updateDynamic("dayPeriodAbbreviated")(dayPeriodAbbreviated)
    if (dayPeriodNarrow != null) __obj.updateDynamic("dayPeriodNarrow")(dayPeriodNarrow)
    if (dayPeriodWide != null) __obj.updateDynamic("dayPeriodWide")(dayPeriodWide)
    if (eraAbbreviated != null) __obj.updateDynamic("eraAbbreviated")(eraAbbreviated)
    if (eraNarrow != null) __obj.updateDynamic("eraNarrow")(eraNarrow)
    if (eraWide != null) __obj.updateDynamic("eraWide")(eraWide)
    if (longMonthNames != null) __obj.updateDynamic("longMonthNames")(longMonthNames)
    if (longWeekdayNames != null) __obj.updateDynamic("longWeekdayNames")(longWeekdayNames)
    if (monthLetters != null) __obj.updateDynamic("monthLetters")(monthLetters)
    if (quarterAbbreviations != null) __obj.updateDynamic("quarterAbbreviations")(quarterAbbreviations)
    if (quarterLetter != null) __obj.updateDynamic("quarterLetter")(quarterLetter)
    if (quarterWord != null) __obj.updateDynamic("quarterWord")(quarterWord)
    if (shortMonthNames != null) __obj.updateDynamic("shortMonthNames")(shortMonthNames)
    if (shortWeekdayNames != null) __obj.updateDynamic("shortWeekdayNames")(shortWeekdayNames)
    if (standAloneLongMonthNames != null) __obj.updateDynamic("standAloneLongMonthNames")(standAloneLongMonthNames)
    if (standAloneMonthLetters != null) __obj.updateDynamic("standAloneMonthLetters")(standAloneMonthLetters)
    if (standAloneQuarterAbbreviations != null) __obj.updateDynamic("standAloneQuarterAbbreviations")(standAloneQuarterAbbreviations)
    if (standAloneQuarterLetter != null) __obj.updateDynamic("standAloneQuarterLetter")(standAloneQuarterLetter)
    if (standAloneQuarterWord != null) __obj.updateDynamic("standAloneQuarterWord")(standAloneQuarterWord)
    if (standAloneShortMonthNames != null) __obj.updateDynamic("standAloneShortMonthNames")(standAloneShortMonthNames)
    if (weekdayLetters != null) __obj.updateDynamic("weekdayLetters")(weekdayLetters)
    if (weekdayTwoLetters != null) __obj.updateDynamic("weekdayTwoLetters")(weekdayTwoLetters)
    __obj.asInstanceOf[PartialLocale]
  }
}

