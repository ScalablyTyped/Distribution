package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSignals extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var signals: js.UndefOr[js.Any] = js.undefined
}

object Anon_DataSignals {
  @scala.inline
  def apply(data: js.Any = null, signals: js.Any = null): Anon_DataSignals = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (signals != null) __obj.updateDynamic("signals")(signals)
    __obj.asInstanceOf[Anon_DataSignals]
  }
}

