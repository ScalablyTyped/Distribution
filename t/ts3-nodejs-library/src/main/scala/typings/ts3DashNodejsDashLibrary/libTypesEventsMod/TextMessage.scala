package typings.ts3DashNodejsDashLibrary.libTypesEventsMod

import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessage extends js.Object {
  var invoker: TeamSpeakClient
  var msg: String
  var targetmode: TextMessageTargetMode
}

object TextMessage {
  @scala.inline
  def apply(invoker: TeamSpeakClient, msg: String, targetmode: TextMessageTargetMode): TextMessage = {
    val __obj = js.Dynamic.literal(invoker = invoker, msg = msg, targetmode = targetmode)
  
    __obj.asInstanceOf[TextMessage]
  }
}

