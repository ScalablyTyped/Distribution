package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the message that the app service sent in response to a request. */
trait AppServiceResponse extends js.Object {
  /** Gets the message that the response from the app service contains. */
  var message: ValueSet
  /** Gets the status for the response from the app service. */
  var status: AppServiceResponseStatus
}

object AppServiceResponse {
  @scala.inline
  def apply(message: ValueSet, status: AppServiceResponseStatus): AppServiceResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceResponse]
  }
}

