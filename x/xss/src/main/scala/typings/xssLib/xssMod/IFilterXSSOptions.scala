package typings
package xssLib.xssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterXSSOptions
  extends xssLib.xssMod.Global.XSSNs.IFilterXSSOptions

object IFilterXSSOptions {
  @scala.inline
  def apply(
    allowCommentTag: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.Object | scala.Boolean = null,
    escapeHtml: xssLib.xssMod.Global.XSSNs.EscapeHandler = null,
    onIgnoreTag: xssLib.xssMod.Global.XSSNs.OnTagHandler = null,
    onIgnoreTagAttr: xssLib.xssMod.Global.XSSNs.OnTagAttrHandler = null,
    onTag: xssLib.xssMod.Global.XSSNs.OnTagHandler = null,
    onTagAttr: xssLib.xssMod.Global.XSSNs.OnTagAttrHandler = null,
    safeAttrValue: xssLib.xssMod.Global.XSSNs.SafeAttrValueHandler = null,
    stripBlankChar: js.UndefOr[scala.Boolean] = js.undefined,
    stripIgnoreTag: js.UndefOr[scala.Boolean] = js.undefined,
    stripIgnoreTagBody: scala.Boolean | js.Array[java.lang.String] = null,
    whiteList: xssLib.xssMod.Global.XSSNs.IWhiteList = null
  ): IFilterXSSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCommentTag)) __obj.updateDynamic("allowCommentTag")(allowCommentTag)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (escapeHtml != null) __obj.updateDynamic("escapeHtml")(escapeHtml)
    if (onIgnoreTag != null) __obj.updateDynamic("onIgnoreTag")(onIgnoreTag)
    if (onIgnoreTagAttr != null) __obj.updateDynamic("onIgnoreTagAttr")(onIgnoreTagAttr)
    if (onTag != null) __obj.updateDynamic("onTag")(onTag)
    if (onTagAttr != null) __obj.updateDynamic("onTagAttr")(onTagAttr)
    if (safeAttrValue != null) __obj.updateDynamic("safeAttrValue")(safeAttrValue)
    if (!js.isUndefined(stripBlankChar)) __obj.updateDynamic("stripBlankChar")(stripBlankChar)
    if (!js.isUndefined(stripIgnoreTag)) __obj.updateDynamic("stripIgnoreTag")(stripIgnoreTag)
    if (stripIgnoreTagBody != null) __obj.updateDynamic("stripIgnoreTagBody")(stripIgnoreTagBody.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(whiteList)
    __obj.asInstanceOf[IFilterXSSOptions]
  }
}

