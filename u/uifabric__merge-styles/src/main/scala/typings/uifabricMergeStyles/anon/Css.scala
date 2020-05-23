package typings.uifabricMergeStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css extends js.Object {
  var css: String
  var html: String
}

object Css {
  @scala.inline
  def apply(css: String, html: String): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
}

