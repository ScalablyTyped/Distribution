package typings.vscodeJsonrpc.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeJsonrpc.messageReaderMod.IPCMessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

