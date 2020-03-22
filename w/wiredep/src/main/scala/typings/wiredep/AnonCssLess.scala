package typings.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCssLess extends js.Object {
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

object AnonCssLess {
  @scala.inline
  def apply(css: String, less: String): AnonCssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCssLess]
  }
}

