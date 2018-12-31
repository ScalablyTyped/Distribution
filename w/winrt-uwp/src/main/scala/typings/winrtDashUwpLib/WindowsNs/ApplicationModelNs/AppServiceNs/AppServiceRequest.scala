package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message that the endpoint for one app service sends to another app service. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceRequest")
@js.native
abstract class AppServiceRequest () extends js.Object {
  /** Gets the message that request from the app service contains. */
  var message: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /**
    * Sends a response to a received request.
    * @param message The message that you want to include in the response.
    * @return An asynchronous operation to send the response.
    */
  def sendResponseAsync(message: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
}

