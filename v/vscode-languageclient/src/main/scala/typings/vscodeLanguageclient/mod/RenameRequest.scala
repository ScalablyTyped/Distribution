package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typings.vscodeLanguageserverProtocol.protocolMod.RenameRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenameRequest {
  
  @JSImport("vscode-languageclient", "RenameRequest.method")
  @js.native
  val method: textDocumentSlashrename = js.native
  
  @JSImport("vscode-languageclient", "RenameRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    RenameParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}
