package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionOptions extends js.Object {
  var highlightEdges: js.UndefOr[Boolean] = js.undefined
  var unselectAll: js.UndefOr[Boolean] = js.undefined
}

object SelectionOptions {
  @scala.inline
  def apply(
    highlightEdges: js.UndefOr[Boolean] = js.undefined,
    unselectAll: js.UndefOr[Boolean] = js.undefined
  ): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightEdges)) __obj.updateDynamic("highlightEdges")(highlightEdges)
    if (!js.isUndefined(unselectAll)) __obj.updateDynamic("unselectAll")(unselectAll)
    __obj.asInstanceOf[SelectionOptions]
  }
}

