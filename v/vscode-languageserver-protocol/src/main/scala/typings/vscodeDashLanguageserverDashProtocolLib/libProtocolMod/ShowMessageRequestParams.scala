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

