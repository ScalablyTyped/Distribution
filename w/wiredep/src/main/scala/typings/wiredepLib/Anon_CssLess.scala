package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssLess extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: stdLib.RegExp
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: stdLib.RegExp
}

object Anon_CssLess {
  @scala.inline
  def apply(css: stdLib.RegExp, less: stdLib.RegExp): Anon_CssLess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("less")(less)
    __obj.asInstanceOf[Anon_CssLess]
  }
}

