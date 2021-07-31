package typings.stripe.mod.issuing

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.issuing.authorizations.IAuthorization
import typings.stripe.mod.issuing.authorizations.MerchantData
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.mod.issuing.cards.IIssuingCard
import typings.stripe.mod.issuing.disputes.IIssuingDispute
import typings.stripe.stripeStrings.issuingDottransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactions {
  
  /**
    * Any use of an issued card that results in funds entering or leaving your Stripe account, such as a completed purchase or refund, is represented by an Issuing Transaction object.
    */
  trait ITransaction
    extends StObject
       with IResourceObject {
    
    var amount: Double
    
    /**
      * The Authorization object that led to this transaction.
      */
    var authorization: String | IAuthorization
    
    var balance_transaction: String | IBalanceTransaction
    
    /**
      * The card used to make this transaction.
      */
    var card: String | IIssuingCard
    
    /**
      * The cardholder to whom this transaction belongs.
      */
    var cardholder: String | ICardholder
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String
    
    var dispute: String | IIssuingDispute
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean
    
    var merchant_amount: Double
    
    var merchant_currency: String
    
    /**
      * More information about the user involved in the transaction.
      */
    var merchant_data: MerchantData
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_ITransaction: issuingDottransaction
    
    /**
      * One of capture, refund, cash_withdrawal, refund_reversal, dispute, or dispute_loss.
      */
    var `type`: TransactionType
  }
  object ITransaction {
    
    @scala.inline
    def apply(
      amount: Double,
      authorization: String | IAuthorization,
      balance_transaction: String | IBalanceTransaction,
      card: String | IIssuingCard,
      cardholder: String | ICardholder,
      created: Double,
      currency: String,
      dispute: String | IIssuingDispute,
      id: String,
      livemode: Boolean,
      merchant_amount: Double,
      merchant_currency: String,
      merchant_data: MerchantData,
      metadata: IMetadata,
      `type`: TransactionType
    ): ITransaction = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_amount = merchant_amount.asInstanceOf[js.Any], merchant_currency = merchant_currency.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("issuing.transaction")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransaction]
    }
    
    @scala.inline
    implicit class ITransactionMutableBuilder[Self <: ITransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorization(value: String | IAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCard(value: String | IIssuingCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholder(value: String | ICardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispute(value: String | IIssuingDispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_amount(value: Double): Self = StObject.set(x, "merchant_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_currency(value: String): Self = StObject.set(x, "merchant_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_data(value: MerchantData): Self = StObject.set(x, "merchant_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: issuingDottransaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TransactionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITransactionListOptions extends StObject {
    
    /**
      * Only return issuing transactions that belong to the given card.
      */
    var card: js.UndefOr[String] = js.undefined
    
    /**
      * Only return authorizations belonging to the given cardholder.
      */
    var cardholder: js.UndefOr[String] = js.undefined
    
    /**
      * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
      */
    var created: js.UndefOr[ICreated] = js.undefined
    
    /**
      * Only return transactions that originate from a given dispute.
      */
    var dispute: js.UndefOr[String] = js.undefined
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
      */
    var ending_before: js.UndefOr[String] = js.undefined
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Only return transactions that are associated with the given settlement.
      */
    var settlement: js.UndefOr[String] = js.undefined
    
    /**
      * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
      */
    var starting_after: js.UndefOr[String] = js.undefined
  }
  object ITransactionListOptions {
    
    @scala.inline
    def apply(): ITransactionListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransactionListOptions]
    }
    
    @scala.inline
    implicit class ITransactionListOptionsMutableBuilder[Self <: ITransactionListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCardholder(value: String): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholderUndefined: Self = StObject.set(x, "cardholder", js.undefined)
      
      @scala.inline
      def setCreated(value: ICreated): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setDispute(value: String): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputeUndefined: Self = StObject.set(x, "dispute", js.undefined)
      
      @scala.inline
      def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setSettlement(value: String): Self = StObject.set(x, "settlement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettlementUndefined: Self = StObject.set(x, "settlement", js.undefined)
      
      @scala.inline
      def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
    }
  }
  
  trait ITransactionUpdateOptions extends StObject {
    
    var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  }
  object ITransactionUpdateOptions {
    
    @scala.inline
    def apply(): ITransactionUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransactionUpdateOptions]
    }
    
    @scala.inline
    implicit class ITransactionUpdateOptionsMutableBuilder[Self <: ITransactionUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.capture
    - typings.stripe.stripeStrings.refund
    - typings.stripe.stripeStrings.cash_withdrawal
    - typings.stripe.stripeStrings.refund_reversal
    - typings.stripe.stripeStrings.dispute
    - typings.stripe.stripeStrings.dispute_loss
  */
  trait TransactionType extends StObject
  object TransactionType {
    
    @scala.inline
    def capture: typings.stripe.stripeStrings.capture = "capture".asInstanceOf[typings.stripe.stripeStrings.capture]
    
    @scala.inline
    def cash_withdrawal: typings.stripe.stripeStrings.cash_withdrawal = "cash_withdrawal".asInstanceOf[typings.stripe.stripeStrings.cash_withdrawal]
    
    @scala.inline
    def dispute: typings.stripe.stripeStrings.dispute = "dispute".asInstanceOf[typings.stripe.stripeStrings.dispute]
    
    @scala.inline
    def dispute_loss: typings.stripe.stripeStrings.dispute_loss = "dispute_loss".asInstanceOf[typings.stripe.stripeStrings.dispute_loss]
    
    @scala.inline
    def refund: typings.stripe.stripeStrings.refund = "refund".asInstanceOf[typings.stripe.stripeStrings.refund]
    
    @scala.inline
    def refund_reversal: typings.stripe.stripeStrings.refund_reversal = "refund_reversal".asInstanceOf[typings.stripe.stripeStrings.refund_reversal]
  }
}
