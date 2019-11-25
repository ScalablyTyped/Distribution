package typings.vis.visMod

import typings.vis.Anon_Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[String | Anon_Background] = js.undefined
  var hover: js.UndefOr[String | Anon_Background] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    highlight: String | Anon_Background = null,
    hover: String | Anon_Background = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

