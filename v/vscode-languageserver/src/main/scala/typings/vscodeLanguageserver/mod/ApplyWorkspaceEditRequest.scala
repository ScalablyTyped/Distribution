package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashapplyEdit
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWorkspaceEditRequest {
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.method")
  @js.native
  val method: workspaceSlashapplyEdit = js.native
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResult, scala.Nothing, Unit, Unit] = js.native
}
