package typings.wiredep.wiredepMod

import typings.wiredep.Anon_Block
import typings.wiredep.Anon_BlockDetect
import typings.wiredep.Anon_BlockDetectReplace
import typings.wiredep.Anon_BlockDetectReplaceAnonCssSass
import typings.wiredep.Anon_BlockDetectReplaceAnonCssStyl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypes extends js.Object {
  var fileExtension: Anon_Block
  // defaults:
  var html: Anon_BlockDetect
  var jade: Anon_BlockDetect
  var less: Anon_BlockDetectReplace
  var scss: Anon_BlockDetectReplaceAnonCssSass
  var styl: Anon_BlockDetectReplaceAnonCssStyl
  var yaml: Anon_BlockDetect
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: Anon_Block,
    html: Anon_BlockDetect,
    jade: Anon_BlockDetect,
    less: Anon_BlockDetectReplace,
    scss: Anon_BlockDetectReplaceAnonCssSass,
    styl: Anon_BlockDetectReplaceAnonCssStyl,
    yaml: Anon_BlockDetect
  ): FileTypes = {
    val __obj = js.Dynamic.literal(fileExtension = fileExtension, html = html, jade = jade, less = less, scss = scss, styl = styl, yaml = yaml)
  
    __obj.asInstanceOf[FileTypes]
  }
}

