package typings.wiredep.mod

import typings.wiredep.anon.Block
import typings.wiredep.anon.BlockDetect
import typings.wiredep.anon.Detect
import typings.wiredep.anon.DetectReplace
import typings.wiredep.anon.Replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypes extends js.Object {
  var fileExtension: Block
  // defaults:
  var html: Detect
  var jade: Detect
  var less: Replace
  var scss: BlockDetect
  var styl: DetectReplace
  var yaml: Detect
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
}

