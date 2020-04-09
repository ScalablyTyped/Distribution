package typings.textMaskAddons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePipeYears extends js.Object {
  var maxYear: Double
  var minYear: Double
}

object DatePipeYears {
  @scala.inline
  def apply(maxYear: Double, minYear: Double): DatePipeYears = {
    val __obj = js.Dynamic.literal(maxYear = maxYear.asInstanceOf[js.Any], minYear = minYear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePipeYears]
  }
}

