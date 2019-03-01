package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirectionClosest extends js.Object {
  var clipDirection: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest
  ] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var invalidate: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch
  ] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BackwardClipDirectionClosest {
  @scala.inline
  def apply(
    clipDirection: textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    invalidate: textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BackwardClipDirectionClosest = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_BackwardClipDirectionClosest]
  }
}

