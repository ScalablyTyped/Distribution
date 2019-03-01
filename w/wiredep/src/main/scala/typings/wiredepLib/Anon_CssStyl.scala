package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssStyl extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: stdLib.RegExp
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: stdLib.RegExp
}

object Anon_CssStyl {
  @scala.inline
  def apply(css: stdLib.RegExp, styl: stdLib.RegExp): Anon_CssStyl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("styl")(styl)
    __obj.asInstanceOf[Anon_CssStyl]
  }
}

