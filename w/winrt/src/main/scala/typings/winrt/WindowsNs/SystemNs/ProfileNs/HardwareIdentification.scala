package typings.winrt.WindowsNs.SystemNs.ProfileNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Profile.HardwareIdentification")
@js.native
class HardwareIdentification () extends js.Object

/* static members */
@JSGlobal("Windows.System.Profile.HardwareIdentification")
@js.native
object HardwareIdentification extends js.Object {
  def getPackageSpecificToken(nonce: IBuffer): HardwareToken = js.native
}

