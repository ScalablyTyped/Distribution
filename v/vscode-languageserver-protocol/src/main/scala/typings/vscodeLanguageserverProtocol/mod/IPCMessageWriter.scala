package typings.vscodeLanguageserverProtocol.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeJsonrpc.mod.IPCMessageWriter {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

