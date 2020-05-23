package typings.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectionCapabilities extends js.Object {
  var isTypeSupported: js.Any
}

object ProtectionCapabilities {
  @scala.inline
  def apply(isTypeSupported: js.Any): ProtectionCapabilities = {
    val __obj = js.Dynamic.literal(isTypeSupported = isTypeSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionCapabilities]
  }
}

