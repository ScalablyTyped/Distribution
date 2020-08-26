package typings.xrm.Xrm

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the DateFormattingInfo.calendar field
  */
@js.native
trait Calendar extends js.Object {
  var AlgorithmType: Double = js.native
  var CalendarType: Double = js.native
  var Eras: js.Array[Double] = js.native
  var IsReadOnly: Boolean = js.native
  var MaxSupportedDateTime: Date = js.native
  var MinSupportedDateTime: Date = js.native
  var TwoDigitYearMax: Double = js.native
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
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
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
    def setAlgorithmType(value: Double): Self = this.set("AlgorithmType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalendarType(value: Double): Self = this.set("CalendarType", value.asInstanceOf[js.Any])
    @scala.inline
    def setErasVarargs(value: Double*): Self = this.set("Eras", js.Array(value :_*))
    @scala.inline
    def setEras(value: js.Array[Double]): Self = this.set("Eras", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("IsReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSupportedDateTime(value: Date): Self = this.set("MaxSupportedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSupportedDateTime(value: Date): Self = this.set("MinSupportedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = this.set("TwoDigitYearMax", value.asInstanceOf[js.Any])
  }
  
}

