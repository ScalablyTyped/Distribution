package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoNumbers.`53101`
import typings.twilioVideo.twilioVideoStrings.`Room name is too long`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RoomNameTooLongError")
@js.native
class RoomNameTooLongError () extends TwilioError {
  
  @JSName("code")
  var code_RoomNameTooLongError: `53101` = js.native
  
  @JSName("message")
  var message_RoomNameTooLongError: `Room name is too long` = js.native
}
