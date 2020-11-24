package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DebugAdapterServer")
@js.native
class DebugAdapterServer protected () extends DebugAdapterDescriptor {
  /**
    * Create a description for a debug adapter running as a socket based server.
    */
  def this(port: Double) = this()
  def this(port: Double, host: String) = this()
  
  /**
    * The host.
    */
  val host: js.UndefOr[String] = js.native
  
  /**
    * The port.
    */
  val port: Double = js.native
}
