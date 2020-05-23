package typings.vis.anon

import typings.vis.mod.FontOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[String | FontOptions] = js.undefined
  var boldital: js.UndefOr[String | FontOptions] = js.undefined
  var color: js.UndefOr[String] = js.undefined
   // px
  var face: js.UndefOr[String] = js.undefined
  var ital: js.UndefOr[String | FontOptions] = js.undefined
  var mono: js.UndefOr[String | FontOptions] = js.undefined
  var multi: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
   // px
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var vadjust: js.UndefOr[String] = js.undefined
}

object Align {
  @scala.inline
  def apply(
    align: String = null,
    background: String = null,
    bold: String | FontOptions = null,
    boldital: String | FontOptions = null,
    color: String = null,
    face: String = null,
    ital: String | FontOptions = null,
    mono: String | FontOptions = null,
    multi: String = null,
    size: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    vadjust: String = null
  ): Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (boldital != null) __obj.updateDynamic("boldital")(boldital.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (ital != null) __obj.updateDynamic("ital")(ital.asInstanceOf[js.Any])
    if (mono != null) __obj.updateDynamic("mono")(mono.asInstanceOf[js.Any])
    if (multi != null) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (vadjust != null) __obj.updateDynamic("vadjust")(vadjust.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

