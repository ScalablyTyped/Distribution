package typings.wordpressApiFetch.mod.Schema

import typings.wordpressApiFetch.anon.Formats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var theme_supports: Formats
}

object Theme {
  @scala.inline
  def apply(theme_supports: Formats): Theme = {
    val __obj = js.Dynamic.literal(theme_supports = theme_supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

