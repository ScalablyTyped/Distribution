package typings.vscodeLanguageclient.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeLanguageclient.clientMod.IPCMessageWriter {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

