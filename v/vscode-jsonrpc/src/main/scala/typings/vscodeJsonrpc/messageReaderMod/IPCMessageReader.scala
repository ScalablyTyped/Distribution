package typings.vscodeJsonrpc.messageReaderMod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
  var process: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
}

