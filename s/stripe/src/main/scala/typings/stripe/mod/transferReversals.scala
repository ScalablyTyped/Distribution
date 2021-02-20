package typings.stripe.mod

import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.transfers.ITransfer
import typings.stripe.stripeStrings.transfer_reversal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferReversals {
  
  @js.native
  trait IReversal extends IResourceObject {
    
    /**
      * Amount reversed, in cents/pence.
      */
    var amount: Double = js.native
    
    /**
      * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
      */
    var balance_transaction: String | IBalanceTransaction = js.native
    
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code representing the currency.
      */
    var currency: String = js.native
    
    var metadata: IMetadata = js.native
    
    /**
      * Value is 'transfer_reversal'
      */
    @JSName("object")
    var object_IReversal: transfer_reversal = js.native
    
    /**
      * ID of the transfer that was reversed. [Expandable]
      */
    var transfer: String | ITransfer = js.native
  }
  object IReversal {
    
    @scala.inline
    def apply(
      amount: Double,
      balance_transaction: String | IBalanceTransaction,
      created: Double,
      currency: String,
      id: String,
      metadata: IMetadata,
      `object`: transfer_reversal,
      transfer: String | ITransfer
    ): IReversal = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReversal]
    }
    
    @scala.inline
    implicit class IReversalMutableBuilder[Self <: IReversal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: transfer_reversal): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer(value: String | ITransfer): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IReversalCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
      * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
      * be unset if you POST an empty value.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
      * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
      * the amount of the transfer reversed.
      */
    var refund_application_fee: js.UndefOr[Boolean] = js.native
  }
  object IReversalCreationOptions {
    
    @scala.inline
    def apply(): IReversalCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReversalCreationOptions]
    }
    
    @scala.inline
    implicit class IReversalCreationOptionsMutableBuilder[Self <: IReversalCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRefund_application_fee(value: Boolean): Self = StObject.set(x, "refund_application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_application_feeUndefined: Self = StObject.set(x, "refund_application_fee", js.undefined)
    }
  }
  
  @js.native
  trait IReversalUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * An arbitrary string which you can attach to a reversal object. It is displayed when in the web interface alongside the
      * reversal. This can be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
  }
  object IReversalUpdateOptions {
    
    @scala.inline
    def apply(): IReversalUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReversalUpdateOptions]
    }
    
    @scala.inline
    implicit class IReversalUpdateOptionsMutableBuilder[Self <: IReversalUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
}
