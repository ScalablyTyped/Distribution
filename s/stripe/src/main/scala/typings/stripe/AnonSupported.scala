package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSupported extends js.Object {
  /** Whether 3D Secure is supported on this card. */
  var supported: Boolean
}

object AnonSupported {
  @scala.inline
  def apply(supported: Boolean): AnonSupported = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSupported]
  }
}

