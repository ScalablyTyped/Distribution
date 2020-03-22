package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyl extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: RegExp
}

object AnonStyl {
  @scala.inline
  def apply(css: RegExp, styl: RegExp): AnonStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStyl]
  }
}

