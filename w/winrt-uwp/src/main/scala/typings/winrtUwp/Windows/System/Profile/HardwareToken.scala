package typings.winrtUwp.Windows.System.Profile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a token that contains a hardware based identification that is sufficiently unique. */
@js.native
trait HardwareToken extends js.Object {
  /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
  var certificate: IBuffer = js.native
  /** Gets the hardware identifier that identifies the device. */
  var id: IBuffer = js.native
  /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
  var signature: IBuffer = js.native
}

object HardwareToken {
  @scala.inline
  def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): HardwareToken = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardwareToken]
  }
  @scala.inline
  implicit class HardwareTokenOps[Self <: HardwareToken] (val x: Self) extends AnyVal {
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
    def setCertificate(value: IBuffer): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IBuffer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: IBuffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

