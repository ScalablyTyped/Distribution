package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowMessageParams extends js.Object {
  /**
    * The actual message
    */
  var message: java.lang.String
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}

object ShowMessageParams {
  @scala.inline
  def apply(message: java.lang.String, `type`: MessageType): ShowMessageParams = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShowMessageParams]
  }
}

