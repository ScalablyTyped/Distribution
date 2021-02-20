package typings.vscodeJsonrpc

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeSupportMod {
  
  @JSImport("vscode-jsonrpc/lib/pipeSupport", "createClientPipeTransport")
  @js.native
  def createClientPipeTransport(pipeName: String): js.Promise[PipeTransport] = js.native
  @JSImport("vscode-jsonrpc/lib/pipeSupport", "createClientPipeTransport")
  @js.native
  def createClientPipeTransport(pipeName: String, encoding: BufferEncoding): js.Promise[PipeTransport] = js.native
  
  @JSImport("vscode-jsonrpc/lib/pipeSupport", "createServerPipeTransport")
  @js.native
  def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  @JSImport("vscode-jsonrpc/lib/pipeSupport", "createServerPipeTransport")
  @js.native
  def createServerPipeTransport(pipeName: String, encoding: BufferEncoding): js.Tuple2[MessageReader, MessageWriter] = js.native
  
  @JSImport("vscode-jsonrpc/lib/pipeSupport", "generateRandomPipeName")
  @js.native
  def generateRandomPipeName(): String = js.native
  
  @js.native
  trait PipeTransport extends StObject {
    
    def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]] = js.native
  }
  object PipeTransport {
    
    @scala.inline
    def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): PipeTransport = {
      val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
      __obj.asInstanceOf[PipeTransport]
    }
    
    @scala.inline
    implicit class PipeTransportMutableBuilder[Self <: PipeTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnConnected(value: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): Self = StObject.set(x, "onConnected", js.Any.fromFunction0(value))
    }
  }
}
