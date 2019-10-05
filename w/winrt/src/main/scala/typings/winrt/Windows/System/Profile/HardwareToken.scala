package typings.winrt.Windows.System.Profile

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Profile.HardwareToken")
@js.native
class HardwareToken () extends IHardwareToken {
  /* CompleteClass */
  override var certificate: IBuffer = js.native
  /* CompleteClass */
  override var id: IBuffer = js.native
  /* CompleteClass */
  override var signature: IBuffer = js.native
}

