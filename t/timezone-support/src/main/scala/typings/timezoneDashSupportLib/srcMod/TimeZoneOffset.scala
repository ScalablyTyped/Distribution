package typings
package timezoneDashSupportLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneOffset extends js.Object {
  var abbreviation: js.UndefOr[java.lang.String] = js.undefined
  var offset: scala.Double
}

object TimeZoneOffset {
  @scala.inline
  def apply(offset: scala.Double, abbreviation: java.lang.String = null): TimeZoneOffset = {
    val __obj = js.Dynamic.literal(offset = offset)
    if (abbreviation != null) __obj.updateDynamic("abbreviation")(abbreviation)
    __obj.asInstanceOf[TimeZoneOffset]
  }
}

