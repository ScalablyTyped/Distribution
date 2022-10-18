package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashexecuteCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExecuteCommandRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExecuteCommandRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExecuteCommandRequest.method")
  @js.native
  val method: workspaceSlashexecuteCommand = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ExecuteCommandRequest.type")
  @js.native
  val `type`: ProtocolRequestType[ExecuteCommandParams, Any, scala.Nothing, Unit, ExecuteCommandRegistrationOptions] = js.native
}
