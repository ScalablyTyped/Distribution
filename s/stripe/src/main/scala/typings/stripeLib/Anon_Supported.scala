package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Supported extends js.Object {
  /** Whether 3D Secure is supported on this card. */
  var supported: scala.Boolean
}

object Anon_Supported {
  @scala.inline
  def apply(supported: scala.Boolean): Anon_Supported = {
    val __obj = js.Dynamic.literal(supported = supported)
  
    __obj.asInstanceOf[Anon_Supported]
  }
}

