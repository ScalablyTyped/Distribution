package typings
package timezonecompleteLib.distLibLocaleMod

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
  var eraAbbreviated: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Era names: AD, BC
    */
  var eraNarrow: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var eraWide: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Month names
    */
  var longMonthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Week day names, starting with sunday
    */
  var longWeekdayNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Month letters
    */
  var monthLetters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Quarter abbreviations e.g. 1st, 2nd, 3rd, 4th
    */
  var quarterAbbreviations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The letter indicating a quarter e.g. "Q" (becomes Q1, Q2, Q3, Q4)
    */
  var quarterLetter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The word for 'quarter'
    */
  var quarterWord: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Three-letter month names
    */
  var shortMonthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var shortWeekdayNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * In some languages, months need different names when used stand-alone
    */
  var standAloneLongMonthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var standAloneMonthLetters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var standAloneQuarterAbbreviations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * In some languages, quarters need different names when used stand-alone
    */
  var standAloneQuarterLetter: js.UndefOr[java.lang.String] = js.undefined
  var standAloneQuarterWord: js.UndefOr[java.lang.String] = js.undefined
  var standAloneShortMonthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var weekdayLetters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var weekdayTwoLetters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

