package typings.vegaTooltip.defaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  offsetX  :number,   offsetY  :number,   id  :string,   styleId  :string,   theme  :string,   disableDefaultStyle  :boolean,   sanitize  :typeof escapeHTML,   maxDepth  :number}> */
trait Options extends js.Object {
  var disableDefaultStyle: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var styleId: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableDefaultStyle: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    maxDepth: js.UndefOr[Double] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    styleId: String = null,
    theme: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDefaultStyle)) __obj.updateDynamic("disableDefaultStyle")(disableDefaultStyle.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (styleId != null) __obj.updateDynamic("styleId")(styleId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

