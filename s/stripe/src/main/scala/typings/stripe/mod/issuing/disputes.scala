package typings.stripe.mod.issuing

import typings.stripe.anon.Disputeexplanation
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.issuing.transactions.ITransaction
import typings.stripe.stripeStrings.issuingDotdispute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disputes {
  
  /**
    * As a card issuer, you can dispute transactions that you do not recognize, suspect to be fraudulent, or have some other issue.
    */
  @js.native
  trait IIssuingDispute extends IResourceObject {
    
    /**
      * Disputed amount. Usually the amount of the disputed_transaction, but can differ (usually because of currency fluctuation or because only part of the order is disputed).
      */
    var amount: Double = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * The currency the disputed_transaction was made in.
      */
    var currency: String = js.native
    
    /**
      * The transaction being disputed.
      */
    var disputed_transaction: String | ITransaction = js.native
    
    /**
      * Evidence related to the dispute. This hash will contain exactly one non-null value, containing an evidence object that matches its reason
      */
    var evidence: IIssuingDisputeEvidence = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: IMetadata = js.native
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_IIssuingDispute: issuingDotdispute = js.native
    
    /**
      * Reason for this dispute. One of other or fraudulent.
      */
    var reason: IssuingDisputeReason = js.native
    
    /**
      * Current status of dispute. One of lost, under_review, unsubmitted, or won.
      */
    var status: IssuingDisputeStatus = js.native
  }
  object IIssuingDispute {
    
    @scala.inline
    def apply(
      amount: Double,
      created: Double,
      currency: String,
      disputed_transaction: String | ITransaction,
      evidence: IIssuingDisputeEvidence,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: issuingDotdispute,
      reason: IssuingDisputeReason,
      status: IssuingDisputeStatus
    ): IIssuingDispute = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], disputed_transaction = disputed_transaction.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingDispute]
    }
    
    @scala.inline
    implicit class IIssuingDisputeMutableBuilder[Self <: IIssuingDispute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputed_transaction(value: String | ITransaction): Self = StObject.set(x, "disputed_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence(value: IIssuingDisputeEvidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: issuingDotdispute): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: IssuingDisputeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: IssuingDisputeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IIssuingDisputeCreateOptions extends IIssuingDisputeUpdateOptions {
    
    /**
      * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * The ID of the issuing transaction to create a dispute for.
      */
    var disputed_transaction: String = js.native
    
    /**
      * A hash containing all the evidence related to the dispute. This should have a single key, equal to the provided reason, mapping to an appropriate evidence object.
      */
    var evidence: js.UndefOr[IIssuingDisputeEvidence] = js.native
    
    /**
      * The reason for the dispute. One of other or fraudulent.
      */
    var reason: IssuingDisputeReason = js.native
  }
  object IIssuingDisputeCreateOptions {
    
    @scala.inline
    def apply(disputed_transaction: String, reason: IssuingDisputeReason): IIssuingDisputeCreateOptions = {
      val __obj = js.Dynamic.literal(disputed_transaction = disputed_transaction.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingDisputeCreateOptions]
    }
    
    @scala.inline
    implicit class IIssuingDisputeCreateOptionsMutableBuilder[Self <: IIssuingDisputeCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setDisputed_transaction(value: String): Self = StObject.set(x, "disputed_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence(value: IIssuingDisputeEvidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
      
      @scala.inline
      def setReason(value: IssuingDisputeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IIssuingDisputeEvidence extends StObject {
    
    /**
      * Evidence to support a fraudulent dispute. This will only be present if your dispute’s reason is fraudulent.
      */
    var fraudulent: js.UndefOr[Disputeexplanation] = js.native
    
    var other: js.UndefOr[Disputeexplanation] = js.native
  }
  object IIssuingDisputeEvidence {
    
    @scala.inline
    def apply(): IIssuingDisputeEvidence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIssuingDisputeEvidence]
    }
    
    @scala.inline
    implicit class IIssuingDisputeEvidenceMutableBuilder[Self <: IIssuingDisputeEvidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFraudulent(value: Disputeexplanation): Self = StObject.set(x, "fraudulent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraudulentUndefined: Self = StObject.set(x, "fraudulent", js.undefined)
      
      @scala.inline
      def setOther(value: Disputeexplanation): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    }
  }
  
  @js.native
  trait IIssuingDisputeListOptions extends StObject {
    
    /**
      * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
      */
    var created: js.UndefOr[ICreated] = js.native
    
    /**
      * Only return issuing disputes for the given transaction.
      */
    var disputed_transaction: js.UndefOr[String] = js.native
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
      */
    var ending_before: js.UndefOr[String] = js.native
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
      */
    var starting_after: js.UndefOr[String] = js.native
  }
  object IIssuingDisputeListOptions {
    
    @scala.inline
    def apply(): IIssuingDisputeListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIssuingDisputeListOptions]
    }
    
    @scala.inline
    implicit class IIssuingDisputeListOptionsMutableBuilder[Self <: IIssuingDisputeListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: ICreated): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setDisputed_transaction(value: String): Self = StObject.set(x, "disputed_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisputed_transactionUndefined: Self = StObject.set(x, "disputed_transaction", js.undefined)
      
      @scala.inline
      def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
    }
  }
  
  @js.native
  trait IIssuingDisputeUpdateOptions extends StObject {
    
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
  }
  object IIssuingDisputeUpdateOptions {
    
    @scala.inline
    def apply(): IIssuingDisputeUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIssuingDisputeUpdateOptions]
    }
    
    @scala.inline
    implicit class IIssuingDisputeUpdateOptionsMutableBuilder[Self <: IIssuingDisputeUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.other
    - typings.stripe.stripeStrings.fraudlent
  */
  trait IssuingDisputeReason extends StObject
  object IssuingDisputeReason {
    
    @scala.inline
    def fraudlent: typings.stripe.stripeStrings.fraudlent = "fraudlent".asInstanceOf[typings.stripe.stripeStrings.fraudlent]
    
    @scala.inline
    def other: typings.stripe.stripeStrings.other = "other".asInstanceOf[typings.stripe.stripeStrings.other]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.lost
    - typings.stripe.stripeStrings.under_review
    - typings.stripe.stripeStrings.unsubmitted
    - typings.stripe.stripeStrings.won
  */
  trait IssuingDisputeStatus extends StObject
  object IssuingDisputeStatus {
    
    @scala.inline
    def lost: typings.stripe.stripeStrings.lost = "lost".asInstanceOf[typings.stripe.stripeStrings.lost]
    
    @scala.inline
    def under_review: typings.stripe.stripeStrings.under_review = "under_review".asInstanceOf[typings.stripe.stripeStrings.under_review]
    
    @scala.inline
    def unsubmitted: typings.stripe.stripeStrings.unsubmitted = "unsubmitted".asInstanceOf[typings.stripe.stripeStrings.unsubmitted]
    
    @scala.inline
    def won: typings.stripe.stripeStrings.won = "won".asInstanceOf[typings.stripe.stripeStrings.won]
  }
}
