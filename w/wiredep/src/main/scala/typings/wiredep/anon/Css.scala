package typings.wiredep.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css extends js.Object {
  /**
    * @example:
    *  /-\s(.+css)/gi
    */
  var css: RegExp
  /**
    * @example:
    *  /-\s(.+js)/gi
    */
  @JSName("js")
  var js_ : RegExp
}

object Css {
  @scala.inline
  def apply(css: RegExp, js_ : RegExp): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
}

