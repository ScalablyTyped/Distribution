package typings.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[js.Promise[_]] = js.native
  var isLegacy: Boolean = js.native
  var operations: StringDictionary[ExecutionIterator] = js.native
  var request: IncomingMessage = js.native
  var socket: ^ = js.native
}

object ConnectionContext {
  @scala.inline
  def apply(
    isLegacy: Boolean,
    operations: StringDictionary[ExecutionIterator],
    request: IncomingMessage,
    socket: ^
  ): ConnectionContext = {
    val __obj = js.Dynamic.literal(isLegacy = isLegacy.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionContext]
  }
  @scala.inline
  implicit class ConnectionContextOps[Self <: ConnectionContext] (val x: Self) extends AnyVal {
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
    def setIsLegacy(value: Boolean): Self = this.set("isLegacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: StringDictionary[ExecutionIterator]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IncomingMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: ^): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitPromise(value: js.Promise[_]): Self = this.set("initPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitPromise: Self = this.set("initPromise", js.undefined)
  }
  
}

