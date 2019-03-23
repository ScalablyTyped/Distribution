package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Select extends js.Object {
  var select: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Select {
  @scala.inline
  def apply(select: js.UndefOr[scala.Boolean] = js.undefined): Anon_Select = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[Anon_Select]
  }
}

