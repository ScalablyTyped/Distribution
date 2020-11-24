package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  val resultType: ProgressType[js.Array[ColorInformation]] = js.native
  
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[ColorInformation], 
    js.Array[ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[DocumentColorParams, js.Array[ColorInformation], Unit]
}
