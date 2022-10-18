package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameRequest {
  
  @JSImport("vscode-languageclient", "RenameRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "RenameRequest.method")
  @js.native
  val method: textDocumentSlashrename = js.native
  
  @JSImport("vscode-languageclient", "RenameRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    RenameParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}
