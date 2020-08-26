package typings.vscodeLanguageserver.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeLanguageserverProtocol.mod.IPCMessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

