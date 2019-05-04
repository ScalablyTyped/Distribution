package typings
package vegaDashLiteLib.buildSrcHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header
  extends vegaDashLiteLib.buildSrcGuideMod.Guide
     with HeaderConfig

object Header {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    labelAngle: scala.Int | scala.Double = null,
    labelColor: java.lang.String = null,
    labelFont: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelLimit: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    titleAnchor: java.lang.String = null,
    titleAngle: scala.Int | scala.Double = null,
    titleBaseline: vegaDashTypingsLib.typesSpecEncodeMod.TextBaseline = null,
    titleColor: java.lang.String = null,
    titleFont: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontWeight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight = null,
    titleLimit: scala.Int | scala.Double = null
  ): Header = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor)
    if (titleAngle != null) __obj.updateDynamic("titleAngle")(titleAngle.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

