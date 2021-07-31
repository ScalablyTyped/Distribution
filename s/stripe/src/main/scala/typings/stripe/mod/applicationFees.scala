package typings.stripe.mod

import typings.stripe.mod.accounts.IAccount
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.resources.ApplicationFeeRefunds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationFees {
  
  trait IApplicationFee
    extends StObject
       with IResourceObject {
    
    /**
      * ID of the Stripe account this fee was taken from. [Expandable]
      */
    var account: String | IAccount
    
    /**
      * Amount earned, in cents/pence.
      */
    var amount: Double
    
    /**
      * Positive integer or zero
      */
    var amount_refunded: Double
    
    /**
      * ID of the Connect Application that earned the fee. [Expandable]
      */
    var application: String | IApplication
    
    /**
      * Balance transaction that describes the impact of this collected application
      * fee on your account balance (not including refunds). [Expandable]
      */
    var balance_transaction: String | IBalanceTransaction
    
    /**
      * ID of the charge that the application fee was taken from. [Expandable]
      */
    var charge: String | ICharge
    
    var created: Double
    
    /**
      * Three-letter ISO code representing the currency of the charge.
      */
    var currency: String
    
    var livemode: Boolean
    
    /**
      * ID of the corresponding charge on the platform account, if this fee was the
      * result of a charge using the destination parameter. [Expandable]
      */
    var originating_transaction: String
    
    /**
      * Whether or not the fee has been fully refunded. If the fee is only partially
      * refunded, this attribute will still be false.
      */
    var refunded: Boolean
    
    /**
      * A list of refunds that have been applied to the fee.
      */
    var refunds: IApplicationFeeRefunds
  }
  object IApplicationFee {
    
    @scala.inline
    def apply(
      account: String | IAccount,
      amount: Double,
      amount_refunded: Double,
      application: String | IApplication,
      balance_transaction: String | IBalanceTransaction,
      charge: String | ICharge,
      created: Double,
      currency: String,
      id: String,
      livemode: Boolean,
      `object`: String,
      originating_transaction: String,
      refunded: Boolean,
      refunds: IApplicationFeeRefunds
    ): IApplicationFee = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], originating_transaction = originating_transaction.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApplicationFee]
    }
    
    @scala.inline
    implicit class IApplicationFeeMutableBuilder[Self <: IApplicationFee] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String | IAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_refunded(value: Double): Self = StObject.set(x, "amount_refunded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication(value: String | IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharge(value: String | ICharge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginating_transaction(value: String): Self = StObject.set(x, "originating_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefunded(value: Boolean): Self = StObject.set(x, "refunded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefunds(value: IApplicationFeeRefunds): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationFeeListOptions
    extends StObject
       with IListOptionsCreated {
    
    /**
      * Only return application fees for the charge specified by this charge ID.
      */
    var charge: String
  }
  object IApplicationFeeListOptions {
    
    @scala.inline
    def apply(charge: String): IApplicationFeeListOptions = {
      val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApplicationFeeListOptions]
    }
    
    @scala.inline
    implicit class IApplicationFeeListOptionsMutableBuilder[Self <: IApplicationFeeListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationFeeRefund
    extends StObject
       with IResourceObject {
    
    /**
      * Amount, in cents/pence.
      */
    var amount: Double
    
    /**
      * Balance transaction that describes the impact on your account balance.
      */
    var balance_transaction: String | IBalanceTransaction
    
    var created: Double
    
    /**
      * Three-letter ISO code representing the currency.
      */
    var currency: String
    
    /**
      * ID of the application fee that was refunded.
      */
    var fee: String | IApplicationFee
    
    /**
      * A set of key/value pairs that you can attach to the object. It can be useful
      * for storing additional information in a structured format.
      */
    var metadata: IMetadata
  }
  object IApplicationFeeRefund {
    
    @scala.inline
    def apply(
      amount: Double,
      balance_transaction: String | IBalanceTransaction,
      created: Double,
      currency: String,
      fee: String | IApplicationFee,
      id: String,
      metadata: IMetadata,
      `object`: String
    ): IApplicationFeeRefund = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApplicationFeeRefund]
    }
    
    @scala.inline
    implicit class IApplicationFeeRefundMutableBuilder[Self <: IApplicationFeeRefund] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFee(value: String | IApplicationFee): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationFeeRefundCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * A positive integer in pence representing how much of this fee to refund.
      * Can only refund up to the unrefunded amount remaining of the fee.
      *
      * default is entire application fee
      */
    var amount: js.UndefOr[Double] = js.undefined
  }
  object IApplicationFeeRefundCreationOptions {
    
    @scala.inline
    def apply(): IApplicationFeeRefundCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationFeeRefundCreationOptions]
    }
    
    @scala.inline
    implicit class IApplicationFeeRefundCreationOptionsMutableBuilder[Self <: IApplicationFeeRefundCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    }
  }
  
  @js.native
  trait IApplicationFeeRefunds
    extends ApplicationFeeRefunds
       with IList[IApplicationFeeRefund]
}
