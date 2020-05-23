package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CardAdded event. */
trait CardAddedEventArgs extends js.Object {
  /** Gets info about the smart card that was inserted into the smart card reader. */
  var smartCard: SmartCard
}

object CardAddedEventArgs {
  @scala.inline
  def apply(smartCard: SmartCard): CardAddedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardAddedEventArgs]
  }
}

