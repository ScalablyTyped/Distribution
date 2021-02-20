package typings.stripe.mod

import typings.stripe.stripeStrings.usage_record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageRecords {
  
  @js.native
  trait IUsageRecord extends IObject {
    
    var id: String = js.native
    
    var livemode: Boolean = js.native
    
    @JSName("object")
    var object_IUsageRecord: usage_record = js.native
    
    var quantity: Double = js.native
    
    var subscription_item: String = js.native
    
    var timestamp: Double = js.native
  }
  object IUsageRecord {
    
    @scala.inline
    def apply(
      id: String,
      livemode: Boolean,
      `object`: usage_record,
      quantity: Double,
      subscription_item: String,
      timestamp: Double
    ): IUsageRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUsageRecord]
    }
    
    @scala.inline
    implicit class IUsageRecordMutableBuilder[Self <: IUsageRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: usage_record): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription_item(value: String): Self = StObject.set(x, "subscription_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.increment
    - typings.stripe.stripeStrings.set
  */
  trait IUsageRecordAction extends StObject
  object IUsageRecordAction {
    
    @scala.inline
    def increment: typings.stripe.stripeStrings.increment = "increment".asInstanceOf[typings.stripe.stripeStrings.increment]
    
    @scala.inline
    def set: typings.stripe.stripeStrings.set = "set".asInstanceOf[typings.stripe.stripeStrings.set]
  }
  
  @js.native
  trait IUsageRecordCreationOptions extends StObject {
    
    /**
      * Valid values are increment (default) or set. When using increment the specified quantity will be added to the usage at the specified
      * timestamp. The set action will overwrite the usage quantity at that timestamp.
      */
    var action: js.UndefOr[IUsageRecordAction] = js.native
    
    /**
      * The usage quantity for the specified timestamp
      */
    var quantity: Double = js.native
    
    /**
      * The timestamp for the usage event. This timestamp must be within the current billing period of the subscription of the provided subscription_item
      */
    var timestamp: Double = js.native
  }
  object IUsageRecordCreationOptions {
    
    @scala.inline
    def apply(quantity: Double, timestamp: Double): IUsageRecordCreationOptions = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUsageRecordCreationOptions]
    }
    
    @scala.inline
    implicit class IUsageRecordCreationOptionsMutableBuilder[Self <: IUsageRecordCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IUsageRecordAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
