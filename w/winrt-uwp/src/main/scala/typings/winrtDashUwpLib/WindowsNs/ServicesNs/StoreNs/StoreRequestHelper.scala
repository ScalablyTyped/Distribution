package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a helper method that can be used to send requests to the Windows Store for operations that do not yet have a corresponding API available in the Windows SDK. */
@JSGlobal("Windows.Services.Store.StoreRequestHelper")
@js.native
abstract class StoreRequestHelper () extends js.Object

/* static members */
@JSGlobal("Windows.Services.Store.StoreRequestHelper")
@js.native
object StoreRequestHelper extends js.Object {
  /**
    * Sends the specified request to the Windows Store with the provided context and parameters.
    * @param context An object that specifies the user for which to perform the operation. If your app is a single-user app (that is, it runs only in the context of the user that launched the app), use the StoreContext.GetDefault method to get a StoreContext object that you can use to send a request that operates in the context of the user. If your app is a multi-user app, use the StoreContext.GetForUser method to get a StoreContext object that you can use to send a request that operates in the context of a specific user.
    * @param requestKind A value that identifies the request that you want to send to the Windows Store.
    * @param parametersAsJson A JSON-formatted string that contains the arguments to pass to the request.
    * @return An asynchronous operation that, on successful completion, returns a StoreSendRequestResult object that provides status and error info about the request.
    */
  def sendRequestAsync(
    context: winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreContext,
    requestKind: scala.Double,
    parametersAsJson: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreSendRequestResult] = js.native
}

