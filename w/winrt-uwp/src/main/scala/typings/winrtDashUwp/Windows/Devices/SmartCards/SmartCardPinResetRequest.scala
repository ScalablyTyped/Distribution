package typings.winrtDashUwp.Windows.Devices.SmartCards

import typings.std.Date
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a smart card personal identification number (PIN) reset request. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardPinResetRequest")
@js.native
abstract class SmartCardPinResetRequest () extends js.Object {
  /** Gets the smart card's challenge value. */
  var challenge: IBuffer = js.native
  /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
  var deadline: Date = js.native
  /**
    * Gets an instance of a wait time for a requested smart card personal identification number (PIN) reset.
    * @return An instance of a wait time for a requested smart card PIN reset.
    */
  def getDeferral(): SmartCardPinResetDeferral = js.native
  /**
    * Sets the response to a smart card authentication challenge/response operation.
    * @param response The response to a smart card authentication challenge/response operation.
    */
  def setResponse(response: IBuffer): Unit = js.native
}

