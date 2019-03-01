package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the DateFormattingInfo.calendar field
  */
trait Calendar extends js.Object {
  var AlgorithmType: scala.Double
  var CalendarType: scala.Double
  var Eras: js.Array[scala.Double]
  var IsReadOnly: scala.Boolean
  var MaxSupportedDateTime: stdLib.Date
  var MinSupportedDateTime: stdLib.Date
  var TwoDigitYearMax: scala.Double
}

object Calendar {
  @scala.inline
  def apply(
    AlgorithmType: scala.Double,
    CalendarType: scala.Double,
    Eras: js.Array[scala.Double],
    IsReadOnly: scala.Boolean,
    MaxSupportedDateTime: stdLib.Date,
    MinSupportedDateTime: stdLib.Date,
    TwoDigitYearMax: scala.Double
  ): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AlgorithmType")(AlgorithmType)
    __obj.updateDynamic("CalendarType")(CalendarType)
    __obj.updateDynamic("Eras")(Eras)
    __obj.updateDynamic("IsReadOnly")(IsReadOnly)
    __obj.updateDynamic("MaxSupportedDateTime")(MaxSupportedDateTime)
    __obj.updateDynamic("MinSupportedDateTime")(MinSupportedDateTime)
    __obj.updateDynamic("TwoDigitYearMax")(TwoDigitYearMax)
    __obj.asInstanceOf[Calendar]
  }
}

