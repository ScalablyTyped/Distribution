package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single wallet transaction in the transaction history. */
@js.native
trait WalletTransaction extends StObject {
  
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
  implicit class WalletTransactionMutableBuilder[Self <: WalletTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAmount(value: String): Self = StObject.set(x, "displayAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLocation(value: String): Self = StObject.set(x, "displayLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTimeOfDay(value: Boolean): Self = StObject.set(x, "ignoreTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLaunchable(value: Boolean): Self = StObject.set(x, "isLaunchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionDate(value: Date): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
  }
}
