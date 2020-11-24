package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a message that the endpoint for one app service sends to another app service. */
@js.native
trait AppServiceRequest extends js.Object {
  
  /** Gets the message that request from the app service contains. */
  var message: ValueSet = js.native
  
  /**
    * Sends a response to a received request.
    * @param message The message that you want to include in the response.
    * @return An asynchronous operation to send the response.
    */
  def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
}
object AppServiceRequest {
  
  @scala.inline
  def apply(
    message: ValueSet,
    sendResponseAsync: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]
  ): AppServiceRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sendResponseAsync = js.Any.fromFunction1(sendResponseAsync))
    __obj.asInstanceOf[AppServiceRequest]
  }
  
  @scala.inline
  implicit class AppServiceRequestOps[Self <: AppServiceRequest] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: ValueSet): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendResponseAsync(value: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]): Self = this.set("sendResponseAsync", js.Any.fromFunction1(value))
  }
}
