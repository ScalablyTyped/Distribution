package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var isReadonly: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    isReadonly: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    if (!js.isUndefined(isReadonly)) __obj.updateDynamic("isReadonly")(isReadonly)
    __obj.asInstanceOf[Anon_IsCaseSensitive]
  }
}

