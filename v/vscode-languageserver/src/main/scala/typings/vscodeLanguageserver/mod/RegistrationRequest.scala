package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.clientSlashregisterCapability
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.RegistrationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistrationRequest {
  
  @JSImport("vscode-languageserver", "RegistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "RegistrationRequest.method")
  @js.native
  val method: clientSlashregisterCapability = js.native
  
  @JSImport("vscode-languageserver", "RegistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[RegistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
