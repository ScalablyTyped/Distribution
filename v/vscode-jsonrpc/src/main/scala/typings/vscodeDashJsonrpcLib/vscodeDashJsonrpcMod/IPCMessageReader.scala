package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends vscodeDashJsonrpcLib.libMessageReaderMod.IPCMessageReader {
  def this(process: nodeLib.NodeJSNs.Process) = this()
  def this(process: nodeLib.childUnderscoreProcessMod.ChildProcess) = this()
}

