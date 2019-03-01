package typings
package typedDashGithubDashApiLib.distWebDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookData extends js.Object {
  var action: java.lang.String
  var event: java.lang.String
  var id: java.lang.String
  var sender: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
}

object WebHookData {
  @scala.inline
  def apply(
    action: java.lang.String,
    event: java.lang.String,
    id: java.lang.String,
    sender: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  ): WebHookData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[WebHookData]
  }
}

