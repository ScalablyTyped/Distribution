package typings.wiredep.mod

import typings.wiredep.AnonBlock
import typings.wiredep.AnonBlockDetect
import typings.wiredep.AnonBlockDetectReplace
import typings.wiredep.AnonBlockDetectReplaceAnonCssSass
import typings.wiredep.AnonBlockDetectReplaceAnonCssStyl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypes extends js.Object {
  var fileExtension: AnonBlock
  // defaults:
  var html: AnonBlockDetect
  var jade: AnonBlockDetect
  var less: AnonBlockDetectReplace
  var scss: AnonBlockDetectReplaceAnonCssSass
  var styl: AnonBlockDetectReplaceAnonCssStyl
  var yaml: AnonBlockDetect
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: AnonBlock,
    html: AnonBlockDetect,
    jade: AnonBlockDetect,
    less: AnonBlockDetectReplace,
    scss: AnonBlockDetectReplaceAnonCssSass,
    styl: AnonBlockDetectReplaceAnonCssStyl,
    yaml: AnonBlockDetect
  ): FileTypes = {
    val __obj = js.Dynamic.literal(fileExtension = fileExtension.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileTypes]
  }
}

