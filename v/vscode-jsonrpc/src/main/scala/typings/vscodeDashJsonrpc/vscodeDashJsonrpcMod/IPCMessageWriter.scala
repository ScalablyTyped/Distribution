package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJS.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeDashJsonrpc.libMessageWriterMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

