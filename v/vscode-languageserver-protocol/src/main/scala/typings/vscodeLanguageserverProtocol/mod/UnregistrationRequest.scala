package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.UnregistrationParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.clientSlashunregisterCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnregistrationRequest {
  
  @JSImport("vscode-languageserver-protocol", "UnregistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "UnregistrationRequest.method")
  @js.native
  val method: clientSlashunregisterCapability = js.native
  
  @JSImport("vscode-languageserver-protocol", "UnregistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[UnregistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
