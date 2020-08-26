package typings.terser.mod

import typings.sourceMap.mod.RawSourceMap
import typings.terser.terserStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapOptions extends js.Object {
  /** Source map object, 'inline' or source map file content */
  var content: js.UndefOr[RawSourceMap | String] = js.native
  var filename: js.UndefOr[String] = js.native
  var includeSources: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var url: js.UndefOr[String | `inline`] = js.native
}

object SourceMapOptions {
  @scala.inline
  def apply(): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOptions]
  }
  @scala.inline
  implicit class SourceMapOptionsOps[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: RawSourceMap | String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setIncludeSources(value: Boolean): Self = this.set("includeSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSources: Self = this.set("includeSources", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setUrl(value: String | `inline`): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

