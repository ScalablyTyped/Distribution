package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single wallet transaction in the transaction history. */
trait WalletTransaction extends js.Object {
  /** Gets or sets the summary description (suitable for user UI) of the transaction. */
  var description: String
  /** Gets or sets the transaction amount. */
  var displayAmount: String
  /** Gets or sets a description (suitable for user UI) of the transaction location. */
  var displayLocation: String
  /** Gets or sets whether to display the time of the transaction. */
  var ignoreTimeOfDay: Boolean
  /** Gets or sets whether to launch your app when the user taps "see more transaction history". */
  var isLaunchable: Boolean
  /** Gets or sets the date and time of the transaction. */
  var transactionDate: Date
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
}

