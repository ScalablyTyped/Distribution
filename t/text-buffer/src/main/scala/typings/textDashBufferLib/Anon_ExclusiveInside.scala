package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveInside extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var invalidate: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch
  ] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ExclusiveInside {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    invalidate: textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ExclusiveInside = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_ExclusiveInside]
  }
}

