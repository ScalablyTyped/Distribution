package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends vscodeDashJsonrpcLib.libMessageWriterMod.IPCMessageWriter {
  def this(process: nodeLib.NodeJSNs.Process) = this()
  def this(process: nodeLib.childUnderscoreProcessMod.ChildProcess) = this()
}

