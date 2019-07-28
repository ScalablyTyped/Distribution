package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.node.NodeJSNs.Process
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typings.vscodeDashLanguageclient.libClientMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

