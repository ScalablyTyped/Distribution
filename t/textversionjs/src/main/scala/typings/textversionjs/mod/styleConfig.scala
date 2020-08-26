package typings.textversionjs.mod

import typings.textversionjs.textversionjsStrings.hashify
import typings.textversionjs.textversionjsStrings.indentation
import typings.textversionjs.textversionjsStrings.linebreak
import typings.textversionjs.textversionjsStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait styleConfig extends js.Object {
  var headingStyle: js.UndefOr[underline | linebreak | hashify] = js.native
  var imgProcess: js.UndefOr[typings.textversionjs.mod.imgProcess] = js.native
  var keepNbsps: js.UndefOr[Boolean] = js.native
  var linkProcess: js.UndefOr[typings.textversionjs.mod.linkProcess] = js.native
  var listIndentionTabs: js.UndefOr[Double] = js.native
  var listStyle: js.UndefOr[indentation | linebreak] = js.native
  var oIndentionChar: js.UndefOr[String] = js.native
  var uIndentionChar: js.UndefOr[String] = js.native
}

object styleConfig {
  @scala.inline
  def apply(): styleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styleConfig]
  }
  @scala.inline
  implicit class styleConfigOps[Self <: styleConfig] (val x: Self) extends AnyVal {
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
    def setHeadingStyle(value: underline | linebreak | hashify): Self = this.set("headingStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingStyle: Self = this.set("headingStyle", js.undefined)
    @scala.inline
    def setImgProcess(value: (/* src */ String, /* alt */ String) => String): Self = this.set("imgProcess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteImgProcess: Self = this.set("imgProcess", js.undefined)
    @scala.inline
    def setKeepNbsps(value: Boolean): Self = this.set("keepNbsps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepNbsps: Self = this.set("keepNbsps", js.undefined)
    @scala.inline
    def setLinkProcess(value: (/* href */ String, /* linkText */ String) => String): Self = this.set("linkProcess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLinkProcess: Self = this.set("linkProcess", js.undefined)
    @scala.inline
    def setListIndentionTabs(value: Double): Self = this.set("listIndentionTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListIndentionTabs: Self = this.set("listIndentionTabs", js.undefined)
    @scala.inline
    def setListStyle(value: indentation | linebreak): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setOIndentionChar(value: String): Self = this.set("oIndentionChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOIndentionChar: Self = this.set("oIndentionChar", js.undefined)
    @scala.inline
    def setUIndentionChar(value: String): Self = this.set("uIndentionChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUIndentionChar: Self = this.set("uIndentionChar", js.undefined)
  }
  
}

