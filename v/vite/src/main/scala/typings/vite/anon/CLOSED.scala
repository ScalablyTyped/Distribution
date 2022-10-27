package typings.vite.anon

import org.scalablytyped.runtime.Instantiable2
import typings.node.nodeColonstreamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.vite.mod.WebSocket2.ServerOptions
import typings.vite.mod.WebSocket2.WebSocket
import typings.vite.viteInts.`0`
import typings.vite.viteInts.`1`
import typings.vite.viteInts.`2`
import typings.vite.viteInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLOSED extends StObject {
  
  /** The connection is closed. */
  /* static member */
  val CLOSED: `3` = js.native
  
  /** The connection is in the process of closing. */
  /* static member */
  val CLOSING: `2` = js.native
  
  /** The connection is not yet open. */
  /* static member */
  val CONNECTING: `0` = js.native
  
  /** The connection is open and ready to communicate. */
  /* static member */
  val OPEN: `1` = js.native
  
  // WebSocket Server
  var Server: Instantiable2[
    /* options */ js.UndefOr[ServerOptions], 
    /* callback */ js.UndefOr[js.Function0[Unit]], 
    typings.vite.mod.WebSocket2.Server[WebSocket]
  ] = js.native
  
  // tslint:disable-line no-empty-interface
  // WebSocket stream
  def createWebSocketStream(websocket: WebSocket): Duplex = js.native
  def createWebSocketStream(websocket: WebSocket, options: DuplexOptions): Duplex = js.native
}
