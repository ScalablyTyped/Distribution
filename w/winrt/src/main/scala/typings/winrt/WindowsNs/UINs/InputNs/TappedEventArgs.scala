package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.TappedEventArgs")
@js.native
class TappedEventArgs () extends ITappedEventArgs {
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
  /* CompleteClass */
  override var tapCount: Double = js.native
}

