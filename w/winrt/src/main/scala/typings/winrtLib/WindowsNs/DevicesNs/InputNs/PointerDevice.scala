package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
class PointerDevice () extends IPointerDevice {
  /* CompleteClass */
  override var isIntegrated: scala.Boolean = js.native
  /* CompleteClass */
  override var maxContacts: scala.Double = js.native
  /* CompleteClass */
  override var physicalDeviceRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var screenRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override var supportedUsages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDeviceUsage] = js.native
}

@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
object PointerDevice extends js.Object {
  def getPointerDevice(pointerId: scala.Double): winrtLib.WindowsNs.DevicesNs.InputNs.PointerDevice = js.native
  def getPointerDevices(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.DevicesNs.InputNs.PointerDevice] = js.native
}

