package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[java.lang.String] = js.undefined
  var highlight: js.UndefOr[java.lang.String | visLib.Anon_Background] = js.undefined
  var hover: js.UndefOr[java.lang.String | visLib.Anon_Background] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: java.lang.String = null,
    highlight: java.lang.String | visLib.Anon_Background = null,
    hover: java.lang.String | visLib.Anon_Background = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

