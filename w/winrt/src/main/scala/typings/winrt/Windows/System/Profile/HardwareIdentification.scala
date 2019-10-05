package typings.winrt.Windows.System.Profile

import typings.winrt.Windows.Storage.Streams.IBuffer
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

