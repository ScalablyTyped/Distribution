package typings
package wiredepLib.wiredepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypes extends js.Object {
  var fileExtension: wiredepLib.Anon_Block
  // defaults:
  var html: wiredepLib.Anon_BlockDetect
  var jade: wiredepLib.Anon_BlockDetect
  var less: wiredepLib.Anon_BlockDetectReplace
  var scss: wiredepLib.Anon_BlockDetectReplaceAnonCssSass
  var styl: wiredepLib.Anon_BlockDetectReplaceAnonCssStyl
  var yaml: wiredepLib.Anon_BlockDetect
}

object FileTypes {
  @scala.inline
  def apply(
    fileExtension: wiredepLib.Anon_Block,
    html: wiredepLib.Anon_BlockDetect,
    jade: wiredepLib.Anon_BlockDetect,
    less: wiredepLib.Anon_BlockDetectReplace,
    scss: wiredepLib.Anon_BlockDetectReplaceAnonCssSass,
    styl: wiredepLib.Anon_BlockDetectReplaceAnonCssStyl,
    yaml: wiredepLib.Anon_BlockDetect
  ): FileTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExtension")(fileExtension)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("jade")(jade)
    __obj.updateDynamic("less")(less)
    __obj.updateDynamic("scss")(scss)
    __obj.updateDynamic("styl")(styl)
    __obj.updateDynamic("yaml")(yaml)
    __obj.asInstanceOf[FileTypes]
  }
}

