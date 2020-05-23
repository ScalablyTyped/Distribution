package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that the endpoint for one app service sends to another app service. */
trait AppServiceRequest extends js.Object {
  /** Gets the message that request from the app service contains. */
  var message: ValueSet
  /**
    * Sends a response to a received request.
    * @param message The message that you want to include in the response.
    * @return An asynchronous operation to send the response.
    */
  def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus]
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
}

