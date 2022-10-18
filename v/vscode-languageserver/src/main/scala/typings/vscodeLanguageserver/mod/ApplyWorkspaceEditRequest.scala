package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashapplyEdit
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWorkspaceEditRequest {
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.method")
  @js.native
  val method: workspaceSlashapplyEdit = js.native
  
  @JSImport("vscode-languageserver", "ApplyWorkspaceEditRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResult, scala.Nothing, Unit, Unit] = js.native
}
