package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverTypes.mod.CodeLens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  
  /** @deprecated Use CodeLensRequest.type */
  val resultType: ProgressType[js.Array[CodeLens]] = js.native
  
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[CodeLens] | Null, 
    js.Array[CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
