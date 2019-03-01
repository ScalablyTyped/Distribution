package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssSass extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: stdLib.RegExp
  /**
    * @example:
    *  /@import\s['"](.+sass)['"]/gi
    */
  var sass: stdLib.RegExp
  /**
    * @example:
    *  /@import\s['"](.+scss)['"]/gi
    */
  var scss: stdLib.RegExp
}

object Anon_CssSass {
  @scala.inline
  def apply(css: stdLib.RegExp, sass: stdLib.RegExp, scss: stdLib.RegExp): Anon_CssSass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("sass")(sass)
    __obj.updateDynamic("scss")(scss)
    __obj.asInstanceOf[Anon_CssSass]
  }
}

