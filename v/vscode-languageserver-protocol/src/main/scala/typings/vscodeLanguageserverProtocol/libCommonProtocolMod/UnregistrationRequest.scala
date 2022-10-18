package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.clientSlashunregisterCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnregistrationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "UnregistrationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "UnregistrationRequest.method")
  @js.native
  val method: clientSlashunregisterCapability = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "UnregistrationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[UnregistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
