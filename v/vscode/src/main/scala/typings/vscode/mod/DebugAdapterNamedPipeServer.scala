package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DebugAdapterNamedPipeServer")
@js.native
open class DebugAdapterNamedPipeServer protected ()
  extends StObject
     with DebugAdapterDescriptor {
  /**
  		 * Create a description for a debug adapter running as a Named Pipe (on Windows)/UNIX Domain Socket (on non-Windows) based server.
  		 */
  def this(path: String) = this()
  
  /**
  		 * The path to the NamedPipe/UNIX Domain Socket.
  		 */
  val path: String = js.native
}
