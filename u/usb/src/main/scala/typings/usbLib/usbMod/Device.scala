package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "Device")
@js.native
class Device () extends js.Object {
  var allConfigDescriptors: js.Array[ConfigDescriptor] = js.native
  var busNumber: scala.Double = js.native
  var configDescriptor: ConfigDescriptor = js.native
  var deviceAddress: scala.Double = js.native
  var deviceDescriptor: DeviceDescriptor = js.native
  var interfaces: js.Array[Interface] = js.native
  var parent: Device = js.native
  var portNumbers: js.Array[scala.Double] = js.native
  var timeout: scala.Double = js.native
  def __claimInterface(addr: scala.Double): scala.Unit = js.native
  def __open(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def controlTransfer(
    bmRequestType: scala.Double,
    bRequest: scala.Double,
    wValue: scala.Double,
    wIndex: scala.Double,
    data_or_length: js.Any,
    callback: js.Function2[
      /* error */ js.UndefOr[java.lang.String], 
      /* buf */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): Device = js.native
  def getStringDescriptor(
    desc_index: scala.Double,
    callback: js.Function2[
      /* error */ js.UndefOr[java.lang.String], 
      /* buf */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def interface(addr: scala.Double): Interface = js.native
  def open(): scala.Unit = js.native
  def open(defaultConfig: scala.Boolean): scala.Unit = js.native
  def reset(callback: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  def setConfiguration(desired: scala.Double, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

