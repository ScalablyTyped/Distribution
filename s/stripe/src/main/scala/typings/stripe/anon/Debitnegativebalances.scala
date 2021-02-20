package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debitnegativebalances extends StObject {
  
  /**
    * A Boolean indicating if Stripe should try to reclaim negative balances from
    * an attached bank account. See our Understanding Connect Account Balances
    * documentation for details. Default value is true for Express accounts and
    * false for Custom accounts.
    */
  var debit_negative_balances: js.UndefOr[Boolean] = js.native
  
  /**
    * Details on when funds from charges are available, and when they are paid out
    * to an external account. See our Setting Bank and Debit Card Payouts
    * documentation for details.
    */
  var schedule: js.UndefOr[Delaydays] = js.native
  
  /**
    * The text that appears on the bank account statement for payouts. If not set,
    * this defaults to the platform’s bank descriptor as set in the Dashboard.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
}
object Debitnegativebalances {
  
  @scala.inline
  def apply(): Debitnegativebalances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debitnegativebalances]
  }
  
  @scala.inline
  implicit class DebitnegativebalancesMutableBuilder[Self <: Debitnegativebalances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebit_negative_balances(value: Boolean): Self = StObject.set(x, "debit_negative_balances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit_negative_balancesUndefined: Self = StObject.set(x, "debit_negative_balances", js.undefined)
    
    @scala.inline
    def setSchedule(value: Delaydays): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
  }
}
