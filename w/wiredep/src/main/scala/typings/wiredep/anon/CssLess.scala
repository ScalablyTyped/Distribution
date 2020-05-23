package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssLess extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: String
}

object CssLess {
  @scala.inline
  def apply(css: String, less: String): CssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLess]
  }
}

