package typings.vis.mod

import typings.vis.anon.Align
import typings.vis.anon.ForceDirection
import typings.vis.anon.From
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
    arrows: String | From = null,
    color: String | typings.vis.anon.Color = null,
    dashes: Boolean | js.Array[Double] = null,
    font: String | Align = null,
    from: IdType = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverWidth: js.UndefOr[Double] = js.undefined,
    id: IdType = null,
    label: String = null,
    labelHighlightBold: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    physics: js.UndefOr[Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    selectionWidth: js.UndefOr[Double] = js.undefined,
    selfReferenceSize: js.UndefOr[Double] = js.undefined,
    shadow: Boolean | OptionsShadow = null,
    smooth: Boolean | ForceDirection = null,
    title: String = null,
    to: IdType = null,
    value: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowStrikethrough)) __obj.updateDynamic("arrowStrikethrough")(arrowStrikethrough.get.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashes != null) __obj.updateDynamic("dashes")(dashes.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverWidth)) __obj.updateDynamic("hoverWidth")(hoverWidth.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics.get.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionWidth)) __obj.updateDynamic("selectionWidth")(selectionWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selfReferenceSize)) __obj.updateDynamic("selfReferenceSize")(selfReferenceSize.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

