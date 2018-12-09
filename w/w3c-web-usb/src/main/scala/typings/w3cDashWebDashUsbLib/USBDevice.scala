package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBDevice")
@js.native
class USBDevice () extends js.Object {
  val configuration: js.UndefOr[USBConfiguration] = js.native
  val configurations: js.Array[USBConfiguration] = js.native
  val deviceClass: scala.Double = js.native
  val deviceProtocol: scala.Double = js.native
  val deviceSubclass: scala.Double = js.native
  val deviceVersionMajor: scala.Double = js.native
  val deviceVersionMinor: scala.Double = js.native
  val deviceVersionSubminor: scala.Double = js.native
  val manufacturerName: js.UndefOr[java.lang.String] = js.native
  val opened: scala.Boolean = js.native
  val productId: scala.Double = js.native
  val productName: js.UndefOr[java.lang.String] = js.native
  val serialNumber: js.UndefOr[java.lang.String] = js.native
  val usbVersionMajor: scala.Double = js.native
  val usbVersionMinor: scala.Double = js.native
  val usbVersionSubminor: scala.Double = js.native
  val vendorId: scala.Double = js.native
  def claimInterface(interfaceNumber: scala.Double): js.Promise[scala.Unit] = js.native
  def clearHalt(direction: USBDirection, endpointNumber: scala.Double): js.Promise[scala.Unit] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def controlTransferIn(setup: USBControlTransferParameters, length: scala.Double): js.Promise[USBInTransferResult] = js.native
  def controlTransferOut(setup: USBControlTransferParameters): js.Promise[USBOutTransferResult] = js.native
  def controlTransferOut(setup: USBControlTransferParameters, data: stdLib.BufferSource): js.Promise[USBOutTransferResult] = js.native
  def isochronousTransferIn(endpointNumber: scala.Double, packetLengths: js.Array[scala.Double]): js.Promise[USBIsochronousInTransferResult] = js.native
  def isochronousTransferOut(endpointNumber: scala.Double, data: stdLib.BufferSource, packetLengths: js.Array[scala.Double]): js.Promise[USBIsochronousOutTransferResult] = js.native
  def open(): js.Promise[scala.Unit] = js.native
  def releaseInterface(interfaceNumber: scala.Double): js.Promise[scala.Unit] = js.native
  def reset(): js.Promise[scala.Unit] = js.native
  def selectAlternateInterface(interfaceNumber: scala.Double, alternateSetting: scala.Double): js.Promise[scala.Unit] = js.native
  def selectConfiguration(configurationValue: scala.Double): js.Promise[scala.Unit] = js.native
  def transferIn(endpointNumber: scala.Double, length: scala.Double): js.Promise[USBInTransferResult] = js.native
  def transferOut(endpointNumber: scala.Double, data: stdLib.BufferSource): js.Promise[USBOutTransferResult] = js.native
}

