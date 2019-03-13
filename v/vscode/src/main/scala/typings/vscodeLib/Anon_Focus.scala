package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var select: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Focus {
  @scala.inline
  def apply(focus: js.UndefOr[scala.Boolean] = js.undefined, select: js.UndefOr[scala.Boolean] = js.undefined): Anon_Focus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Focus]
  }
}

