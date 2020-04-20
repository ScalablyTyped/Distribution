package typings.wpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelf extends js.Object {
  var self: String
}

object AnonSelf {
  @scala.inline
  def apply(self: String): AnonSelf = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelf]
  }
}

