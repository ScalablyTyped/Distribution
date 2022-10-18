package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareRename
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PrepareRenameParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PrepareRenameResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrepareRenameRequest {
  
  @JSImport("vscode-languageserver", "PrepareRenameRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "PrepareRenameRequest.method")
  @js.native
  val method: textDocumentSlashprepareRename = js.native
  
  @JSImport("vscode-languageserver", "PrepareRenameRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[PrepareRenameParams, PrepareRenameResult | Null, scala.Nothing, Unit, Unit] = js.native
}
