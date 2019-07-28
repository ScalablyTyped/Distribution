package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJSNs.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeDashJsonrpc.libMessageReaderMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

