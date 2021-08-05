package typings.vscodeJsonrpc

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketSupportMod {
  
  @JSImport("vscode-jsonrpc/lib/socketSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientSocketTransport(port: Double): js.Promise[SocketTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocketTransport]]
  inline def createClientSocketTransport(port: Double, encoding: BufferEncoding): js.Promise[SocketTransport] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SocketTransport]]
  
  inline def createServerSocketTransport(port: Double): js.Tuple2[MessageReader, MessageWriter] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[MessageReader, MessageWriter]]
  inline def createServerSocketTransport(port: Double, encoding: BufferEncoding): js.Tuple2[MessageReader, MessageWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[MessageReader, MessageWriter]]
  
  trait SocketTransport extends StObject {
    
    def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]]
  }
  object SocketTransport {
    
    inline def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): SocketTransport = {
      val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
      __obj.asInstanceOf[SocketTransport]
    }
    
    extension [Self <: SocketTransport](x: Self) {
      
      inline def setOnConnected(value: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): Self = StObject.set(x, "onConnected", js.Any.fromFunction0(value))
    }
  }
}
