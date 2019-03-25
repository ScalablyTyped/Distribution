package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expand extends js.Object {
  var expand: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var select: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Expand {
  @scala.inline
  def apply(
    expand: scala.Boolean | scala.Double = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Expand]
  }
}

