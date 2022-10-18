package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.Moniker
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.MonikerParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.MonikerRegistrationOptions
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
