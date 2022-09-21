package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.clientSlashunregisterCapability
import typings.vscodeLanguageserverProtocol.protocolMod.UnregistrationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnregistrationRequest {
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.method")
  @js.native
  val method: clientSlashunregisterCapability = js.native
  
  @JSImport("vscode-languageclient", "UnregistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[UnregistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
