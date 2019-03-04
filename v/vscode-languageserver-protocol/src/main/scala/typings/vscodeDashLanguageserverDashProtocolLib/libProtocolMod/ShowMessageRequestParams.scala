package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowMessageRequestParams extends js.Object {
  /**
    * The message action items to present.
    */
  var actions: js.UndefOr[js.Array[MessageActionItem]] = js.undefined
  /**
    * The actual message
    */
  var message: java.lang.String
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}

object ShowMessageRequestParams {
  @scala.inline
  def apply(message: java.lang.String, `type`: MessageType, actions: js.Array[MessageActionItem] = null): ShowMessageRequestParams = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    __obj.asInstanceOf[ShowMessageRequestParams]
  }
}

