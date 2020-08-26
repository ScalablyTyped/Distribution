package typings.timezonecomplete.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var dayPeriodAbbreviated: DayPeriod = js.native
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: DayPeriod = js.native
  var dayPeriodWide: DayPeriod = js.native
  var eraAbbreviated: js.Tuple2[String, String] = js.native
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.Tuple2[String, String] = js.native
  var eraWide: js.Tuple2[String, String] = js.native
  /**
    * Month names
    */
  var longMonthNames: js.Array[String] = js.native
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.Array[String] = js.native
  /**
    * Month letters
    */
  var monthLetters: js.Array[String] = js.native
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.Array[String] = js.native
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: String = js.native
  /**
    * The word for 'quarter'
    */
  var quarterWord: String = js.native
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.Array[String] = js.native
  var shortWeekdayNames: js.Array[String] = js.native
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.Array[String] = js.native
  var standAloneMonthLetters: js.Array[String] = js.native
  var standAloneQuarterAbbreviations: js.Array[String] = js.native
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: String = js.native
  var standAloneQuarterWord: String = js.native
  var standAloneShortMonthNames: js.Array[String] = js.native
  var weekdayLetters: js.Array[String] = js.native
  var weekdayTwoLetters: js.Array[String] = js.native
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
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setDayPeriodAbbreviated(value: DayPeriod): Self = this.set("dayPeriodAbbreviated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayPeriodNarrow(value: DayPeriod): Self = this.set("dayPeriodNarrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayPeriodWide(value: DayPeriod): Self = this.set("dayPeriodWide", value.asInstanceOf[js.Any])
    @scala.inline
    def setEraAbbreviated(value: js.Tuple2[String, String]): Self = this.set("eraAbbreviated", value.asInstanceOf[js.Any])
    @scala.inline
    def setEraNarrow(value: js.Tuple2[String, String]): Self = this.set("eraNarrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEraWide(value: js.Tuple2[String, String]): Self = this.set("eraWide", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongMonthNamesVarargs(value: String*): Self = this.set("longMonthNames", js.Array(value :_*))
    @scala.inline
    def setLongMonthNames(value: js.Array[String]): Self = this.set("longMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongWeekdayNamesVarargs(value: String*): Self = this.set("longWeekdayNames", js.Array(value :_*))
    @scala.inline
    def setLongWeekdayNames(value: js.Array[String]): Self = this.set("longWeekdayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthLettersVarargs(value: String*): Self = this.set("monthLetters", js.Array(value :_*))
    @scala.inline
    def setMonthLetters(value: js.Array[String]): Self = this.set("monthLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarterAbbreviationsVarargs(value: String*): Self = this.set("quarterAbbreviations", js.Array(value :_*))
    @scala.inline
    def setQuarterAbbreviations(value: js.Array[String]): Self = this.set("quarterAbbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarterLetter(value: String): Self = this.set("quarterLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarterWord(value: String): Self = this.set("quarterWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortMonthNamesVarargs(value: String*): Self = this.set("shortMonthNames", js.Array(value :_*))
    @scala.inline
    def setShortMonthNames(value: js.Array[String]): Self = this.set("shortMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortWeekdayNamesVarargs(value: String*): Self = this.set("shortWeekdayNames", js.Array(value :_*))
    @scala.inline
    def setShortWeekdayNames(value: js.Array[String]): Self = this.set("shortWeekdayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneLongMonthNamesVarargs(value: String*): Self = this.set("standAloneLongMonthNames", js.Array(value :_*))
    @scala.inline
    def setStandAloneLongMonthNames(value: js.Array[String]): Self = this.set("standAloneLongMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneMonthLettersVarargs(value: String*): Self = this.set("standAloneMonthLetters", js.Array(value :_*))
    @scala.inline
    def setStandAloneMonthLetters(value: js.Array[String]): Self = this.set("standAloneMonthLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneQuarterAbbreviationsVarargs(value: String*): Self = this.set("standAloneQuarterAbbreviations", js.Array(value :_*))
    @scala.inline
    def setStandAloneQuarterAbbreviations(value: js.Array[String]): Self = this.set("standAloneQuarterAbbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneQuarterLetter(value: String): Self = this.set("standAloneQuarterLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneQuarterWord(value: String): Self = this.set("standAloneQuarterWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandAloneShortMonthNamesVarargs(value: String*): Self = this.set("standAloneShortMonthNames", js.Array(value :_*))
    @scala.inline
    def setStandAloneShortMonthNames(value: js.Array[String]): Self = this.set("standAloneShortMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdayLettersVarargs(value: String*): Self = this.set("weekdayLetters", js.Array(value :_*))
    @scala.inline
    def setWeekdayLetters(value: js.Array[String]): Self = this.set("weekdayLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdayTwoLettersVarargs(value: String*): Self = this.set("weekdayTwoLetters", js.Array(value :_*))
    @scala.inline
    def setWeekdayTwoLetters(value: js.Array[String]): Self = this.set("weekdayTwoLetters", value.asInstanceOf[js.Any])
  }
  
}

