package typings.vscodeJsonrpc.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "ConnectionError")
@js.native
class ConnectionError protected ()
  extends StObject
     with Error {
  def this(code: ConnectionErrors, message: String) = this()
  
  val code: ConnectionErrors = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
