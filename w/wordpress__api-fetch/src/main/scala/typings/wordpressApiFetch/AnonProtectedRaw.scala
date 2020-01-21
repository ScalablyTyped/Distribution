package typings.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProtectedRaw extends js.Object {
  var `protected`: Boolean
  var raw: String
}

object AnonProtectedRaw {
  @scala.inline
  def apply(`protected`: Boolean, raw: String): AnonProtectedRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtectedRaw]
  }
}

