package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PrepareRenameParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PrepareRenameResult
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareRename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrepareRenameRequest {
  
  @JSImport("vscode-languageserver-protocol", "PrepareRenameRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "PrepareRenameRequest.method")
  @js.native
  val method: textDocumentSlashprepareRename = js.native
  
  @JSImport("vscode-languageserver-protocol", "PrepareRenameRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[PrepareRenameParams, PrepareRenameResult | Null, scala.Nothing, Unit, Unit] = js.native
}
