package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetectReplace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: stdLib.RegExp
  var detect: Anon_CssLess
  var replace: Anon_CssLessString
}

object Anon_BlockDetectReplace {
  @scala.inline
  def apply(block: stdLib.RegExp, detect: Anon_CssLess, replace: Anon_CssLessString): Anon_BlockDetectReplace = {
    val __obj = js.Dynamic.literal(block = block, detect = detect, replace = replace)
  
    __obj.asInstanceOf[Anon_BlockDetectReplace]
  }
}

