package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectReplace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  var detect: AnonStyl
  var replace: AnonCssStyl
}

object AnonDetectReplace {
  @scala.inline
  def apply(block: RegExp, detect: AnonStyl, replace: AnonCssStyl): AnonDetectReplace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetectReplace]
  }
}

