package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/connection", "ConnectionError")
@js.native
open class ConnectionError protected ()
  extends StObject
     with Error {
  def this(code: ConnectionErrors, message: String) = this()
  
  val code: ConnectionErrors = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
