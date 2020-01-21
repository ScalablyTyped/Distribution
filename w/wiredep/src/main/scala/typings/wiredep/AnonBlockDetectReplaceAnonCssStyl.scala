package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockDetectReplaceAnonCssStyl extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  var detect: AnonCssStyl
  var replace: AnonCssStylString
}

object AnonBlockDetectReplaceAnonCssStyl {
  @scala.inline
  def apply(block: RegExp, detect: AnonCssStyl, replace: AnonCssStylString): AnonBlockDetectReplaceAnonCssStyl = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlockDetectReplaceAnonCssStyl]
  }
}

