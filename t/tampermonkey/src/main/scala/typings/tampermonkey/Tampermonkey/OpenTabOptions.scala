package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTabOptions extends js.Object {
  /** Decides whether the new tab should be focused */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Inserts the new tab after the current one */
  var insert: js.UndefOr[Boolean] = js.undefined
  /** Makes the browser re-focus the current tab on close */
  var setParent: js.UndefOr[Boolean] = js.undefined
}

object OpenTabOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    insert: js.UndefOr[Boolean] = js.undefined,
    setParent: js.UndefOr[Boolean] = js.undefined
  ): OpenTabOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    if (!js.isUndefined(setParent)) __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[OpenTabOptions]
  }
}

