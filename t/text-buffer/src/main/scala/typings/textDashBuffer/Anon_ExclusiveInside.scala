package typings.textDashBuffer

import typings.textDashBuffer.textDashBufferStrings.inside
import typings.textDashBuffer.textDashBufferStrings.never
import typings.textDashBuffer.textDashBufferStrings.overlap
import typings.textDashBuffer.textDashBufferStrings.surround
import typings.textDashBuffer.textDashBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveInside extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExclusiveInside {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): Anon_ExclusiveInside = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_ExclusiveInside]
  }
}

