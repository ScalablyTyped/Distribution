package typings.wordpressComponents.dateTimeMod.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components/date-time/date.default.Props, 'isInvalidDate'> */
trait Props extends js.Object {
  var currentDate: js.UndefOr[String] = js.undefined
  var is12Hour: js.UndefOr[Boolean] = js.undefined
  var onChange: js.Function1[/* currentDate */ String, Unit]
}

object Props {
  @scala.inline
  def apply(
    onChange: /* currentDate */ String => Unit,
    currentDate: String = null,
    is12Hour: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (!js.isUndefined(is12Hour)) __obj.updateDynamic("is12Hour")(is12Hour.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

