package typings.timezoneSupport.index20122022Mod

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
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    if (abbreviation != null) __obj.updateDynamic("abbreviation")(abbreviation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneOffset]
  }
}

