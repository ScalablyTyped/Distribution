package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.clientSlashregisterCapability
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RegistrationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistrationRequest {
  
  @JSImport("vscode-languageclient", "RegistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "RegistrationRequest.method")
  @js.native
  val method: clientSlashregisterCapability = js.native
  
  @JSImport("vscode-languageclient", "RegistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[RegistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
