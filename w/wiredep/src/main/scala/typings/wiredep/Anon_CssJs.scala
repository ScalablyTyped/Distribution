package typings.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssJs extends js.Object {
  /**
    * @example:
    *  '- {{filePath}}'
    */
  var css: String
  /**
    * @example:
    *  '- {{filePath}}'
    */
  @JSName("js")
  var js_ : String
}

object Anon_CssJs {
  @scala.inline
  def apply(css: String, js_ : String): Anon_CssJs = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CssJs]
  }
}

