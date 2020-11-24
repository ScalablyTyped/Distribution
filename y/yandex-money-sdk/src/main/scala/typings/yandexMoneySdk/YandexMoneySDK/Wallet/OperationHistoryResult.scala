package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import typings.yandexMoneySdk.anon.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationHistoryResult extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var next_record: js.UndefOr[String] = js.native
  
  var operations: js.UndefOr[js.Array[Amount]] = js.native
}
object OperationHistoryResult {
  
  @scala.inline
  def apply(): OperationHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationHistoryResult]
  }
  
  @scala.inline
  implicit class OperationHistoryResultOps[Self <: OperationHistoryResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNext_record(value: String): Self = this.set("next_record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_record: Self = this.set("next_record", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Amount*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[Amount]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
}
