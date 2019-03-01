package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backward extends js.Object {
  var clipDirection: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest
  ] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Backward {
  @scala.inline
  def apply(
    clipDirection: textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Backward = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_Backward]
  }
}

