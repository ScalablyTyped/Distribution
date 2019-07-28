package typings.textDashBuffer

import typings.textDashBuffer.textDashBufferStrings.backward
import typings.textDashBuffer.textDashBufferStrings.closest
import typings.textDashBuffer.textDashBufferStrings.forward
import typings.textDashBuffer.textDashBufferStrings.inside
import typings.textDashBuffer.textDashBufferStrings.never
import typings.textDashBuffer.textDashBufferStrings.overlap
import typings.textDashBuffer.textDashBufferStrings.surround
import typings.textDashBuffer.textDashBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirectionClosest extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object Anon_BackwardClipDirectionClosest {
  @scala.inline
  def apply(
    clipDirection: backward | forward | closest = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): Anon_BackwardClipDirectionClosest = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_BackwardClipDirectionClosest]
  }
}

