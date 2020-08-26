package typings.terser.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[Boolean | CompressOptions] = js.native
  var ecma: js.UndefOr[ECMA] = js.native
  var format: js.UndefOr[FormatOptions] = js.native
  var ie8: js.UndefOr[Boolean] = js.native
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.native
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.native
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.native
  var module: js.UndefOr[Boolean] = js.native
  var nameCache: js.UndefOr[js.Object] = js.native
  var parse: js.UndefOr[ParseOptions] = js.native
  var safari10: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.native
  var toplevel: js.UndefOr[Boolean] = js.native
}

object MinifyOptions {
  @scala.inline
  def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  @scala.inline
  implicit class MinifyOptionsOps[Self <: MinifyOptions] (val x: Self) extends AnyVal {
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
    def setCompress(value: Boolean | CompressOptions): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setEcma(value: ECMA): Self = this.set("ecma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcma: Self = this.set("ecma", js.undefined)
    @scala.inline
    def setFormat(value: FormatOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIe8(value: Boolean): Self = this.set("ie8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIe8: Self = this.set("ie8", js.undefined)
    @scala.inline
    def setKeep_classnames(value: Boolean | RegExp): Self = this.set("keep_classnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_classnames: Self = this.set("keep_classnames", js.undefined)
    @scala.inline
    def setKeep_fnames(value: Boolean | RegExp): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    @scala.inline
    def setMangle(value: Boolean | MangleOptions): Self = this.set("mangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setNameCache(value: js.Object): Self = this.set("nameCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameCache: Self = this.set("nameCache", js.undefined)
    @scala.inline
    def setParse(value: ParseOptions): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setSafari10(value: Boolean): Self = this.set("safari10", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafari10: Self = this.set("safari10", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean | SourceMapOptions): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
  }
  
}

