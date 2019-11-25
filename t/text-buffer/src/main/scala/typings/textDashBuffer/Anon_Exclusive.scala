package typings.textDashBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclusive extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object Anon_Exclusive {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined): Anon_Exclusive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exclusive]
  }
}

