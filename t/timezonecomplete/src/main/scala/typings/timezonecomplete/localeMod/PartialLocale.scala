package typings.timezonecomplete.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialLocale extends js.Object {
  var dayPeriodAbbreviated: js.UndefOr[DayPeriod] = js.native
  /**
    * Fixed day period names (AM/PM/noon/midnight, format 'a' and 'b')
    */
  var dayPeriodNarrow: js.UndefOr[DayPeriod] = js.native
  var dayPeriodWide: js.UndefOr[DayPeriod] = js.native
  var eraAbbreviated: js.UndefOr[js.Tuple2[String, String]] = js.native
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.UndefOr[js.Tuple2[String, String]] = js.native
  var eraWide: js.UndefOr[js.Tuple2[String, String]] = js.native
  /**
    * Month names
    */
  var longMonthNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Month letters
    */
  var monthLetters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: js.UndefOr[String] = js.native
  /**
    * The word for 'quarter'
    */
  var quarterWord: js.UndefOr[String] = js.native
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.UndefOr[js.Array[String]] = js.native
  var shortWeekdayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.UndefOr[js.Array[String]] = js.native
  var standAloneMonthLetters: js.UndefOr[js.Array[String]] = js.native
  var standAloneQuarterAbbreviations: js.UndefOr[js.Array[String]] = js.native
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: js.UndefOr[String] = js.native
  var standAloneQuarterWord: js.UndefOr[String] = js.native
  var standAloneShortMonthNames: js.UndefOr[js.Array[String]] = js.native
  var weekdayLetters: js.UndefOr[js.Array[String]] = js.native
  var weekdayTwoLetters: js.UndefOr[js.Array[String]] = js.native
}

object PartialLocale {
  @scala.inline
  def apply(): PartialLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocale]
  }
  @scala.inline
  implicit class PartialLocaleOps[Self <: PartialLocale] (val x: Self) extends AnyVal {
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
    def deleteDayPeriodAbbreviated: Self = this.set("dayPeriodAbbreviated", js.undefined)
    @scala.inline
    def setDayPeriodNarrow(value: DayPeriod): Self = this.set("dayPeriodNarrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPeriodNarrow: Self = this.set("dayPeriodNarrow", js.undefined)
    @scala.inline
    def setDayPeriodWide(value: DayPeriod): Self = this.set("dayPeriodWide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPeriodWide: Self = this.set("dayPeriodWide", js.undefined)
    @scala.inline
    def setEraAbbreviated(value: js.Tuple2[String, String]): Self = this.set("eraAbbreviated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEraAbbreviated: Self = this.set("eraAbbreviated", js.undefined)
    @scala.inline
    def setEraNarrow(value: js.Tuple2[String, String]): Self = this.set("eraNarrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEraNarrow: Self = this.set("eraNarrow", js.undefined)
    @scala.inline
    def setEraWide(value: js.Tuple2[String, String]): Self = this.set("eraWide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEraWide: Self = this.set("eraWide", js.undefined)
    @scala.inline
    def setLongMonthNamesVarargs(value: String*): Self = this.set("longMonthNames", js.Array(value :_*))
    @scala.inline
    def setLongMonthNames(value: js.Array[String]): Self = this.set("longMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongMonthNames: Self = this.set("longMonthNames", js.undefined)
    @scala.inline
    def setLongWeekdayNamesVarargs(value: String*): Self = this.set("longWeekdayNames", js.Array(value :_*))
    @scala.inline
    def setLongWeekdayNames(value: js.Array[String]): Self = this.set("longWeekdayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongWeekdayNames: Self = this.set("longWeekdayNames", js.undefined)
    @scala.inline
    def setMonthLettersVarargs(value: String*): Self = this.set("monthLetters", js.Array(value :_*))
    @scala.inline
    def setMonthLetters(value: js.Array[String]): Self = this.set("monthLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthLetters: Self = this.set("monthLetters", js.undefined)
    @scala.inline
    def setQuarterAbbreviationsVarargs(value: String*): Self = this.set("quarterAbbreviations", js.Array(value :_*))
    @scala.inline
    def setQuarterAbbreviations(value: js.Array[String]): Self = this.set("quarterAbbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterAbbreviations: Self = this.set("quarterAbbreviations", js.undefined)
    @scala.inline
    def setQuarterLetter(value: String): Self = this.set("quarterLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterLetter: Self = this.set("quarterLetter", js.undefined)
    @scala.inline
    def setQuarterWord(value: String): Self = this.set("quarterWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterWord: Self = this.set("quarterWord", js.undefined)
    @scala.inline
    def setShortMonthNamesVarargs(value: String*): Self = this.set("shortMonthNames", js.Array(value :_*))
    @scala.inline
    def setShortMonthNames(value: js.Array[String]): Self = this.set("shortMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortMonthNames: Self = this.set("shortMonthNames", js.undefined)
    @scala.inline
    def setShortWeekdayNamesVarargs(value: String*): Self = this.set("shortWeekdayNames", js.Array(value :_*))
    @scala.inline
    def setShortWeekdayNames(value: js.Array[String]): Self = this.set("shortWeekdayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortWeekdayNames: Self = this.set("shortWeekdayNames", js.undefined)
    @scala.inline
    def setStandAloneLongMonthNamesVarargs(value: String*): Self = this.set("standAloneLongMonthNames", js.Array(value :_*))
    @scala.inline
    def setStandAloneLongMonthNames(value: js.Array[String]): Self = this.set("standAloneLongMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneLongMonthNames: Self = this.set("standAloneLongMonthNames", js.undefined)
    @scala.inline
    def setStandAloneMonthLettersVarargs(value: String*): Self = this.set("standAloneMonthLetters", js.Array(value :_*))
    @scala.inline
    def setStandAloneMonthLetters(value: js.Array[String]): Self = this.set("standAloneMonthLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneMonthLetters: Self = this.set("standAloneMonthLetters", js.undefined)
    @scala.inline
    def setStandAloneQuarterAbbreviationsVarargs(value: String*): Self = this.set("standAloneQuarterAbbreviations", js.Array(value :_*))
    @scala.inline
    def setStandAloneQuarterAbbreviations(value: js.Array[String]): Self = this.set("standAloneQuarterAbbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneQuarterAbbreviations: Self = this.set("standAloneQuarterAbbreviations", js.undefined)
    @scala.inline
    def setStandAloneQuarterLetter(value: String): Self = this.set("standAloneQuarterLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneQuarterLetter: Self = this.set("standAloneQuarterLetter", js.undefined)
    @scala.inline
    def setStandAloneQuarterWord(value: String): Self = this.set("standAloneQuarterWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneQuarterWord: Self = this.set("standAloneQuarterWord", js.undefined)
    @scala.inline
    def setStandAloneShortMonthNamesVarargs(value: String*): Self = this.set("standAloneShortMonthNames", js.Array(value :_*))
    @scala.inline
    def setStandAloneShortMonthNames(value: js.Array[String]): Self = this.set("standAloneShortMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandAloneShortMonthNames: Self = this.set("standAloneShortMonthNames", js.undefined)
    @scala.inline
    def setWeekdayLettersVarargs(value: String*): Self = this.set("weekdayLetters", js.Array(value :_*))
    @scala.inline
    def setWeekdayLetters(value: js.Array[String]): Self = this.set("weekdayLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdayLetters: Self = this.set("weekdayLetters", js.undefined)
    @scala.inline
    def setWeekdayTwoLettersVarargs(value: String*): Self = this.set("weekdayTwoLetters", js.Array(value :_*))
    @scala.inline
    def setWeekdayTwoLetters(value: js.Array[String]): Self = this.set("weekdayTwoLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdayTwoLetters: Self = this.set("weekdayTwoLetters", js.undefined)
  }
  
}

