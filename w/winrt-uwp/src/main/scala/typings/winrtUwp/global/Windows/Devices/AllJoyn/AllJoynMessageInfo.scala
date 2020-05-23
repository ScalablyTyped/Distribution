package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes information about the sender of a message being processed. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynMessageInfo")
@js.native
class AllJoynMessageInfo protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynMessageInfo {
  /**
    * Generates an AllJoynMessageInfo object that contains the unique name of the sender that sent the message being processed.
    * @param senderUniqueName The unique name of the sender.
    */
  def this(senderUniqueName: String) = this()
  /** The unique bus name of the message sender. */
  /* CompleteClass */
  override var senderUniqueName: String = js.native
}

