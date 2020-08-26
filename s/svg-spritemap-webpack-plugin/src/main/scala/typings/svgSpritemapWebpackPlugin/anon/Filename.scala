package typings.svgSpritemapWebpackPlugin.anon

import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.data
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filename extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var format: js.UndefOr[data | fragment] = js.native
  var variables: js.UndefOr[Mixin] = js.native
}

object Filename {
  @scala.inline
  def apply(): Filename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filename]
  }
  @scala.inline
  implicit class FilenameOps[Self <: Filename] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFormat(value: data | fragment): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setVariables(value: Mixin): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

