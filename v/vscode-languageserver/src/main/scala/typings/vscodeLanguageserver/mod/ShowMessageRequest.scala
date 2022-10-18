package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.windowSlashshowMessageRequest
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.MessageActionItem
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ShowMessageRequestParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowMessageRequest {
  
  @JSImport("vscode-languageserver", "ShowMessageRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ShowMessageRequest.method")
  @js.native
  val method: windowSlashshowMessageRequest = js.native
  
  @JSImport("vscode-languageserver", "ShowMessageRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ShowMessageRequestParams, MessageActionItem | Null, scala.Nothing, Unit, Unit] = js.native
}
