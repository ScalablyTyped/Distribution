package typings.xss.mod.global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[Boolean] = js.native
  var css: js.UndefOr[js.Object | Boolean] = js.native
  var escapeHtml: js.UndefOr[EscapeHandler] = js.native
  var onIgnoreTag: js.UndefOr[OnTagHandler] = js.native
  var onIgnoreTagAttr: js.UndefOr[OnTagAttrHandler] = js.native
  var onTag: js.UndefOr[OnTagHandler] = js.native
  var onTagAttr: js.UndefOr[OnTagAttrHandler] = js.native
  var safeAttrValue: js.UndefOr[SafeAttrValueHandler] = js.native
  var stripBlankChar: js.UndefOr[Boolean] = js.native
  var stripIgnoreTag: js.UndefOr[Boolean] = js.native
  var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.native
  var whiteList: js.UndefOr[IWhiteList] = js.native
}

object IFilterXSSOptions {
  @scala.inline
  def apply(): IFilterXSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterXSSOptions]
  }
  @scala.inline
  implicit class IFilterXSSOptionsOps[Self <: IFilterXSSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowCommentTag(value: Boolean): Self = this.set("allowCommentTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCommentTag: Self = this.set("allowCommentTag", js.undefined)
    @scala.inline
    def setCss(value: js.Object | Boolean): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setEscapeHtml(value: /* str */ String => String): Self = this.set("escapeHtml", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEscapeHtml: Self = this.set("escapeHtml", js.undefined)
    @scala.inline
    def setOnIgnoreTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = this.set("onIgnoreTag", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnIgnoreTag: Self = this.set("onIgnoreTag", js.undefined)
    @scala.inline
    def setOnIgnoreTagAttr(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
    ): Self = this.set("onIgnoreTagAttr", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnIgnoreTagAttr: Self = this.set("onIgnoreTagAttr", js.undefined)
    @scala.inline
    def setOnTag(value: (/* tag */ String, /* html */ String, /* options */ js.Object) => String | Unit): Self = this.set("onTag", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTag: Self = this.set("onTag", js.undefined)
    @scala.inline
    def setOnTagAttr(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => String | Unit
    ): Self = this.set("onTagAttr", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnTagAttr: Self = this.set("onTagAttr", js.undefined)
    @scala.inline
    def setSafeAttrValue(
      value: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ ICSSFilter) => String
    ): Self = this.set("safeAttrValue", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSafeAttrValue: Self = this.set("safeAttrValue", js.undefined)
    @scala.inline
    def setStripBlankChar(value: Boolean): Self = this.set("stripBlankChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripBlankChar: Self = this.set("stripBlankChar", js.undefined)
    @scala.inline
    def setStripIgnoreTag(value: Boolean): Self = this.set("stripIgnoreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripIgnoreTag: Self = this.set("stripIgnoreTag", js.undefined)
    @scala.inline
    def setStripIgnoreTagBodyVarargs(value: String*): Self = this.set("stripIgnoreTagBody", js.Array(value :_*))
    @scala.inline
    def setStripIgnoreTagBody(value: Boolean | js.Array[String]): Self = this.set("stripIgnoreTagBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripIgnoreTagBody: Self = this.set("stripIgnoreTagBody", js.undefined)
    @scala.inline
    def setWhiteList(value: IWhiteList): Self = this.set("whiteList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteList: Self = this.set("whiteList", js.undefined)
  }
  
}

