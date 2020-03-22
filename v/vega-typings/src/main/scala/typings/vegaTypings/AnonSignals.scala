package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignals extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var signals: js.UndefOr[js.Any] = js.undefined
}

object AnonSignals {
  @scala.inline
  def apply(data: js.Any = null, signals: js.Any = null): AnonSignals = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignals]
  }
}

