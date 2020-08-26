package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
@js.native
trait VoiceCommandResponse extends js.Object {
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String = js.native
  /** The initial message that is spoken by Cortana and shown on the Cortana canvas. */
  var message: VoiceCommandUserMessage = js.native
  /** The secondary message (for disambiguation and confirmation screens only) that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood. */
  var repeatMessage: VoiceCommandUserMessage = js.native
  /** The collection of assets, containing image and text data, provided by the background app service for display on the Cortana canvas. */
  var voiceCommandContentTiles: IVector[VoiceCommandContentTile] = js.native
}

object VoiceCommandResponse {
  @scala.inline
  def apply(
    appLaunchArgument: String,
    message: VoiceCommandUserMessage,
    repeatMessage: VoiceCommandUserMessage,
    voiceCommandContentTiles: IVector[VoiceCommandContentTile]
  ): VoiceCommandResponse = {
    val __obj = js.Dynamic.literal(appLaunchArgument = appLaunchArgument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeatMessage = repeatMessage.asInstanceOf[js.Any], voiceCommandContentTiles = voiceCommandContentTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandResponse]
  }
  @scala.inline
  implicit class VoiceCommandResponseOps[Self <: VoiceCommandResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppLaunchArgument(value: String): Self = this.set("appLaunchArgument", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: VoiceCommandUserMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatMessage(value: VoiceCommandUserMessage): Self = this.set("repeatMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceCommandContentTiles(value: IVector[VoiceCommandContentTile]): Self = this.set("voiceCommandContentTiles", value.asInstanceOf[js.Any])
  }
  
}

