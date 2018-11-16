package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPointerDeviceStatics extends js.Object {
  def getPointerDevice(pointerId: scala.Double): PointerDevice
  def getPointerDevices(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDevice]
}

