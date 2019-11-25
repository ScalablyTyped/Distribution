package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetectReplaceAnonCssStyl extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  var detect: Anon_CssStyl
  var replace: Anon_CssStylString
}

object Anon_BlockDetectReplaceAnonCssStyl {
  @scala.inline
  def apply(block: RegExp, detect: Anon_CssStyl, replace: Anon_CssStylString): Anon_BlockDetectReplaceAnonCssStyl = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlockDetectReplaceAnonCssStyl]
  }
}

