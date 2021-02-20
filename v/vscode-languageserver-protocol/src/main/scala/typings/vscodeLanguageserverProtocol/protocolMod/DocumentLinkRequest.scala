package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest.method")
  @js.native
  val method: textDocumentSlashdocumentLink = js.native
  
  /** @deprecated Use DocumentLinkRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[DocumentLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[DocumentLink] | Null, 
    js.Array[DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
