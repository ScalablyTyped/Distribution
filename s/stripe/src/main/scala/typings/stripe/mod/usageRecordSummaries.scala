package typings.stripe.mod

import typings.stripe.mod.invoices.IPeriod
import typings.stripe.stripeStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageRecordSummaries {
  
  /**
    * A object with a data property that contains an array of up to limit summaries,
    * starting after summary starting_after. Each entry in the array is a separate summary object.
    * If no more summaries are available, the resulting array is empty.
    */
  trait IUsageRecordSummaries
    extends StObject
       with IList[IUsageRecordSummariesItem] {
    
    @JSName("object")
    var object_IUsageRecordSummaries: list
  }
  object IUsageRecordSummaries {
    
    @scala.inline
    def apply(data: js.Array[IUsageRecordSummariesItem], has_more: Boolean, url: String): IUsageRecordSummaries = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("list")
      __obj.asInstanceOf[IUsageRecordSummaries]
    }
    
    @scala.inline
    implicit class IUsageRecordSummariesMutableBuilder[Self <: IUsageRecordSummaries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: list): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUsageRecordSummariesItem extends StObject {
    
    var id: String
    
    var invoice: String
    
    var livemode: Boolean
    
    var `object`: String
    
    var period: IPeriod
    
    var subscription_item: String
    
    var total_usage: Double
  }
  object IUsageRecordSummariesItem {
    
    @scala.inline
    def apply(
      id: String,
      invoice: String,
      livemode: Boolean,
      `object`: String,
      period: IPeriod,
      subscription_item: String,
      total_usage: Double
    ): IUsageRecordSummariesItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUsageRecordSummariesItem]
    }
    
    @scala.inline
    implicit class IUsageRecordSummariesItemMutableBuilder[Self <: IUsageRecordSummariesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: IPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription_item(value: String): Self = StObject.set(x, "subscription_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_usage(value: Double): Self = StObject.set(x, "total_usage", value.asInstanceOf[js.Any])
    }
  }
}
