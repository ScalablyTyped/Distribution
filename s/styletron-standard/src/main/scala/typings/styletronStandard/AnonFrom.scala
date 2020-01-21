package typings.styletronStandard

import typings.styletronStandard.mod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: js.UndefOr[Properties] = js.undefined
  var to: js.UndefOr[Properties] = js.undefined
}

object AnonFrom {
  @scala.inline
  def apply(from: Properties = null, to: Properties = null): AnonFrom = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

