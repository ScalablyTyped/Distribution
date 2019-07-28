package typings.xsockets.XSocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XSockets.Events")
@js.native
object EventsNs extends js.Object {
  var close: String = js.native
  var onBlob: String = js.native
  var onError: String = js.native
  var open: String = js.native
  @JSName("bindings")
  @js.native
  object bindingsNs extends js.Object {
    var completed: String = js.native
  }
  
  @JSName("pubSub")
  @js.native
  object pubSubNs extends js.Object {
    var subscribe: String = js.native
    var unsubscribe: String = js.native
  }
  
  @JSName("storage")
  @js.native
  object storageNs extends js.Object {
    var get: String = js.native
    var getAll: String = js.native
    var remove: String = js.native
    var set: String = js.native
  }
  
}

