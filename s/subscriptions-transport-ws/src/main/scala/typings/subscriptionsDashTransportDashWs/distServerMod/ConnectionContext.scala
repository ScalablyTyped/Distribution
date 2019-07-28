package typings.subscriptionsDashTransportDashWs.distServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[js.Promise[_]] = js.undefined
  var isLegacy: Boolean
  var operations: StringDictionary[ExecutionIterator]
  var request: IncomingMessage
  var socket: ^
}

object ConnectionContext {
  @scala.inline
  def apply(
    isLegacy: Boolean,
    operations: StringDictionary[ExecutionIterator],
    request: IncomingMessage,
    socket: ^,
    initPromise: js.Promise[_] = null
  ): ConnectionContext = {
    val __obj = js.Dynamic.literal(isLegacy = isLegacy, operations = operations, request = request, socket = socket)
    if (initPromise != null) __obj.updateDynamic("initPromise")(initPromise)
    __obj.asInstanceOf[ConnectionContext]
  }
}

