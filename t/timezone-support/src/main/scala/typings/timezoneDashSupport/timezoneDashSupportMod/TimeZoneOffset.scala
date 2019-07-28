package typings.timezoneDashSupport.timezoneDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneOffset extends js.Object {
  var abbreviation: js.UndefOr[String] = js.undefined
  var offset: Double
}

object TimeZoneOffset {
  @scala.inline
  def apply(offset: Double, abbreviation: String = null): TimeZoneOffset = {
    val __obj = js.Dynamic.literal(offset = offset)
    if (abbreviation != null) __obj.updateDynamic("abbreviation")(abbreviation)
    __obj.asInstanceOf[TimeZoneOffset]
  }
}

