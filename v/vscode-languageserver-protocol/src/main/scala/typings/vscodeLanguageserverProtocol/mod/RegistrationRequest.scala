package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RegistrationParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.clientSlashregisterCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistrationRequest {
  
  @JSImport("vscode-languageserver-protocol", "RegistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "RegistrationRequest.method")
  @js.native
  val method: clientSlashregisterCapability = js.native
  
  @JSImport("vscode-languageserver-protocol", "RegistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[RegistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
