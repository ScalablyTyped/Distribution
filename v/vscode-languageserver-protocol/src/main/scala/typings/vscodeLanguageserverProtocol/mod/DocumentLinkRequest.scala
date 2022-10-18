package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.method")
  @js.native
  val method: textDocumentSlashdocumentLink = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
