package typings.vndb

import org.scalablytyped.runtime.Shortcut
import typings.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vndb", JSImport.Namespace)
  @js.native
  val ^ : VNDB_ = js.native
  
  /**
    * Used for creating a connection to VNDB API
    */
  @js.native
  trait VNDB_ extends StObject {
    
    /**
      * Connects to the VNDB API.
      * Host and port are not required unless VNDB changes them.
      * @param host VNDB host address
      * @param port VNDB port
      */
    def start(): js.Promise[typings.vndb.mod.vndb] = js.native
    def start(host: js.UndefOr[scala.Nothing], port: Double): js.Promise[typings.vndb.mod.vndb] = js.native
    def start(host: String): js.Promise[typings.vndb.mod.vndb] = js.native
    def start(host: String, port: Double): js.Promise[typings.vndb.mod.vndb] = js.native
  }
  
  type _To = VNDB_
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VNDB_ = ^
  
  /**
    * Object containing the socket and methods to interact with it
    */
  @js.native
  trait vndb extends StObject {
    
    /**
      * Close the connection to the VNDB API
      */
    def end(): js.Promise[Unit] = js.native
    
    var socket: TLSSocket = js.native
    
    /**
      * Send a message to the VNDB API, according to https://vndb.org/d11
      * @param message message to send to the VNDB API
      */
    def write(message: String): js.Promise[String] = js.native
  }
  object vndb {
    
    @scala.inline
    def apply(end: () => js.Promise[Unit], socket: TLSSocket, write: String => js.Promise[String]): typings.vndb.mod.vndb = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), socket = socket.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[typings.vndb.mod.vndb]
    }
    
    @scala.inline
    implicit class vndbMutableBuilder[Self <: typings.vndb.mod.vndb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSocket(value: TLSSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: String => js.Promise[String]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
