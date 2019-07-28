package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDetect extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)#\s*bower:*(\S*))(\n|\r|.)*?(#\s*endbower)/gi
    */
  var block: RegExp
  var detect: Anon_Css
  var replace: Anon_CssJs
}

object Anon_BlockDetect {
  @scala.inline
  def apply(block: RegExp, detect: Anon_Css, replace: Anon_CssJs): Anon_BlockDetect = {
    val __obj = js.Dynamic.literal(block = block, detect = detect, replace = replace)
  
    __obj.asInstanceOf[Anon_BlockDetect]
  }
}

