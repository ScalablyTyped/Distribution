package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DebugAdapterNamedPipeServer")
@js.native
class DebugAdapterNamedPipeServer protected () extends DebugAdapterDescriptor {
  /**
    * Create a description for a debug adapter running as a socket based server.
    */
  def this(path: String) = this()
  
  /**
    * The path to the NamedPipe/UNIX Domain Socket.
    */
  val path: String = js.native
}
