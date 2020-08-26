package typings.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectionCapabilities extends js.Object {
  var isTypeSupported: js.Any = js.native
}

object ProtectionCapabilities {
  @scala.inline
  def apply(isTypeSupported: js.Any): ProtectionCapabilities = {
    val __obj = js.Dynamic.literal(isTypeSupported = isTypeSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionCapabilities]
  }
  @scala.inline
  implicit class ProtectionCapabilitiesOps[Self <: ProtectionCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsTypeSupported(value: js.Any): Self = this.set("isTypeSupported", value.asInstanceOf[js.Any])
  }
  
}

