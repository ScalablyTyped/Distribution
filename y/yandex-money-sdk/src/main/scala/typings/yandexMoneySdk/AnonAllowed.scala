package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowed extends js.Object {
  var allowed: Boolean
}

object AnonAllowed {
  @scala.inline
  def apply(allowed: Boolean): AnonAllowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowed]
  }
}

