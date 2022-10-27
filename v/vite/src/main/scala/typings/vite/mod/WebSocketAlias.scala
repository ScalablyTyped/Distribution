package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.vite.anon.CLOSED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebSocketAlias extends Shortcut {
  
  @JSImport("vite", "WebSocketAlias")
  @js.native
  val ^ : CLOSED & (Instantiable1[/* address */ Null, WebSocket2]) = js.native
  
  // WebSocket Server
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("vite", "WebSocketAlias.Server")
  @js.native
  open class Server[T /* <: typings.vite.mod.WebSocket2.WebSocket */] ()
    extends typings.vite.mod.WebSocket2.Server[T] {
    def this(options: typings.vite.mod.WebSocket2.ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: typings.vite.mod.WebSocket2.ServerOptions, callback: js.Function0[Unit]) = this()
  }
  
  type _To = CLOSED & (Instantiable1[/* address */ Null, WebSocket2])
  
  /* This means you don't have to write `^`, but can instead just say `WebSocketAlias.foo` */
  override def _to: CLOSED & (Instantiable1[/* address */ Null, WebSocket2]) = ^
}
