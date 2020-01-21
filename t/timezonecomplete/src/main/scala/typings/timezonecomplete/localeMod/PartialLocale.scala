package typings.timezonecomplete.localeMod

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
    if (dayPeriodAbbreviated != null) __obj.updateDynamic("dayPeriodAbbreviated")(dayPeriodAbbreviated.asInstanceOf[js.Any])
    if (dayPeriodNarrow != null) __obj.updateDynamic("dayPeriodNarrow")(dayPeriodNarrow.asInstanceOf[js.Any])
    if (dayPeriodWide != null) __obj.updateDynamic("dayPeriodWide")(dayPeriodWide.asInstanceOf[js.Any])
    if (eraAbbreviated != null) __obj.updateDynamic("eraAbbreviated")(eraAbbreviated.asInstanceOf[js.Any])
    if (eraNarrow != null) __obj.updateDynamic("eraNarrow")(eraNarrow.asInstanceOf[js.Any])
    if (eraWide != null) __obj.updateDynamic("eraWide")(eraWide.asInstanceOf[js.Any])
    if (longMonthNames != null) __obj.updateDynamic("longMonthNames")(longMonthNames.asInstanceOf[js.Any])
    if (longWeekdayNames != null) __obj.updateDynamic("longWeekdayNames")(longWeekdayNames.asInstanceOf[js.Any])
    if (monthLetters != null) __obj.updateDynamic("monthLetters")(monthLetters.asInstanceOf[js.Any])
    if (quarterAbbreviations != null) __obj.updateDynamic("quarterAbbreviations")(quarterAbbreviations.asInstanceOf[js.Any])
    if (quarterLetter != null) __obj.updateDynamic("quarterLetter")(quarterLetter.asInstanceOf[js.Any])
    if (quarterWord != null) __obj.updateDynamic("quarterWord")(quarterWord.asInstanceOf[js.Any])
    if (shortMonthNames != null) __obj.updateDynamic("shortMonthNames")(shortMonthNames.asInstanceOf[js.Any])
    if (shortWeekdayNames != null) __obj.updateDynamic("shortWeekdayNames")(shortWeekdayNames.asInstanceOf[js.Any])
    if (standAloneLongMonthNames != null) __obj.updateDynamic("standAloneLongMonthNames")(standAloneLongMonthNames.asInstanceOf[js.Any])
    if (standAloneMonthLetters != null) __obj.updateDynamic("standAloneMonthLetters")(standAloneMonthLetters.asInstanceOf[js.Any])
    if (standAloneQuarterAbbreviations != null) __obj.updateDynamic("standAloneQuarterAbbreviations")(standAloneQuarterAbbreviations.asInstanceOf[js.Any])
    if (standAloneQuarterLetter != null) __obj.updateDynamic("standAloneQuarterLetter")(standAloneQuarterLetter.asInstanceOf[js.Any])
    if (standAloneQuarterWord != null) __obj.updateDynamic("standAloneQuarterWord")(standAloneQuarterWord.asInstanceOf[js.Any])
    if (standAloneShortMonthNames != null) __obj.updateDynamic("standAloneShortMonthNames")(standAloneShortMonthNames.asInstanceOf[js.Any])
    if (weekdayLetters != null) __obj.updateDynamic("weekdayLetters")(weekdayLetters.asInstanceOf[js.Any])
    if (weekdayTwoLetters != null) __obj.updateDynamic("weekdayTwoLetters")(weekdayTwoLetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLocale]
  }
}

