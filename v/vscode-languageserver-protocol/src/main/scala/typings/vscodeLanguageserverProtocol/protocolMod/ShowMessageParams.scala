package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowMessageParams extends js.Object {
  /**
    * The actual message
    */
  var message: String
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}

object ShowMessageParams {
  @scala.inline
  def apply(message: String, `type`: MessageType): ShowMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageParams]
  }
}

