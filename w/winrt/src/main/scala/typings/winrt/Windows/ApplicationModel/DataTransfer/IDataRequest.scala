package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataRequest extends StObject {
  
  var data: DataPackage
  
  var deadline: Date
  
  def failWithDisplayText(value: String): Unit
  
  def getDeferral(): DataRequestDeferral
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
  implicit class IDataRequestMutableBuilder[Self <: IDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataPackage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailWithDisplayText(value: String => Unit): Self = StObject.set(x, "failWithDisplayText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeferral(value: () => DataRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
