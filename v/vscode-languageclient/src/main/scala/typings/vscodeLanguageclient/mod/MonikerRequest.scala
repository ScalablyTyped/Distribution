package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashmoniker
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.Moniker
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.MonikerParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotmonikerMod.MonikerRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonikerRequest {
  
  @JSImport("vscode-languageclient", "MonikerRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "MonikerRequest.method")
  @js.native
  val method: textDocumentSlashmoniker = js.native
  
  @JSImport("vscode-languageclient", "MonikerRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    MonikerParams, 
    js.Array[Moniker] | Null, 
    js.Array[Moniker], 
    Unit, 
    MonikerRegistrationOptions
  ] = js.native
}
