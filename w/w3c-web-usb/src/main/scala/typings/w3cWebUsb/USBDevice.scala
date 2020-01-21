package typings.w3cWebUsb

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBDevice")
@js.native
class USBDevice () extends js.Object {
  val configuration: js.UndefOr[USBConfiguration] = js.native
  val configurations: js.Array[USBConfiguration] = js.native
  val deviceClass: Double = js.native
  val deviceProtocol: Double = js.native
  val deviceSubclass: Double = js.native
  val deviceVersionMajor: Double = js.native
  val deviceVersionMinor: Double = js.native
  val deviceVersionSubminor: Double = js.native
  val manufacturerName: js.UndefOr[String] = js.native
  val opened: Boolean = js.native
  val productId: Double = js.native
  val productName: js.UndefOr[String] = js.native
  val serialNumber: js.UndefOr[String] = js.native
  val usbVersionMajor: Double = js.native
  val usbVersionMinor: Double = js.native
  val usbVersionSubminor: Double = js.native
  val vendorId: Double = js.native
  def claimInterface(interfaceNumber: Double): js.Promise[Unit] = js.native
  def clearHalt(direction: USBDirection, endpointNumber: Double): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def controlTransferIn(setup: USBControlTransferParameters, length: Double): js.Promise[USBInTransferResult] = js.native
  def controlTransferOut(setup: USBControlTransferParameters): js.Promise[USBOutTransferResult] = js.native
  def controlTransferOut(setup: USBControlTransferParameters, data: BufferSource): js.Promise[USBOutTransferResult] = js.native
  def isochronousTransferIn(endpointNumber: Double, packetLengths: js.Array[Double]): js.Promise[USBIsochronousInTransferResult] = js.native
  def isochronousTransferOut(endpointNumber: Double, data: BufferSource, packetLengths: js.Array[Double]): js.Promise[USBIsochronousOutTransferResult] = js.native
  def open(): js.Promise[Unit] = js.native
  def releaseInterface(interfaceNumber: Double): js.Promise[Unit] = js.native
  def reset(): js.Promise[Unit] = js.native
  def selectAlternateInterface(interfaceNumber: Double, alternateSetting: Double): js.Promise[Unit] = js.native
  def selectConfiguration(configurationValue: Double): js.Promise[Unit] = js.native
  def transferIn(endpointNumber: Double, length: Double): js.Promise[USBInTransferResult] = js.native
  def transferOut(endpointNumber: Double, data: BufferSource): js.Promise[USBOutTransferResult] = js.native
}

