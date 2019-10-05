package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
class PointerDevice () extends IPointerDevice {
  /* CompleteClass */
  override var isIntegrated: Boolean = js.native
  /* CompleteClass */
  override var maxContacts: Double = js.native
  /* CompleteClass */
  override var physicalDeviceRect: Rect = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var screenRect: Rect = js.native
  /* CompleteClass */
  override var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
object PointerDevice extends js.Object {
  def getPointerDevice(pointerId: Double): PointerDevice = js.native
  def getPointerDevices(): IVectorView[PointerDevice] = js.native
}

