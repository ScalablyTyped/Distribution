package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile network operator notification trigger. */
@JSGlobal("Windows.ApplicationModel.Background.NetworkOperatorNotificationTrigger")
@js.native
class NetworkOperatorNotificationTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of a mobile network operator notification.
    * @param networkAccountId Specifies the unique identifier of the mobile broadband account.
    */
  def this(networkAccountId: java.lang.String) = this()
  /** Gets the account identifier for the mobile network operator notification trigger. */
  var networkAccountId: java.lang.String = js.native
}

