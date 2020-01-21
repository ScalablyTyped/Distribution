package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCssLess extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: RegExp
}

object AnonCssLess {
  @scala.inline
  def apply(css: RegExp, less: RegExp): AnonCssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCssLess]
  }
}

