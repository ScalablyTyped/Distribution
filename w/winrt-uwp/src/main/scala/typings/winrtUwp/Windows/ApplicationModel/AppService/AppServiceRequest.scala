package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that the endpoint for one app service sends to another app service. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceRequest")
@js.native
abstract class AppServiceRequest () extends js.Object {
  /** Gets the message that request from the app service contains. */
  var message: ValueSet = js.native
  /**
    * Sends a response to a received request.
    * @param message The message that you want to include in the response.
    * @return An asynchronous operation to send the response.
    */
  def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
}

