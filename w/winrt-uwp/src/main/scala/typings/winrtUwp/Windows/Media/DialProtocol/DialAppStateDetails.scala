package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the state of the DIAL app. */
trait DialAppStateDetails extends js.Object {
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: String
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState
}

object DialAppStateDetails {
  @scala.inline
  def apply(fullXml: String, state: DialAppState): DialAppStateDetails = {
    val __obj = js.Dynamic.literal(fullXml = fullXml.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialAppStateDetails]
  }
}

