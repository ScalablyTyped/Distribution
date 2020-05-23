package typings.wiredep.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detect extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)#\s*bower:*(\S*))(\n|\r|.)*?(#\s*endbower)/gi
    */
  var block: RegExp
  var detect: Css
  var replace: Js
}

object Detect {
  @scala.inline
  def apply(block: RegExp, detect: Css, replace: Js): Detect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
}

