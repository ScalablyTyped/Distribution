package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedRaw extends js.Object {
  var `protected`: Boolean
  var raw: String
}

object ProtectedRaw {
  @scala.inline
  def apply(`protected`: Boolean, raw: String): ProtectedRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedRaw]
  }
}

