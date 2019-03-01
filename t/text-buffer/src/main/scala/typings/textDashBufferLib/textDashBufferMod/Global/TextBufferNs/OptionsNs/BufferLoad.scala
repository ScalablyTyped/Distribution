package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferLoad extends js.Object {
  /** The file's encoding. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A function that returns a boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object BufferLoad {
  @scala.inline
  def apply(encoding: java.lang.String = null, shouldDestroyOnFileDelete: js.Function0[scala.Boolean] = null): BufferLoad = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (shouldDestroyOnFileDelete != null) __obj.updateDynamic("shouldDestroyOnFileDelete")(shouldDestroyOnFileDelete)
    __obj.asInstanceOf[BufferLoad]
  }
}

