package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataRequest extends js.Object {
  
  var data: DataPackage = js.native
  
  var deadline: Date = js.native
  
  def failWithDisplayText(value: String): Unit = js.native
  
  def getDeferral(): DataRequestDeferral = js.native
}
object IDataRequest {
  
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IDataRequest]
  }
  
  @scala.inline
  implicit class IDataRequestOps[Self <: IDataRequest] (val x: Self) extends AnyVal {
    
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
    def setData(value: DataPackage): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailWithDisplayText(value: String => Unit): Self = this.set("failWithDisplayText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeferral(value: () => DataRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
