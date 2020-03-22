package typings.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScss extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var sass: String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var scss: String
}

object AnonScss {
  @scala.inline
  def apply(css: String, sass: String, scss: String): AnonScss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScss]
  }
}

