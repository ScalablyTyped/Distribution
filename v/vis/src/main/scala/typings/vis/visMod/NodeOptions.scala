package typings.vis.visMod

import typings.vis.Anon_Align
import typings.vis.Anon_BorderDashes
import typings.vis.Anon_Bottom
import typings.vis.Anon_Code
import typings.vis.Anon_Maximum
import typings.vis.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var borderWidthSelected: js.UndefOr[Double] = js.undefined
  var brokenImage: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String | Color] = js.undefined
  var fixed: js.UndefOr[Boolean | Anon_X] = js.undefined
  var font: js.UndefOr[String | Anon_Align] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Anon_Code] = js.undefined
  var image: js.UndefOr[String | Image] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelHighlightBold: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Anon_Bottom] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var physics: js.UndefOr[Boolean] = js.undefined
  var scaling: js.UndefOr[OptionsScaling] = js.undefined
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var shapeProperties: js.UndefOr[Anon_BorderDashes] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  /**
    * If false, no widthConstraint is applied. If a number is specified, the minimum and maximum widths of the node are set to the value.
    * The node's label's lines will be broken on spaces to stay below the maximum and the node's width
    * will be set to the minimum if less than the value.
    */
  var widthConstraint: js.UndefOr[Double | Boolean | Anon_Maximum] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    borderWidth: Int | Double = null,
    borderWidthSelected: Int | Double = null,
    brokenImage: String = null,
    color: String | Color = null,
    fixed: Boolean | Anon_X = null,
    font: String | Anon_Align = null,
    group: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: Anon_Code = null,
    image: String | Image = null,
    label: String = null,
    labelHighlightBold: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null,
    margin: Anon_Bottom = null,
    mass: Int | Double = null,
    physics: js.UndefOr[Boolean] = js.undefined,
    scaling: OptionsScaling = null,
    shadow: Boolean | OptionsShadow = null,
    shape: String = null,
    shapeProperties: Anon_BorderDashes = null,
    size: Int | Double = null,
    title: String = null,
    value: Int | Double = null,
    widthConstraint: Double | Boolean | Anon_Maximum = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): NodeOptions = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (borderWidthSelected != null) __obj.updateDynamic("borderWidthSelected")(borderWidthSelected.asInstanceOf[js.Any])
    if (brokenImage != null) __obj.updateDynamic("brokenImage")(brokenImage)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(labelHighlightBold)) __obj.updateDynamic("labelHighlightBold")(labelHighlightBold)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (!js.isUndefined(physics)) __obj.updateDynamic("physics")(physics)
    if (scaling != null) __obj.updateDynamic("scaling")(scaling)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (widthConstraint != null) __obj.updateDynamic("widthConstraint")(widthConstraint.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

