package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.clientSlashunregisterCapability
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.UnregistrationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnregistrationRequest {
  
  @JSImport("vscode-languageserver", "UnregistrationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "UnregistrationRequest.method")
  @js.native
  val method: clientSlashunregisterCapability = js.native
  
  @JSImport("vscode-languageserver", "UnregistrationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[UnregistrationParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
