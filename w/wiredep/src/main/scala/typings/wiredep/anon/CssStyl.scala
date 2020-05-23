package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssStyl extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var css: String
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var styl: String
}

object CssStyl {
  @scala.inline
  def apply(css: String, styl: String): CssStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStyl]
  }
}

