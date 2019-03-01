package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var bold: js.UndefOr[java.lang.String | visLib.visMod.FontOptions] = js.undefined
  var boldital: js.UndefOr[java.lang.String | visLib.visMod.FontOptions] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
   // px
  var face: js.UndefOr[java.lang.String] = js.undefined
  var ital: js.UndefOr[java.lang.String | visLib.visMod.FontOptions] = js.undefined
  var mono: js.UndefOr[java.lang.String | visLib.visMod.FontOptions] = js.undefined
  var multi: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
   // px
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var vadjust: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    background: java.lang.String = null,
    bold: java.lang.String | visLib.visMod.FontOptions = null,
    boldital: java.lang.String | visLib.visMod.FontOptions = null,
    color: java.lang.String = null,
    face: java.lang.String = null,
    ital: java.lang.String | visLib.visMod.FontOptions = null,
    mono: java.lang.String | visLib.visMod.FontOptions = null,
    multi: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    vadjust: java.lang.String = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (boldital != null) __obj.updateDynamic("boldital")(boldital.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (face != null) __obj.updateDynamic("face")(face)
    if (ital != null) __obj.updateDynamic("ital")(ital.asInstanceOf[js.Any])
    if (mono != null) __obj.updateDynamic("mono")(mono.asInstanceOf[js.Any])
    if (multi != null) __obj.updateDynamic("multi")(multi)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (vadjust != null) __obj.updateDynamic("vadjust")(vadjust)
    __obj.asInstanceOf[Anon_Align]
  }
}

