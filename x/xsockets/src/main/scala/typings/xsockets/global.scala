package typings.xsockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object XSockets extends js.Object {
    @js.native
    class WebSocket protected ()
      extends typings.xsockets.XSockets.WebSocket {
      def this(url: String) = this()
      def this(url: String, subprotocol: String) = this()
      def this(url: String, subprotocol: String, settings: js.Any) = this()
    }
    
    @js.native
    object Events extends js.Object {
      var close: String = js.native
      var onBlob: String = js.native
      var onError: String = js.native
      var open: String = js.native
      @js.native
      object bindings extends js.Object {
        var completed: String = js.native
      }
      
      @js.native
      object pubSub extends js.Object {
        var subscribe: String = js.native
        var unsubscribe: String = js.native
      }
      
      @js.native
      object storage extends js.Object {
        var get: String = js.native
        var getAll: String = js.native
        var remove: String = js.native
        var set: String = js.native
      }
      
    }
    
  }
  
}

