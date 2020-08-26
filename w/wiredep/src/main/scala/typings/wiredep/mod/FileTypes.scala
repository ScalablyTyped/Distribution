package typings.wiredep.mod

import typings.wiredep.anon.Block
import typings.wiredep.anon.BlockDetect
import typings.wiredep.anon.Detect
import typings.wiredep.anon.DetectReplace
import typings.wiredep.anon.Replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypes extends js.Object {
  var fileExtension: Block = js.native
  // defaults:
  var html: Detect = js.native
  var jade: Detect = js.native
  var less: Replace = js.native
  var scss: BlockDetect = js.native
  var styl: DetectReplace = js.native
  var yaml: Detect = js.native
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: Block,
    html: Detect,
    jade: Detect,
    less: Replace,
    scss: BlockDetect,
    styl: DetectReplace,
    yaml: Detect
  ): FileTypes = {
    val __obj = js.Dynamic.literal(fileExtension = fileExtension.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypes]
  }
  @scala.inline
  implicit class FileTypesOps[Self <: FileTypes] (val x: Self) extends AnyVal {
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
    def setFileExtension(value: Block): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: Detect): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setJade(value: Detect): Self = this.set("jade", value.asInstanceOf[js.Any])
    @scala.inline
    def setLess(value: Replace): Self = this.set("less", value.asInstanceOf[js.Any])
    @scala.inline
    def setScss(value: BlockDetect): Self = this.set("scss", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyl(value: DetectReplace): Self = this.set("styl", value.asInstanceOf[js.Any])
    @scala.inline
    def setYaml(value: Detect): Self = this.set("yaml", value.asInstanceOf[js.Any])
  }
  
}

