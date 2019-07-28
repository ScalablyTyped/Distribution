package typings.typedDashGithubDashApi.distWebDashHookMod

import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookData extends js.Object {
  var action: String
  var event: String
  var id: String
  var sender: UserSummary
}

object WebHookData {
  @scala.inline
  def apply(action: String, event: String, id: String, sender: UserSummary): WebHookData = {
    val __obj = js.Dynamic.literal(action = action, event = event, id = id, sender = sender)
  
    __obj.asInstanceOf[WebHookData]
  }
}

