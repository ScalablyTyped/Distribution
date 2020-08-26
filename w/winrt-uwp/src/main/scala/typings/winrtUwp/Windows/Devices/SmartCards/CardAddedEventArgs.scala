package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CardAdded event. */
@js.native
trait CardAddedEventArgs extends js.Object {
  /** Gets info about the smart card that was inserted into the smart card reader. */
  var smartCard: SmartCard = js.native
}

object CardAddedEventArgs {
  @scala.inline
  def apply(smartCard: SmartCard): CardAddedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardAddedEventArgs]
  }
  @scala.inline
  implicit class CardAddedEventArgsOps[Self <: CardAddedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSmartCard(value: SmartCard): Self = this.set("smartCard", value.asInstanceOf[js.Any])
  }
  
}

