package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirection extends js.Object {
  var clipDirection: textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest
}

object Anon_BackwardClipDirection {
  @scala.inline
  def apply(
    clipDirection: textDashBufferLib.textDashBufferLibStrings.backward | textDashBufferLib.textDashBufferLibStrings.forward | textDashBufferLib.textDashBufferLibStrings.closest
  ): Anon_BackwardClipDirection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackwardClipDirection]
  }
}

