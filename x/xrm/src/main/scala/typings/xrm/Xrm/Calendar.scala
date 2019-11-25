package typings.xrm.Xrm

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the DateFormattingInfo.calendar field
  */
trait Calendar extends js.Object {
  var AlgorithmType: Double
  var CalendarType: Double
  var Eras: js.Array[Double]
  var IsReadOnly: Boolean
  var MaxSupportedDateTime: Date
  var MinSupportedDateTime: Date
  var TwoDigitYearMax: Double
}

object Calendar {
  @scala.inline
  def apply(
    AlgorithmType: Double,
    CalendarType: Double,
    Eras: js.Array[Double],
    IsReadOnly: Boolean,
    MaxSupportedDateTime: Date,
    MinSupportedDateTime: Date,
    TwoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(AlgorithmType = AlgorithmType.asInstanceOf[js.Any], CalendarType = CalendarType.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxSupportedDateTime = MaxSupportedDateTime.asInstanceOf[js.Any], MinSupportedDateTime = MinSupportedDateTime.asInstanceOf[js.Any], TwoDigitYearMax = TwoDigitYearMax.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Calendar]
  }
}

