package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.ServerResponse
import typings.node.netMod.DropArgument
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Duplex
import typings.std.InstanceType
import typings.std.Set
import typings.vite.anon.FnCall
import typings.vite.anon.FnCallEventNameListener
import typings.vite.viteStrings.checkContinue
import typings.vite.viteStrings.checkExpectation
import typings.vite.viteStrings.clientError
import typings.vite.viteStrings.close
import typings.vite.viteStrings.connect
import typings.vite.viteStrings.connection
import typings.vite.viteStrings.drop
import typings.vite.viteStrings.dropRequest
import typings.vite.viteStrings.error
import typings.vite.viteStrings.listening
import typings.vite.viteStrings.request
import typings.vite.viteStrings.upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketServer extends StObject {
  
  /**
    * Get all connected clients.
    */
  var clients: Set[WebSocketClient] = js.native
  
  /**
    * Disconnect all clients and terminate the server.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Listen on port and host
    */
  def listen(): Unit = js.native
  
  /**
    * Unregister event listener.
    */
  def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Unregister event listener.
    */
  def off(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Unregister event listener.
    */
  def off(event: String, listener: js.Function): Unit = js.native
  /**
    * Unregister event listener.
    */
  @JSName("off")
  var off_Original: FnCallEventNameListener & (js.Function2[/* event */ String, /* listener */ js.Function, Unit]) = js.native
  
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  def on(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  def on[T /* <: String */](
    event: T,
    listener: WebSocketCustomListener[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InferCustomEventPayload<T> */ Any
    ]
  ): Unit = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  var on_Original: FnCall & (js.Function2[
    /* event */ String, 
    /* listener */ WebSocketCustomListener[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InferCustomEventPayload<T> */ Any
    ], 
    Unit
  ]) = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_checkContinue(
    event: checkContinue,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_checkExpectation(
    event: checkExpectation,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_clientError(event: clientError, listener: js.Function2[/* err */ js.Error, /* socket */ Duplex, Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_connect(
    event: connect,
    listener: js.Function3[
      /* req */ InstanceType[Instantiable1[/* socket */ Socket, IncomingMessage]], 
      /* socket */ Duplex, 
      /* head */ Buffer, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_connection(
    event: connection,
    listener: js.Function1[(/* socket */ typings.node.netMod.Socket) | (/* socket */ Socket), Unit]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_drop(event: drop, listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_dropRequest(
    event: dropRequest,
    listener: js.Function2[
      /* req */ InstanceType[Instantiable1[/* socket */ Socket, IncomingMessage]], 
      /* socket */ Duplex, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_request(
    event: request,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  /**
    * Handle custom event emitted by `import.meta.hot.send`
    */
  @JSName("on")
  def on_upgrade(
    event: upgrade,
    listener: js.Function3[
      /* req */ InstanceType[Instantiable1[/* socket */ Socket, IncomingMessage]], 
      /* socket */ Duplex, 
      /* head */ Buffer, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Broadcast events to all clients
    */
  def send(
    payload: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HMRPayload */ Any
  ): Unit = js.native
  def send[T /* <: String */](
    event: T,
    payload: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InferCustomEventPayload<T> */ Any
  ): Unit = js.native
  /**
    * Send custom event
    */
  @JSName("send")
  def send_T[T /* <: String */](event: T): Unit = js.native
}
