package typings.uifabricMergeStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
  var css: String
  var html: String
}

object AnonCss {
  @scala.inline
  def apply(css: String, html: String): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
}

