package typings.textDashBuffer

import typings.textDashBuffer.textDashBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
  var undo: js.UndefOr[skip] = js.undefined
}

object Anon_NormalizeLineEndings {
  @scala.inline
  def apply(normalizeLineEndings: js.UndefOr[Boolean] = js.undefined, undo: skip = null): Anon_NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    __obj.asInstanceOf[Anon_NormalizeLineEndings]
  }
}

