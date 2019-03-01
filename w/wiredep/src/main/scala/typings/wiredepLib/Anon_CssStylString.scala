package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssStylString extends js.Object {
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var css: java.lang.String
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var styl: java.lang.String
}

object Anon_CssStylString {
  @scala.inline
  def apply(css: java.lang.String, styl: java.lang.String): Anon_CssStylString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("styl")(styl)
    __obj.asInstanceOf[Anon_CssStylString]
  }
}

