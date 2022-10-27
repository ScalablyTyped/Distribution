package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.httpMod.ClientRequestArgs
import typings.node.nodeColonstreamMod.Duplex
import typings.node.nodeColonurlMod.URL
import typings.node.streamMod.DuplexOptions
import typings.vite.mod.WebSocket2.ClientOptions
import typings.vite.viteInts.`0`
import typings.vite.viteInts.`1`
import typings.vite.viteInts.`2`
import typings.vite.viteInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vite", "WebSocket")
@js.native
open class WebSocket protected () extends WebSocket2 {
  def this(address: String) = this()
  def this(address: Null) = this()
  def this(address: URL) = this()
  def this(address: String, options: ClientRequestArgs) = this()
  def this(address: String, options: ClientOptions) = this()
  def this(address: String, protocols: String) = this()
  def this(address: String, protocols: js.Array[String]) = this()
  def this(address: URL, options: ClientRequestArgs) = this()
  def this(address: URL, options: ClientOptions) = this()
  def this(address: URL, protocols: String) = this()
  def this(address: URL, protocols: js.Array[String]) = this()
  def this(address: String, protocols: String, options: ClientRequestArgs) = this()
  def this(address: String, protocols: String, options: ClientOptions) = this()
  def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
  def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
  def this(address: String, protocols: Unit, options: ClientRequestArgs) = this()
  def this(address: String, protocols: Unit, options: ClientOptions) = this()
  def this(address: URL, protocols: String, options: ClientRequestArgs) = this()
  def this(address: URL, protocols: String, options: ClientOptions) = this()
  def this(address: URL, protocols: js.Array[String], options: ClientRequestArgs) = this()
  def this(address: URL, protocols: js.Array[String], options: ClientOptions) = this()
  def this(address: URL, protocols: Unit, options: ClientRequestArgs) = this()
  def this(address: URL, protocols: Unit, options: ClientOptions) = this()
}
object WebSocket {
  
  @JSImport("vite", "WebSocket")
  @js.native
  val ^ : js.Any = js.native
  
  /** The connection is closed. */
  /* static member */
  @JSImport("vite", "WebSocket.CLOSED")
  @js.native
  val CLOSED: `3` = js.native
  
  /** The connection is in the process of closing. */
  /* static member */
  @JSImport("vite", "WebSocket.CLOSING")
  @js.native
  val CLOSING: `2` = js.native
  
  /** The connection is not yet open. */
  /* static member */
  @JSImport("vite", "WebSocket.CONNECTING")
  @js.native
  val CONNECTING: `0` = js.native
  
  /** The connection is open and ready to communicate. */
  /* static member */
  @JSImport("vite", "WebSocket.OPEN")
  @js.native
  val OPEN: `1` = js.native
  
  // WebSocket Server
  @JSImport("vite", "WebSocket.Server")
  @js.native
  open class Server[T /* <: typings.vite.mod.WebSocket2.WebSocket */] ()
    extends typings.vite.mod.WebSocket2.Server[T] {
    def this(options: typings.vite.mod.WebSocket2.ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: typings.vite.mod.WebSocket2.ServerOptions, callback: js.Function0[Unit]) = this()
  }
  
  /* was `typeof WebSocketAlias` */
  object WebSocket extends Shortcut {
    
    @JSImport("vite", "WebSocket.WebSocket")
    @js.native
    val ^ : typings.vite.anon.CLOSED & (Instantiable1[/* address */ Null, WebSocket2]) = js.native
    
    // WebSocket Server
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("vite", "WebSocket.WebSocket.Server")
    @js.native
    open class ServerCls[T /* <: typings.vite.mod.WebSocket2.WebSocket */] ()
      extends typings.vite.mod.WebSocket2.Server[T] {
      def this(options: typings.vite.mod.WebSocket2.ServerOptions) = this()
      def this(options: Unit, callback: js.Function0[Unit]) = this()
      def this(options: typings.vite.mod.WebSocket2.ServerOptions, callback: js.Function0[Unit]) = this()
    }
    
    type _To = typings.vite.anon.CLOSED & (Instantiable1[/* address */ Null, WebSocket2])
    
    /* This means you don't have to write `^`, but can instead just say `WebSocket.foo` */
    override def _to: typings.vite.anon.CLOSED & (Instantiable1[/* address */ Null, WebSocket2]) = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("vite", "WebSocket.WebSocket")
  @js.native
  open class WebSocketCls protected () extends WebSocket2 {
    def this(address: Null) = this()
  }
  
  // WebSocket Server
  /* was `typeof Server` */
  @JSImport("vite", "WebSocket.WebSocketServer")
  @js.native
  open class WebSocketServer[T /* <: typings.vite.mod.WebSocket2.WebSocket */] ()
    extends typings.vite.mod.WebSocket2.WebSocketServer[T] {
    def this(options: typings.vite.mod.WebSocket2.ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: typings.vite.mod.WebSocket2.ServerOptions, callback: js.Function0[Unit]) = this()
  }
  
  // tslint:disable-line no-empty-interface
  // WebSocket stream
  inline def createWebSocketStream(websocket: typings.vite.mod.WebSocket2.WebSocket): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def createWebSocketStream(websocket: typings.vite.mod.WebSocket2.WebSocket, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
}
