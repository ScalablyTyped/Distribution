package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashrename
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameRequest {
  
  @JSImport("vscode-languageserver", "RenameRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "RenameRequest.method")
  @js.native
  val method: textDocumentSlashrename = js.native
  
  @JSImport("vscode-languageserver", "RenameRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    RenameParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}
