package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "Interface")
@js.native
class Interface protected () extends js.Object {
  def this(device: Device, id: scala.Double) = this()
  /** Integer alternate setting number. */
  var altSetting: scala.Double = js.native
  /** Object with fields from the interface descriptor -- see libusb documentation or USB spec. */
  var descriptor: InterfaceDescriptor = js.native
  /** List of endpoints on this interface: InEndpoint and OutEndpoint objects. */
  var endpoints: js.Array[Endpoint] = js.native
  /** Integer interface number. */
  var interfaceNumber: scala.Double = js.native
  /**
    * Re-attaches the kernel driver for the interface.
    *
    * The device must be open to use this method.
    */
  def attachKernelDriver(): scala.Double = js.native
  /**
    * Claims the interface. This method must be called before using any endpoints of this interface.
    *
    * The device must be open to use this method.
    */
  def claim(): scala.Unit = js.native
  /**
    * Detaches the kernel driver from the interface.
    *
    * The device must be open to use this method.
    */
  def detachKernelDriver(): scala.Double = js.native
  /**
    * Return the InEndpoint or OutEndpoint with the specified address.
    *
    * The device must be open to use this method.
    * @param addr
    */
  def endpoint(addr: scala.Double): Endpoint = js.native
  /**
    * Returns `false` if a kernel driver is not active; `true` if active.
    *
    * The device must be open to use this method.
    */
  def isKernelDriverActive(): scala.Boolean = js.native
  /**
    * Releases the interface and resets the alternate setting. Calls callback when complete.
    *
    * It is an error to release an interface with pending transfers.
    *
    * The device must be open to use this method.
    * @param cb
    */
  def release(): scala.Unit = js.native
  def release(cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  def release(closeEndpoints: scala.Boolean): scala.Unit = js.native
  def release(
    closeEndpoints: scala.Boolean,
    cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the alternate setting. It updates the `interface.endpoints` array to reflect the endpoints found in the alternate setting.
    *
    * The device must be open to use this method.
    * @param altSetting
    * @param cb
    */
  def setAltSetting(altSetting: scala.Double, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

