package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssJs extends js.Object {
  /**
    * @example:
    *  '- {{filePath}}'
    */
  var css: java.lang.String
  /**
    * @example:
    *  '- {{filePath}}'
    */
  @JSName("js")
  var js_ : java.lang.String
}

object Anon_CssJs {
  @scala.inline
  def apply(css: java.lang.String, js_ : java.lang.String): Anon_CssJs = {
    val __obj = js.Dynamic.literal(css = css)
    __obj.updateDynamic("js")(js_)
    __obj.asInstanceOf[Anon_CssJs]
  }
}

