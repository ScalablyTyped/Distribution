package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.UndefOr[Boolean | Anon_Enabled] = js.undefined
  var middle: js.UndefOr[Boolean | Anon_Enabled] = js.undefined
  var to: js.UndefOr[Boolean | Anon_Enabled] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(
    from: Boolean | Anon_Enabled = null,
    middle: Boolean | Anon_Enabled = null,
    to: Boolean | Anon_Enabled = null
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_From]
  }
}

