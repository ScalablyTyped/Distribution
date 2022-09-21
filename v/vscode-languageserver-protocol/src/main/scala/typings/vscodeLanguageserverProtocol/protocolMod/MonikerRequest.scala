package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.Moniker
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.MonikerParams
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.MonikerRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashmoniker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonikerRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MonikerRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MonikerRequest.method")
  @js.native
  val method: textDocumentSlashmoniker = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MonikerRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    MonikerParams, 
    js.Array[Moniker] | Null, 
    js.Array[Moniker], 
    Unit, 
    MonikerRegistrationOptions
  ] = js.native
}
