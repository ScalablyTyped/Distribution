package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", JSImport.Namespace)
@js.native
object vscodeDashLanguageserverDashProtocolModMembers extends js.Object {
  val EOL: js.Array[java.lang.String] = js.native
  def createClientPipeTransport(pipeName: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientSocketTransport(port: scala.Double): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createClientSocketTransport(port: scala.Double, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger
  ): ProtocolConnection = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): ProtocolConnection = js.native
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def generateRandomPipeName(): java.lang.String = js.native
}

