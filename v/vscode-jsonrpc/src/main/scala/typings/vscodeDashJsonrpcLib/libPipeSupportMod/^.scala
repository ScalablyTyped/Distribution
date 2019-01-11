package typings
package vscodeDashJsonrpcLib.libPipeSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/pipeSupport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientPipeTransport(pipeName: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def generateRandomPipeName(): java.lang.String = js.native
}

