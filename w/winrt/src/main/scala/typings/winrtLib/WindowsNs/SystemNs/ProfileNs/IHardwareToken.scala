package typings
package winrtLib.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHardwareToken extends js.Object {
  var certificate: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var id: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var signature: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IHardwareToken {
  @scala.inline
  def apply(
    certificate: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    id: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): IHardwareToken = {
    val __obj = js.Dynamic.literal(certificate = certificate, id = id, signature = signature)
  
    __obj.asInstanceOf[IHardwareToken]
  }
}

