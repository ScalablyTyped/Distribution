package typings.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssOptions extends js.Object {
  var `import`: js.UndefOr[Boolean | ImportFilter] = js.native
  var modules: js.UndefOr[Boolean | String | ModuleOptions] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[Boolean | UrlFilter] = js.native
}

object CssOptions {
  @scala.inline
  def apply(): CssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssOptions]
  }
  @scala.inline
  implicit class CssOptionsOps[Self <: CssOptions] (val x: Self) extends AnyVal {
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
    def setImportFunction2(value: (/* parseImport */ ParseImportOptions, /* resourcePath */ String) => Boolean): Self = this.set("import", js.Any.fromFunction2(value))
    @scala.inline
    def setImport(value: Boolean | ImportFilter): Self = this.set("import", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
    @scala.inline
    def setModules(value: Boolean | String | ModuleOptions): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setUrlFunction2(value: (/* url */ String, /* resourcePath */ String) => Boolean): Self = this.set("url", js.Any.fromFunction2(value))
    @scala.inline
    def setUrl(value: Boolean | UrlFilter): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

