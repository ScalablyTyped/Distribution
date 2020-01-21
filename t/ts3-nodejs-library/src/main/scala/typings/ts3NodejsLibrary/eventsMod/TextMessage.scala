package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode
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
    val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], targetmode = targetmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextMessage]
  }
}

