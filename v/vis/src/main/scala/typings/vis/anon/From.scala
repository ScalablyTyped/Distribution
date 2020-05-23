package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: js.UndefOr[Boolean | Enabled] = js.undefined
  var middle: js.UndefOr[Boolean | Enabled] = js.undefined
  var to: js.UndefOr[Boolean | Enabled] = js.undefined
}

object From {
  @scala.inline
  def apply(from: Boolean | Enabled = null, middle: Boolean | Enabled = null, to: Boolean | Enabled = null): From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

