package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[scala.Boolean] = js.undefined
  var undo: js.UndefOr[textDashBufferLib.textDashBufferLibStrings.skip] = js.undefined
}

object Anon_NormalizeLineEndings {
  @scala.inline
  def apply(
    normalizeLineEndings: js.UndefOr[scala.Boolean] = js.undefined,
    undo: textDashBufferLib.textDashBufferLibStrings.skip = null
  ): Anon_NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    __obj.asInstanceOf[Anon_NormalizeLineEndings]
  }
}

