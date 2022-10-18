package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashapplyEdit
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWorkspaceEditRequest {
  
  @JSImport("vscode-languageclient", "ApplyWorkspaceEditRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ApplyWorkspaceEditRequest.method")
  @js.native
  val method: workspaceSlashapplyEdit = js.native
  
  @JSImport("vscode-languageclient", "ApplyWorkspaceEditRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResult, scala.Nothing, Unit, Unit] = js.native
}
