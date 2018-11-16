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

