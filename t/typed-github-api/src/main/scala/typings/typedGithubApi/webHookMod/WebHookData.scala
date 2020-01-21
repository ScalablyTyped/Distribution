package typings.typedGithubApi.webHookMod

import typings.typedGithubApi.interfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebHookData]
  }
}

