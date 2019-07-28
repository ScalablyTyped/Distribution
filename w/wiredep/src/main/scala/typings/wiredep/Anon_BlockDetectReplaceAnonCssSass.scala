package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetectReplaceAnonCssSass extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  var detect: Anon_CssSass
  var replace: Anon_CssSassScss
}

object Anon_BlockDetectReplaceAnonCssSass {
  @scala.inline
  def apply(block: RegExp, detect: Anon_CssSass, replace: Anon_CssSassScss): Anon_BlockDetectReplaceAnonCssSass = {
    val __obj = js.Dynamic.literal(block = block, detect = detect, replace = replace)
  
    __obj.asInstanceOf[Anon_BlockDetectReplaceAnonCssSass]
  }
}

