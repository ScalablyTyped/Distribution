package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationHistoryOptions extends js.Object {
  
  var details: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[String | Date] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var records: js.UndefOr[Double] = js.native
  
  var start_record: js.UndefOr[String] = js.native
  
  var till: js.UndefOr[String | Date] = js.native
  
  var `type`: String = js.native
}
object OperationHistoryOptions {
  
  @scala.inline
  def apply(`type`: String): OperationHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHistoryOptions]
  }
  
  @scala.inline
  implicit class OperationHistoryOptionsOps[Self <: OperationHistoryOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Boolean): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Date): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRecords(value: Double): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    
    @scala.inline
    def setStart_record(value: String): Self = this.set("start_record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_record: Self = this.set("start_record", js.undefined)
    
    @scala.inline
    def setTill(value: String | Date): Self = this.set("till", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTill: Self = this.set("till", js.undefined)
  }
}
