package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssLessString extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: java.lang.String
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: java.lang.String
}

object Anon_CssLessString {
  @scala.inline
  def apply(css: java.lang.String, less: java.lang.String): Anon_CssLessString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("less")(less)
    __obj.asInstanceOf[Anon_CssLessString]
  }
}

