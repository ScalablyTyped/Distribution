package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dDrawPointsOption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var onRender: js.UndefOr[js.Function0[Boolean]] = js.undefined
   // TODO
  var size: js.UndefOr[Double] = js.undefined
  var style: Graph2dDrawPointsStyle
}

object Graph2dDrawPointsOption {
  @scala.inline
  def apply(
    style: Graph2dDrawPointsStyle,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onRender: () => Boolean = null,
    size: Int | Double = null
  ): Graph2dDrawPointsOption = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDrawPointsOption]
  }
}

