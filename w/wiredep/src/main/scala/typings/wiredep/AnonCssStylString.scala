package typings.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCssStylString extends js.Object {
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

object AnonCssStylString {
  @scala.inline
  def apply(css: String, styl: String): AnonCssStylString = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCssStylString]
  }
}

