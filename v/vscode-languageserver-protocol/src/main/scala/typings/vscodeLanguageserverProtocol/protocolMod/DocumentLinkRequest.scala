package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  
  val method: textDocumentSlashdocumentLink = js.native
  
  /** @deprecated Use DocumentLinkRequest.type */
  val resultType: ProgressType[js.Array[DocumentLink]] = js.native
  
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[DocumentLink] | Null, 
    js.Array[DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
