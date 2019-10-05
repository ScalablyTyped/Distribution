package typings.xss.xssMod.Global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[js.Object | Boolean] = js.undefined
  var escapeHtml: js.UndefOr[typings.xss.xssMod.Global.XSS.EscapeHandler] = js.undefined
  var onIgnoreTag: js.UndefOr[typings.xss.xssMod.Global.XSS.OnTagHandler] = js.undefined
  var onIgnoreTagAttr: js.UndefOr[typings.xss.xssMod.Global.XSS.OnTagAttrHandler] = js.undefined
  var onTag: js.UndefOr[typings.xss.xssMod.Global.XSS.OnTagHandler] = js.undefined
  var onTagAttr: js.UndefOr[typings.xss.xssMod.Global.XSS.OnTagAttrHandler] = js.undefined
  var safeAttrValue: js.UndefOr[typings.xss.xssMod.Global.XSS.SafeAttrValueHandler] = js.undefined
  var stripBlankChar: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTag: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var whiteList: js.UndefOr[typings.xss.xssMod.Global.XSS.IWhiteList] = js.undefined
}

object IFilterXSSOptions {
  @scala.inline
  def apply(
    allowCommentTag: js.UndefOr[Boolean] = js.undefined,
    css: js.Object | Boolean = null,
    escapeHtml: /* str */ String => String = null,
    onIgnoreTag: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit = null,
    onIgnoreTagAttr: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit = null,
    onTag: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit = null,
    onTagAttr: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit = null,
    safeAttrValue: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ typings.xss.xssMod.Global.XSS.ICSSFilter) => String = null,
    stripBlankChar: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTag: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTagBody: Boolean | js.Array[String] = null,
    whiteList: typings.xss.xssMod.Global.XSS.IWhiteList = null
  ): IFilterXSSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCommentTag)) __obj.updateDynamic("allowCommentTag")(allowCommentTag)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (escapeHtml != null) __obj.updateDynamic("escapeHtml")(js.Any.fromFunction1(escapeHtml))
    if (onIgnoreTag != null) __obj.updateDynamic("onIgnoreTag")(js.Any.fromFunction3(onIgnoreTag))
    if (onIgnoreTagAttr != null) __obj.updateDynamic("onIgnoreTagAttr")(js.Any.fromFunction4(onIgnoreTagAttr))
    if (onTag != null) __obj.updateDynamic("onTag")(js.Any.fromFunction3(onTag))
    if (onTagAttr != null) __obj.updateDynamic("onTagAttr")(js.Any.fromFunction4(onTagAttr))
    if (safeAttrValue != null) __obj.updateDynamic("safeAttrValue")(js.Any.fromFunction4(safeAttrValue))
    if (!js.isUndefined(stripBlankChar)) __obj.updateDynamic("stripBlankChar")(stripBlankChar)
    if (!js.isUndefined(stripIgnoreTag)) __obj.updateDynamic("stripIgnoreTag")(stripIgnoreTag)
    if (stripIgnoreTagBody != null) __obj.updateDynamic("stripIgnoreTagBody")(stripIgnoreTagBody.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(whiteList)
    __obj.asInstanceOf[IFilterXSSOptions]
  }
}

