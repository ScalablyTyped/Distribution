package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
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

object AnonCss {
  @scala.inline
  def apply(css: RegExp, js_ : RegExp): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
}

