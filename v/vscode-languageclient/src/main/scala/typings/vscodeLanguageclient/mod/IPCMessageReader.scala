package typings.vscodeLanguageclient.mod

import typings.node.NodeJS.Process
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeLanguageclient.clientMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

