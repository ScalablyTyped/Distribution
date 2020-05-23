package typings.textBuffer.anon

import typings.textBuffer.textBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
  var undo: js.UndefOr[skip] = js.undefined
}

object NormalizeLineEndings {
  @scala.inline
  def apply(normalizeLineEndings: js.UndefOr[Boolean] = js.undefined, undo: skip = null): NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings.get.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeLineEndings]
  }
}

