package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTo extends js.Object {
  var from: js.UndefOr[js.Any] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object AnonTo {
  @scala.inline
  def apply(from: js.Any = null, to: js.Any = null): AnonTo = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTo]
  }
}

