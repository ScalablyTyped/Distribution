package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw extends js.Object {
  var raw: String
  var rendered: String
}

object Raw {
  @scala.inline
  def apply(raw: String, rendered: String): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
}

