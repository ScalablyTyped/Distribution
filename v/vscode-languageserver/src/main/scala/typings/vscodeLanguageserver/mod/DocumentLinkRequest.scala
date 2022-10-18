package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkRequest {
  
  @JSImport("vscode-languageserver", "DocumentLinkRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DocumentLinkRequest.method")
  @js.native
  val method: textDocumentSlashdocumentLink = js.native
  
  @JSImport("vscode-languageserver", "DocumentLinkRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
