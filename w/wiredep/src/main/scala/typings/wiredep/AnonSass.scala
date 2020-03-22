package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSass extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp
  /**
    * @example:
    *  /@import\s['"](.+sass)['"]/gi
    */
  var sass: RegExp
  /**
    * @example:
    *  /@import\s['"](.+scss)['"]/gi
    */
  var scss: RegExp
}

object AnonSass {
  @scala.inline
  def apply(css: RegExp, sass: RegExp, scss: RegExp): AnonSass = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSass]
  }
}

