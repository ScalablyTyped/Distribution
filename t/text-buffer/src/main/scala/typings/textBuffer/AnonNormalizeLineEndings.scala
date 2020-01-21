package typings.textBuffer

import typings.textBuffer.textBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
  var undo: js.UndefOr[skip] = js.undefined
}

object AnonNormalizeLineEndings {
  @scala.inline
  def apply(normalizeLineEndings: js.UndefOr[Boolean] = js.undefined, undo: skip = null): AnonNormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNormalizeLineEndings]
  }
}

