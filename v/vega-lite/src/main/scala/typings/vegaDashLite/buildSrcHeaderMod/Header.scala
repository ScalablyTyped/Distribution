package typings.vegaDashLite.buildSrcHeaderMod

import typings.vegaDashLite.buildSrcGuideMod.Guide
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.FontWeight
import typings.vegaDashTypings.typesSpecEncodeMod.TextBaseline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header
  extends Guide
     with HeaderConfig

object Header {
  @scala.inline
  def apply(
    format: String = null,
    labelAngle: Int | Double = null,
    labelColor: String = null,
    labelFont: String = null,
    labelFontSize: Int | Double = null,
    labelLimit: Int | Double = null,
    title: String = null,
    titleAnchor: String = null,
    titleAngle: Int | Double = null,
    titleBaseline: TextBaseline = null,
    titleColor: String = null,
    titleFont: String = null,
    titleFontSize: Int | Double = null,
    titleFontWeight: FontWeight = null,
    titleLimit: Int | Double = null
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

