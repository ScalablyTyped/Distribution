package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangeNotifications extends js.Object {
  /**
    * Whether the server wants to receive workspace folder
    * change notifications.
    *
    * If a strings is provided the string is treated as a ID
    * under which the notification is registed on the client
    * side. The ID can be used to unregister for these events
    * using the `client/unregisterCapability` request.
    */
  var changeNotifications: js.UndefOr[String | Boolean] = js.undefined
  /**
    * The Server has support for workspace folders
    */
  var supported: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChangeNotifications {
  @scala.inline
  def apply(changeNotifications: String | Boolean = null, supported: js.UndefOr[Boolean] = js.undefined): Anon_ChangeNotifications = {
    val __obj = js.Dynamic.literal()
    if (changeNotifications != null) __obj.updateDynamic("changeNotifications")(changeNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(supported)) __obj.updateDynamic("supported")(supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChangeNotifications]
  }
}

