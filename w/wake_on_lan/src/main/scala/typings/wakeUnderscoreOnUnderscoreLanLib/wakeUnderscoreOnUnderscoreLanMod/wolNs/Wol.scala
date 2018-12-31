package typings
package wakeUnderscoreOnUnderscoreLanLib.wakeUnderscoreOnUnderscoreLanMod.wolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wol extends js.Object {
  /**
  		 * Creates a buffer with a magic packet for the given MAC address.
  		 *
  		 * @param {string} macAddress mac address of the target device
  		 * @return {Buffer} the magic packet
  		 */
  def createMagicPacket(macAddress: java.lang.String): nodeLib.Buffer = js.native
  /**
  		 * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
  		 *
  		 * @param {string} macAddress the mac address of the target device
  		 */
  def wake(macAddress: java.lang.String): scala.Unit = js.native
  /**
  		 * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
  		 *
  		 * @param {string} macAddress the mac address of the target device
  		 * @param {ErrorCallback} callback is called when all packets have been sent or an error occurs.
  		 */
  def wake(macAddress: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  /**
  		 * Send a sequence of Wake-on-LAN magic packets to the given MAC address.
  		 *
  		 * @param {string} macAddress the mac address of the target device
  		 * @param {WakeOptions} opts additional options to send the packet
  		 * @param {ErrorCallback} callback is called when all packets have been sent or an error occurs.
  		 */
  def wake(macAddress: java.lang.String, opts: WakeOptions): scala.Unit = js.native
  def wake(macAddress: java.lang.String, opts: WakeOptions, callback: js.Function): scala.Unit = js.native
}

