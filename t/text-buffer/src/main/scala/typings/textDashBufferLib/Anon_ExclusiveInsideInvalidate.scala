package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveInsideInvalidate extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var invalidate: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch
  ] = js.undefined
}

object Anon_ExclusiveInsideInvalidate {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    invalidate: textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch = null
  ): Anon_ExclusiveInsideInvalidate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusiveInsideInvalidate]
  }
}

