package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Source
import typings.stripe.mod.Stripe.Topup.Status
import typings.stripe.stripeStrings.topup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Topup> */
trait ResponseTopup extends StObject {
  
  /**
    * Amount transferred.
    */
  var amount: Double
  
  /**
    * ID of the balance transaction that describes the impact of this top-up on your account balance. May not be specified depending on status of top-up.
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
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
    * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays like weekends or bank holidays. May not be specified depending on status of top-up.
    */
  var expected_availability_date: Double | Null
  
  /**
    * Error code explaining reason for top-up failure if available (see [the errors section](https://stripe.com/docs/api#errors) for a list of codes).
    */
  var failure_code: String | Null
  
  /**
    * Message to user further explaining reason for top-up failure if available.
    */
  var failure_message: String | Null
  
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
  var `object`: topup
  
  /**
    * For most Stripe users, the source of every top-up is a bank account. This hash is then the [source object](https://stripe.com/docs/api#source_object) describing that bank account.
    */
  var source: Source | Null
  
  /**
    * Extra information about a top-up. This will appear on your source's bank statement. It must contain at least one letter.
    */
  var statement_descriptor: String | Null
  
  /**
    * The status of the top-up is either `canceled`, `failed`, `pending`, `reversed`, or `succeeded`.
    */
  var status: Status
  
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: String | Null
}
object ResponseTopup {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    status: Status
  ): ResponseTopup = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], balance_transaction = null, description = null, expected_availability_date = null, failure_code = null, failure_message = null, source = null, statement_descriptor = null, transfer_group = null)
    __obj.updateDynamic("object")("topup")
    __obj.asInstanceOf[ResponseTopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTopup] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setExpected_availability_date(value: Double): Self = StObject.set(x, "expected_availability_date", value.asInstanceOf[js.Any])
    
    inline def setExpected_availability_dateNull: Self = StObject.set(x, "expected_availability_date", null)
    
    inline def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
    
    inline def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
    
    inline def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
    
    inline def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: topup): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    inline def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
  }
}
