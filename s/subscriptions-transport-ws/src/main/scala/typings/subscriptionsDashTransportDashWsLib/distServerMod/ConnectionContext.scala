package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[js.Promise[_]] = js.undefined
  var isLegacy: scala.Boolean
  var operations: org.scalablytyped.runtime.StringDictionary[ExecutionIterator]
  var request: nodeLib.httpMod.IncomingMessage
  var socket: wsLib.wsMod.^
}

object ConnectionContext {
  @scala.inline
  def apply(
    isLegacy: scala.Boolean,
    operations: org.scalablytyped.runtime.StringDictionary[ExecutionIterator],
    request: nodeLib.httpMod.IncomingMessage,
    socket: wsLib.wsMod.^,
    initPromise: js.Promise[_] = null
  ): ConnectionContext = {
    val __obj = js.Dynamic.literal(isLegacy = isLegacy, operations = operations, request = request, socket = socket)
    if (initPromise != null) __obj.updateDynamic("initPromise")(initPromise)
    __obj.asInstanceOf[ConnectionContext]
  }
}

