package typings.vscodeJsonrpc

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeSupportMod {
  
  @JSImport("vscode-jsonrpc/lib/pipeSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientPipeTransport(pipeName: String): js.Promise[PipeTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PipeTransport]]
  inline def createClientPipeTransport(pipeName: String, encoding: BufferEncoding): js.Promise[PipeTransport] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PipeTransport]]
  
  inline def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[MessageReader, MessageWriter]]
  inline def createServerPipeTransport(pipeName: String, encoding: BufferEncoding): js.Tuple2[MessageReader, MessageWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[MessageReader, MessageWriter]]
  
  inline def generateRandomPipeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[String]
  
  trait PipeTransport extends StObject {
    
    def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]]
  }
  object PipeTransport {
    
    inline def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): PipeTransport = {
      val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
      __obj.asInstanceOf[PipeTransport]
    }
    
    extension [Self <: PipeTransport](x: Self) {
      
      inline def setOnConnected(value: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): Self = StObject.set(x, "onConnected", js.Any.fromFunction0(value))
    }
  }
}
