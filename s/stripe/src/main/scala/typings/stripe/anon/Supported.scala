package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Supported extends js.Object {
  /** Whether 3D Secure is supported on this card. */
  var supported: Boolean
}

object Supported {
  @scala.inline
  def apply(supported: Boolean): Supported = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Supported]
  }
}

