package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes information about the sender of a message being processed. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynMessageInfo")
@js.native
class AllJoynMessageInfo protected () extends js.Object {
  /**
                   * Generates an AllJoynMessageInfo object that contains the unique name of the sender that sent the message being processed.
                   * @param senderUniqueName The unique name of the sender.
                   */
  def this(senderUniqueName: java.lang.String) = this()
  /** The unique bus name of the message sender. */
  var senderUniqueName: java.lang.String = js.native
}

