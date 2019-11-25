package typings.vis.visMod

import typings.vis.Anon_Align
import typings.vis.Anon_Color
import typings.vis.Anon_EnabledForceDirection
import typings.vis.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends EdgeOptions {
  var from: js.UndefOr[IdType] = js.undefined
  var id: js.UndefOr[IdType] = js.undefined
  var to: js.UndefOr[IdType] = js.undefined
}

object Edge {
  @scala.inline
  def apply(
    arrowStrikethrough: js.UndefOr[Boolean] = js.undefined,
    arrows: String | Anon_From = null,
    color: String | Anon_Color = null,
    dashes: Boolean | js.Array[Double] = null,
    font: String | Anon_Align = null,
    from: IdType = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverWidth: Int | Double = null,
    id: IdType = null,
    label: String = null,
    labelHighlightBold: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    physics: js.UndefOr[Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    selectionWidth: Int | Double = null,
    selfReferenceSize: Int | Double = null,
    shadow: Boolean | OptionsShadow = null,
    smooth: Boolean | Anon_EnabledForceDirection = null,
    title: String = null,
    to: IdType = null,
    value: Int | Double = null,
    width: Int | Double = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowStrikethrough)) __obj.updateDynamic("arrowStrikethrough")(arrowStrikethrough.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashes != null) __obj.updateDynamic("dashes")(dashes.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hoverWidth != null) __obj.updateDynamic("hoverWidth")(hoverWidth.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (selectionWidth != null) __obj.updateDynamic("selectionWidth")(selectionWidth.asInstanceOf[js.Any])
    if (selfReferenceSize != null) __obj.updateDynamic("selfReferenceSize")(selfReferenceSize.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

