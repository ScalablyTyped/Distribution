package typings.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def EOL: js.Array[java.lang.String] = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.mod.Executable
    - typings.vscodeLanguageclient.anon.Debug
    - typings.vscodeLanguageclient.anon.Run
    - typings.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  js.Promise[
    typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typings.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    js.Promise[
      typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
  
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  @scala.inline
  def createClientPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
  
  @scala.inline
  def createClientSocketTransport(port: scala.Double): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  @scala.inline
  def createClientSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
  
  @scala.inline
  def createProtocolConnection(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typings.vscodeJsonrpc.mod.Logger
  ): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  @scala.inline
  def createProtocolConnection(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: typings.vscodeJsonrpc.mod.Logger,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]
  
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  @scala.inline
  def createServerSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = (typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ]]
  
  @scala.inline
  def generateRandomPipeName(): java.lang.String = typings.vscodeLanguageclient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]
}
