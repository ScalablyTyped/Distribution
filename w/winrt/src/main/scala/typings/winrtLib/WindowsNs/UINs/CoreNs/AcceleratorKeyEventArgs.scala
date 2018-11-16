package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
@js.native
class AcceleratorKeyEventArgs () extends IAcceleratorKeyEventArgs {
  /* CompleteClass */
  override var eventType: CoreAcceleratorKeyEventType = js.native
  /* CompleteClass */
  override var handled: scala.Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: winrtLib.WindowsNs.SystemNs.VirtualKey = js.native
}

