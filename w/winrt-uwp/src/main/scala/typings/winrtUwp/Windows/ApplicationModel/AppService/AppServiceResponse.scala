package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the message that the app service sent in response to a request. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponse")
@js.native
abstract class AppServiceResponse () extends js.Object {
  /** Gets the message that the response from the app service contains. */
  var message: ValueSet = js.native
  /** Gets the status for the response from the app service. */
  var status: AppServiceResponseStatus = js.native
}

