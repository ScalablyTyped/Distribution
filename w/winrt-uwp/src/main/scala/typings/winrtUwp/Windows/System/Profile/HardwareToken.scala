package typings.winrtUwp.Windows.System.Profile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a token that contains a hardware based identification that is sufficiently unique. */
trait HardwareToken extends js.Object {
  /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
  var certificate: IBuffer
  /** Gets the hardware identifier that identifies the device. */
  var id: IBuffer
  /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
  var signature: IBuffer
}

object HardwareToken {
  @scala.inline
  def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): HardwareToken = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardwareToken]
  }
}

