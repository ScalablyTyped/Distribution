package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CardRemoved event. */
trait CardRemovedEventArgs extends js.Object {
  /** Gets info about the smart card that was taken out of the smart card reader. */
  var smartCard: SmartCard
}

object CardRemovedEventArgs {
  @scala.inline
  def apply(smartCard: SmartCard): CardRemovedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardRemovedEventArgs]
  }
}

