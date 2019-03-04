package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css extends js.Object {
  /**
    * @example:
    *  /-\s(.+css)/gi
    */
  var css: stdLib.RegExp
  /**
    * @example:
    *  /-\s(.+js)/gi
    */
  @JSName("js")
  var js_ : stdLib.RegExp
}

object Anon_Css {
  @scala.inline
  def apply(css: stdLib.RegExp, js_ : stdLib.RegExp): Anon_Css = {
    val __obj = js.Dynamic.literal(css = css)
    __obj.updateDynamic("js")(js_)
    __obj.asInstanceOf[Anon_Css]
  }
}

