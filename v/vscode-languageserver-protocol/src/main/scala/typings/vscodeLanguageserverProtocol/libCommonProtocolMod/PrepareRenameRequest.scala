package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareRename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrepareRenameRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PrepareRenameRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PrepareRenameRequest.method")
  @js.native
  val method: textDocumentSlashprepareRename = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "PrepareRenameRequest.type")
  @js.native
  val `type`: ProtocolRequestType[PrepareRenameParams, PrepareRenameResult | Null, scala.Nothing, Unit, Unit] = js.native
}
