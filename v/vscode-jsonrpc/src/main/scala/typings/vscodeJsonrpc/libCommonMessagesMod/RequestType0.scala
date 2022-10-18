package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/common/messages", "RequestType0")
@js.native
open class RequestType0[R, E] protected () extends AbstractMessageSignature {
  def this(method: String) = this()
  
  /**
    * Clients must not use this property. It is here to ensure correct typing.
    */
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple3[R, E, _EM]] = js.native
}
