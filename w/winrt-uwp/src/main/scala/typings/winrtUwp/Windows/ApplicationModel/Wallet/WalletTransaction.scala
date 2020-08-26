package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single wallet transaction in the transaction history. */
@js.native
trait WalletTransaction extends js.Object {
  /** Gets or sets the summary description (suitable for user UI) of the transaction. */
  var description: String = js.native
  /** Gets or sets the transaction amount. */
  var displayAmount: String = js.native
  /** Gets or sets a description (suitable for user UI) of the transaction location. */
  var displayLocation: String = js.native
  /** Gets or sets whether to display the time of the transaction. */
  var ignoreTimeOfDay: Boolean = js.native
  /** Gets or sets whether to launch your app when the user taps "see more transaction history". */
  var isLaunchable: Boolean = js.native
  /** Gets or sets the date and time of the transaction. */
  var transactionDate: Date = js.native
}

object WalletTransaction {
  @scala.inline
  def apply(
    description: String,
    displayAmount: String,
    displayLocation: String,
    ignoreTimeOfDay: Boolean,
    isLaunchable: Boolean,
    transactionDate: Date
  ): WalletTransaction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayAmount = displayAmount.asInstanceOf[js.Any], displayLocation = displayLocation.asInstanceOf[js.Any], ignoreTimeOfDay = ignoreTimeOfDay.asInstanceOf[js.Any], isLaunchable = isLaunchable.asInstanceOf[js.Any], transactionDate = transactionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletTransaction]
  }
  @scala.inline
  implicit class WalletTransactionOps[Self <: WalletTransaction] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayAmount(value: String): Self = this.set("displayAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayLocation(value: String): Self = this.set("displayLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreTimeOfDay(value: Boolean): Self = this.set("ignoreTimeOfDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLaunchable(value: Boolean): Self = this.set("isLaunchable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionDate(value: Date): Self = this.set("transactionDate", value.asInstanceOf[js.Any])
  }
  
}

