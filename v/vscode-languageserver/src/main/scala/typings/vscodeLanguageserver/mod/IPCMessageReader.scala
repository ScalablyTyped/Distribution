package typings.vscodeLanguageserver.mod

import typings.node.NodeJS.Process
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeLanguageserverProtocol.mod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

