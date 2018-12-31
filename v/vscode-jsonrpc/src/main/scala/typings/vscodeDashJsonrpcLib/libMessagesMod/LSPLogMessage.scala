package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LSPLogMessage extends js.Object {
  var message: RequestMessage | ResponseMessage | NotificationMessage
  var timestamp: scala.Double
  var `type`: LSPMessageType
}

