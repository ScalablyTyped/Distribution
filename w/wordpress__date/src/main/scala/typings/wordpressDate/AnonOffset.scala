package typings.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: String
  var string: String
}

object AnonOffset {
  @scala.inline
  def apply(offset: String, string: String): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

