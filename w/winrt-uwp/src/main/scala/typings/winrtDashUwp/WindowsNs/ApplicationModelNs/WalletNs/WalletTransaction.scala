package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single wallet transaction in the transaction history. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletTransaction")
@js.native
/** Initializes a new instance of the WalletTransaction class. */
class WalletTransaction () extends js.Object {
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

