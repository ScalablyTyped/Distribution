package typings.xss.xssMod.Global.XSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[js.Object | Boolean] = js.undefined
  var escapeHtml: js.UndefOr[typings.xss.xssMod.Global.XSSNs.EscapeHandler] = js.undefined
  var onIgnoreTag: js.UndefOr[typings.xss.xssMod.Global.XSSNs.OnTagHandler] = js.undefined
  var onIgnoreTagAttr: js.UndefOr[typings.xss.xssMod.Global.XSSNs.OnTagAttrHandler] = js.undefined
  var onTag: js.UndefOr[typings.xss.xssMod.Global.XSSNs.OnTagHandler] = js.undefined
  var onTagAttr: js.UndefOr[typings.xss.xssMod.Global.XSSNs.OnTagAttrHandler] = js.undefined
  var safeAttrValue: js.UndefOr[typings.xss.xssMod.Global.XSSNs.SafeAttrValueHandler] = js.undefined
  var stripBlankChar: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTag: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var whiteList: js.UndefOr[typings.xss.xssMod.Global.XSSNs.IWhiteList] = js.undefined
}

object IFilterXSSOptions {
  @scala.inline
  def apply(
    allowCommentTag: js.UndefOr[Boolean] = js.undefined,
    css: js.Object | Boolean = null,
    escapeHtml: typings.xss.xssMod.Global.XSSNs.EscapeHandler = null,
    onIgnoreTag: typings.xss.xssMod.Global.XSSNs.OnTagHandler = null,
    onIgnoreTagAttr: typings.xss.xssMod.Global.XSSNs.OnTagAttrHandler = null,
    onTag: typings.xss.xssMod.Global.XSSNs.OnTagHandler = null,
    onTagAttr: typings.xss.xssMod.Global.XSSNs.OnTagAttrHandler = null,
    safeAttrValue: typings.xss.xssMod.Global.XSSNs.SafeAttrValueHandler = null,
    stripBlankChar: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTag: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTagBody: Boolean | js.Array[String] = null,
    whiteList: typings.xss.xssMod.Global.XSSNs.IWhiteList = null
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

