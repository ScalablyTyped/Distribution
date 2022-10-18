package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashapplyEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWorkspaceEditRequest {
  
  @JSImport("vscode-languageserver-protocol", "ApplyWorkspaceEditRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ApplyWorkspaceEditRequest.method")
  @js.native
  val method: workspaceSlashapplyEdit = js.native
  
  @JSImport("vscode-languageserver-protocol", "ApplyWorkspaceEditRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResult, scala.Nothing, Unit, Unit] = js.native
}
