package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.clientSlashregisterCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistrationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.method")
  @js.native
  val method: clientSlashregisterCapability = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RegistrationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[RegistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
