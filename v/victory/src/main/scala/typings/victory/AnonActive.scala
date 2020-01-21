package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var datum: js.UndefOr[js.Object] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, datum: js.Object = null): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

