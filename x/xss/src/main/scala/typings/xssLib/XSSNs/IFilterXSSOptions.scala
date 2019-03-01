package typings
package xssLib.XSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[scala.Boolean] = js.undefined
  var css: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  var escapeHtml: js.UndefOr[EscapeHandler] = js.undefined
  var onIgnoreTag: js.UndefOr[OnTagHandler] = js.undefined
  var onIgnoreTagAttr: js.UndefOr[OnTagAttrHandler] = js.undefined
  var onTag: js.UndefOr[OnTagHandler] = js.undefined
  var onTagAttr: js.UndefOr[OnTagAttrHandler] = js.undefined
  var safeAttrValue: js.UndefOr[SafeAttrValueHandler] = js.undefined
  var stripBlankChar: js.UndefOr[scala.Boolean] = js.undefined
  var stripIgnoreTag: js.UndefOr[scala.Boolean] = js.undefined
  var stripIgnoreTagBody: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var whiteList: js.UndefOr[IWhiteList] = js.undefined
}

object IFilterXSSOptions {
  @scala.inline
  def apply(
    allowCommentTag: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.Object | scala.Boolean = null,
    escapeHtml: EscapeHandler = null,
    onIgnoreTag: OnTagHandler = null,
    onIgnoreTagAttr: OnTagAttrHandler = null,
    onTag: OnTagHandler = null,
    onTagAttr: OnTagAttrHandler = null,
    safeAttrValue: SafeAttrValueHandler = null,
    stripBlankChar: js.UndefOr[scala.Boolean] = js.undefined,
    stripIgnoreTag: js.UndefOr[scala.Boolean] = js.undefined,
    stripIgnoreTagBody: scala.Boolean | js.Array[java.lang.String] = null,
    whiteList: IWhiteList = null
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

