package typings.vis.mod

import typings.vis.AnonBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[String | AnonBackground] = js.undefined
  var hover: js.UndefOr[String | AnonBackground] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    highlight: String | AnonBackground = null,
    hover: String | AnonBackground = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

