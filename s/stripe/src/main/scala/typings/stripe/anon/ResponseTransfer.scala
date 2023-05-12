package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Charge
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.TransferReversal
import typings.stripe.stripeStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Transfer> */
trait ResponseTransfer extends StObject {
  
  /**
    * Amount in %s to be transferred.
    */
  var amount: Double
  
  /**
    * Amount in %s reversed (can be less than the amount attribute on the transfer if a partial reversal was issued).
    */
  var amount_reversed: Double
  
  /**
    * Balance transaction that describes the impact of this transfer on your account balance.
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Time that this record of the transfer was first created.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * ID of the Stripe account the transfer was sent to.
    */
  var destination: String | Account | Null
  
  /**
    * If the destination is a Stripe account, this will be the ID of the payment that the destination account received for the transfer.
    */
  var destination_payment: js.UndefOr[String | Charge] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: transfer
  
  /**
    * A list of reversals that have been applied to the transfer.
    */
  var reversals: ApiList[TransferReversal]
  
  /**
    * Whether the transfer has been fully reversed. If the transfer is only partially reversed, this attribute will still be false.
    */
  var reversed: Boolean
  
  /**
    * ID of the charge or payment that was used to fund the transfer. If null, the transfer was funded from the available balance.
    */
  var source_transaction: String | Charge | Null
  
  /**
    * The source balance this transfer came from. One of `card`, `fpx`, or `bank_account`.
    */
  var source_type: js.UndefOr[String] = js.undefined
  
  /**
    * A string that identifies this transaction as part of a group. See the [Connect documentation](https://stripe.com/docs/connect/charges-transfers#transfer-options) for details.
    */
  var transfer_group: String | Null
}
object ResponseTransfer {
  
  inline def apply(
    amount: Double,
    amount_reversed: Double,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    reversals: ApiList[TransferReversal],
    reversed: Boolean
  ): ResponseTransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_reversed = amount_reversed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reversals = reversals.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], balance_transaction = null, description = null, destination = null, source_transaction = null, transfer_group = null)
    __obj.updateDynamic("object")("transfer")
    __obj.asInstanceOf[ResponseTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransfer] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_reversed(value: Double): Self = StObject.set(x, "amount_reversed", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDestination(value: String | Account): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestination_payment(value: String | Charge): Self = StObject.set(x, "destination_payment", value.asInstanceOf[js.Any])
    
    inline def setDestination_paymentUndefined: Self = StObject.set(x, "destination_payment", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: transfer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReversals(value: ApiList[TransferReversal]): Self = StObject.set(x, "reversals", value.asInstanceOf[js.Any])
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setSource_transaction(value: String | Charge): Self = StObject.set(x, "source_transaction", value.asInstanceOf[js.Any])
    
    inline def setSource_transactionNull: Self = StObject.set(x, "source_transaction", null)
    
    inline def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    inline def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
    
    inline def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    inline def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
  }
}
