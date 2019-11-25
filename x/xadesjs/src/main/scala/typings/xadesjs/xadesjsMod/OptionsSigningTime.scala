package typings.xadesjs.xadesjsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSigningTime extends js.Object {
  /**
    * Format of the signing time. Default format is ISO
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Signing time value. Default value if now
    */
  var value: js.UndefOr[Date] = js.undefined
}

object OptionsSigningTime {
  @scala.inline
  def apply(format: String = null, value: Date = null): OptionsSigningTime = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSigningTime]
  }
}

