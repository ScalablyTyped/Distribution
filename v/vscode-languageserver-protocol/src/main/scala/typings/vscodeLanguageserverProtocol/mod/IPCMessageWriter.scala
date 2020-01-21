package typings.vscodeLanguageserverProtocol.mod

import typings.node.NodeJS.Process
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeJsonrpc.mod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

