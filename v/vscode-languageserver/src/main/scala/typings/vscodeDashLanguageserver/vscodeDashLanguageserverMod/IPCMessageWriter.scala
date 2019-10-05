package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.node.NodeJS.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

