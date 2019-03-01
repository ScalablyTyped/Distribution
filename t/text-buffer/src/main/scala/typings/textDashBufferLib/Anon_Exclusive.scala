package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclusive extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Exclusive {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Exclusive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_Exclusive]
  }
}

