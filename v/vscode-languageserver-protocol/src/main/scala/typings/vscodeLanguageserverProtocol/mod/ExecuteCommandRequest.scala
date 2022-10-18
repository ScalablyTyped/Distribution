package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ExecuteCommandParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ExecuteCommandRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashexecuteCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExecuteCommandRequest {
  
  @JSImport("vscode-languageserver-protocol", "ExecuteCommandRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ExecuteCommandRequest.method")
  @js.native
  val method: workspaceSlashexecuteCommand = js.native
  
  @JSImport("vscode-languageserver-protocol", "ExecuteCommandRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ExecuteCommandParams, Any, scala.Nothing, Unit, ExecuteCommandRegistrationOptions] = js.native
}
