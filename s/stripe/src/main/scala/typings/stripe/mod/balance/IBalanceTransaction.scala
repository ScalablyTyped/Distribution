package typings.stripe.mod.balance

import typings.stripe.anon.Amount
import typings.stripe.mod.IList
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.transfers.ITransfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBalanceTransaction extends IResourceObject {
  
  /**
    * Gross amount of the transaction, in cents/pence.
    */
  var amount: Double = js.native
  
  /**
    * The date the transaction's net funds will become available in the Stripe balance.
    */
  var available_on: Double = js.native
  
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var exchange_rate: js.UndefOr[Double | Null] = js.native
  
  /**
    * Fee (in cents/pence) paid for this transaction
    */
  var fee: Double = js.native
  
  /**
    * Detailed breakdown of fees (in cents/pence) paid for this transaction
    */
  var fee_details: js.Array[Amount] = js.native
  
  /**
    * Net amount of the transaction, in cents.
    */
  var net: Double = js.native
  
  /**
    * The Stripe object this transaction is related to. [Expandable]
    */
  var source: String | IResourceObject = js.native
  
  /**
    * The transfers (if any) for which source is a source_transaction.
    */
  var source_transfers: js.UndefOr[IList[ITransfer]] = js.native
  
  /**
    * If the transaction's net funds are available in the Stripe balance yet. Either "available" or "pending".
    */
  var status: String = js.native
  
  /**
    * Transaction type: "adjustment", "application_fee",
    * "application_fee_refund", "charge", "payment", "payment_refund",
    * "refund", "transfer", "transfer_cancel", "transfer_failure", or
    * "transfer_refund".
    */
  var `type`: String = js.native
}
object IBalanceTransaction {
  
  @scala.inline
  def apply(
    amount: Double,
    available_on: Double,
    created: Double,
    currency: String,
    fee: Double,
    fee_details: js.Array[Amount],
    id: String,
    net: Double,
    `object`: String,
    source: String | IResourceObject,
    status: String,
    `type`: String
  ): IBalanceTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], available_on = available_on.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], fee_details = fee_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBalanceTransaction]
  }
  
  @scala.inline
  implicit class IBalanceTransactionOps[Self <: IBalanceTransaction] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_on(value: Double): Self = this.set("available_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee(value: Double): Self = this.set("fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee_detailsVarargs(value: Amount*): Self = this.set("fee_details", js.Array(value :_*))
    
    @scala.inline
    def setFee_details(value: js.Array[Amount]): Self = this.set("fee_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: Double): Self = this.set("net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String | IResourceObject): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExchange_rate(value: Double): Self = this.set("exchange_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange_rate: Self = this.set("exchange_rate", js.undefined)
    
    @scala.inline
    def setExchange_rateNull: Self = this.set("exchange_rate", null)
    
    @scala.inline
    def setSource_transfers(value: IList[ITransfer]): Self = this.set("source_transfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_transfers: Self = this.set("source_transfers", js.undefined)
  }
}
