package typings
package xsocketsLib.XSocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XSockets.Events")
@js.native
object EventsNs extends js.Object {
  var close: java.lang.String = js.native
  var onBlob: java.lang.String = js.native
  var onError: java.lang.String = js.native
  var open: java.lang.String = js.native
  @JSName("bindings")
  @js.native
  object bindingsNs extends js.Object {
    var completed: java.lang.String = js.native
  }
  
  @JSName("pubSub")
  @js.native
  object pubSubNs extends js.Object {
    var subscribe: java.lang.String = js.native
    var unsubscribe: java.lang.String = js.native
  }
  
  @JSName("storage")
  @js.native
  object storageNs extends js.Object {
    var get: java.lang.String = js.native
    var getAll: java.lang.String = js.native
    var remove: java.lang.String = js.native
    var set: java.lang.String = js.native
  }
  
}

