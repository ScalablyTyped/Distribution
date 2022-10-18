package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashapplyEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWorkspaceEditRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ApplyWorkspaceEditRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ApplyWorkspaceEditRequest.method")
  @js.native
  val method: workspaceSlashapplyEdit = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ApplyWorkspaceEditRequest.type")
  @js.native
  val `type`: ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResult, scala.Nothing, Unit, Unit] = js.native
}
