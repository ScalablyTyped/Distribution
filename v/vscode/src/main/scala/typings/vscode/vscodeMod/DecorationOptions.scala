package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationOptions extends js.Object {
  /**
  		 * A message that should be rendered when hovering over the decoration.
  		 */
  var hoverMessage: js.UndefOr[MarkedString | js.Array[MarkedString]] = js.undefined
  /**
  		 * Range to which this decoration is applied. The range must not be empty.
  		 */
  var range: Range
  /**
  		 * Render options applied to the current decoration. For performance reasons, keep the
  		 * number of decoration specific options small, and use decoration types wherever possible.
  		 */
  var renderOptions: js.UndefOr[DecorationInstanceRenderOptions] = js.undefined
}

object DecorationOptions {
  @scala.inline
  def apply(
    range: Range,
    hoverMessage: MarkedString | js.Array[MarkedString] = null,
    renderOptions: DecorationInstanceRenderOptions = null
  ): DecorationOptions = {
    val __obj = js.Dynamic.literal(range = range)
    if (hoverMessage != null) __obj.updateDynamic("hoverMessage")(hoverMessage.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions)
    __obj.asInstanceOf[DecorationOptions]
  }
}

