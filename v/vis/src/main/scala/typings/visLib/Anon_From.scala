package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.UndefOr[scala.Boolean | Anon_Enabled] = js.undefined
  var middle: js.UndefOr[scala.Boolean | Anon_Enabled] = js.undefined
  var to: js.UndefOr[scala.Boolean | Anon_Enabled] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(
    from: scala.Boolean | Anon_Enabled = null,
    middle: scala.Boolean | Anon_Enabled = null,
    to: scala.Boolean | Anon_Enabled = null
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_From]
  }
}

