package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rendered extends js.Object {
  var rendered: String
}

object Rendered {
  @scala.inline
  def apply(rendered: String): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
}

