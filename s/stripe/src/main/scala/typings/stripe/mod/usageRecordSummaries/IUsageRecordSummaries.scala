package typings.stripe.mod.usageRecordSummaries

import typings.stripe.mod.IList
import typings.stripe.stripeStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A object with a data property that contains an array of up to limit summaries,
  * starting after summary starting_after. Each entry in the array is a separate summary object.
  * If no more summaries are available, the resulting array is empty.
  */
@js.native
trait IUsageRecordSummaries extends IList[IUsageRecordSummariesItem] {
  @JSName("object")
  var object_IUsageRecordSummaries: list = js.native
}

object IUsageRecordSummaries {
  @scala.inline
  def apply(data: js.Array[IUsageRecordSummariesItem], has_more: Boolean, `object`: list, url: String): IUsageRecordSummaries = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordSummaries]
  }
  @scala.inline
  implicit class IUsageRecordSummariesOps[Self <: IUsageRecordSummaries] (val x: Self) extends AnyVal {
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
    def setObject(value: list): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

