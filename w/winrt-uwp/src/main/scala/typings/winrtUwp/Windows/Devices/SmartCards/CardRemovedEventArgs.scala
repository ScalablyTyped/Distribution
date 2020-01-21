package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CardRemoved event. */
@JSGlobal("Windows.Devices.SmartCards.CardRemovedEventArgs")
@js.native
abstract class CardRemovedEventArgs () extends js.Object {
  /** Gets info about the smart card that was taken out of the smart card reader. */
  var smartCard: SmartCard = js.native
}

