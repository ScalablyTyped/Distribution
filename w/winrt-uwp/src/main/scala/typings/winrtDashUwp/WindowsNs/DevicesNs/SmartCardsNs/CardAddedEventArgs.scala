package typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CardAdded event. */
@JSGlobal("Windows.Devices.SmartCards.CardAddedEventArgs")
@js.native
abstract class CardAddedEventArgs () extends js.Object {
  /** Gets info about the smart card that was inserted into the smart card reader. */
  var smartCard: SmartCard = js.native
}

