package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a web account provider trigger. */
trait WebAccountProviderTriggerDetails extends js.Object {
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation
}

object WebAccountProviderTriggerDetails {
  @scala.inline
  def apply(operation: IWebAccountProviderOperation): WebAccountProviderTriggerDetails = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderTriggerDetails]
  }
}

