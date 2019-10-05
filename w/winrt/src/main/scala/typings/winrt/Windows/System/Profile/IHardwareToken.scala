package typings.winrt.Windows.System.Profile

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHardwareToken extends js.Object {
  var certificate: IBuffer
  var id: IBuffer
  var signature: IBuffer
}

object IHardwareToken {
  @scala.inline
  def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): IHardwareToken = {
    val __obj = js.Dynamic.literal(certificate = certificate, id = id, signature = signature)
  
    __obj.asInstanceOf[IHardwareToken]
  }
}

