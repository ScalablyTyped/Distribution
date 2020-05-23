package typings.vis.mod

import typings.vis.anon.Align
import typings.vis.anon.BorderDashes
import typings.vis.anon.Bottom
import typings.vis.anon.Code
import typings.vis.anon.Maximum
import typings.vis.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var borderWidthSelected: js.UndefOr[Double] = js.undefined
  var brokenImage: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String | Color] = js.undefined
  var fixed: js.UndefOr[Boolean | X] = js.undefined
  var font: js.UndefOr[String | Align] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Code] = js.undefined
  var image: js.UndefOr[String | Image] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelHighlightBold: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Bottom] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var physics: js.UndefOr[Boolean] = js.undefined
  var scaling: js.UndefOr[OptionsScaling] = js.undefined
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var shapeProperties: js.UndefOr[BorderDashes] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  /**
    * If false, no widthConstraint is applied. If a number is specified, the minimum and maximum widths of the node are set to the value.
    * The node's label's lines will be broken on spaces to stay below the maximum and the node's width
    * will be set to the minimum if less than the value.
    */
  var widthConstraint: js.UndefOr[Double | Boolean | Maximum] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    borderWidth: js.UndefOr[Double] = js.undefined,
    borderWidthSelected: js.UndefOr[Double] = js.undefined,
    brokenImage: String = null,
    color: String | Color = null,
    fixed: Boolean | X = null,
    font: String | Align = null,
    group: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: Code = null,
    image: String | Image = null,
    label: String = null,
    labelHighlightBold: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    margin: Bottom = null,
    mass: js.UndefOr[Double] = js.undefined,
    physics: js.UndefOr[Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    shadow: Boolean | OptionsShadow = null,
    shape: String = null,
    shapeProperties: BorderDashes = null,
    size: js.UndefOr[Double] = js.undefined,
    title: String = null,
    value: js.UndefOr[Double] = js.undefined,
    widthConstraint: Double | Boolean | Maximum = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): NodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidthSelected)) __obj.updateDynamic("borderWidthSelected")(borderWidthSelected.get.asInstanceOf[js.Any])
    if (brokenImage != null) __obj.updateDynamic("brokenImage")(brokenImage.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics.get.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (widthConstraint != null) __obj.updateDynamic("widthConstraint")(widthConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

