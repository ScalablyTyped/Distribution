package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawString extends js.Object {
  var raw: String
}

object RawString {
  @scala.inline
  def apply(raw: String): RawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawString]
  }
}

