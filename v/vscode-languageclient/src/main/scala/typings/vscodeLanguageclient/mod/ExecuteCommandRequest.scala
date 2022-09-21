package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashexecuteCommand
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExecuteCommandRequest {
  
  @JSImport("vscode-languageclient", "ExecuteCommandRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ExecuteCommandRequest.method")
  @js.native
  val method: workspaceSlashexecuteCommand = js.native
  
  @JSImport("vscode-languageclient", "ExecuteCommandRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[ExecuteCommandParams, Any, scala.Nothing, Unit, ExecuteCommandRegistrationOptions] = js.native
}
