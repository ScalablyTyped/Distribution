package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeLens
import typings.vscodeLanguageserverTypes.mod.CodeLens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensRequest.method")
  @js.native
  val method: textDocumentSlashcodeLens = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[CodeLens] | Null, 
    js.Array[CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
