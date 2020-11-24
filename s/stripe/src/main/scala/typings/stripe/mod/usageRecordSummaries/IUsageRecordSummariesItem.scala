package typings.stripe.mod.usageRecordSummaries

import typings.stripe.mod.invoices.IPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUsageRecordSummariesItem extends js.Object {
  
  var id: String = js.native
  
  var invoice: String = js.native
  
  var livemode: Boolean = js.native
  
  var `object`: String = js.native
  
  var period: IPeriod = js.native
  
  var subscription_item: String = js.native
  
  var total_usage: Double = js.native
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
  implicit class IUsageRecordSummariesItemOps[Self <: IUsageRecordSummariesItem] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: IPeriod): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_item(value: String): Self = this.set("subscription_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_usage(value: Double): Self = this.set("total_usage", value.asInstanceOf[js.Any])
  }
}
