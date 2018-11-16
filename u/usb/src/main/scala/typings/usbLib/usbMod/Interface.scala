package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "Interface")
@js.native
class Interface protected () extends js.Object {
  def this(device: Device, id: scala.Double) = this()
  var altSetting: scala.Double = js.native
  var descriptor: InterfaceDescriptor = js.native
  var endpoints: js.Array[Endpoint] = js.native
  var interfaceNumber: scala.Double = js.native
  def attachKernelDriver(): scala.Double = js.native
  def claim(): scala.Unit = js.native
  def detachKernelDriver(): scala.Double = js.native
  def endpoint(addr: scala.Double): Endpoint = js.native
  def isKernelDriverActive(): scala.Boolean = js.native
  def release(): scala.Unit = js.native
  def release(cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  def release(closeEndpoints: scala.Boolean): scala.Unit = js.native
  def release(
    closeEndpoints: scala.Boolean,
    cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def setAltSetting(altSetting: scala.Double, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

