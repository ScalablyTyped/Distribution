package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetectReplaceAnonCssSass extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: stdLib.RegExp
  var detect: Anon_CssSass
  var replace: Anon_CssSassScss
}

object Anon_BlockDetectReplaceAnonCssSass {
  @scala.inline
  def apply(block: stdLib.RegExp, detect: Anon_CssSass, replace: Anon_CssSassScss): Anon_BlockDetectReplaceAnonCssSass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("detect")(detect)
    __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[Anon_BlockDetectReplaceAnonCssSass]
  }
}

