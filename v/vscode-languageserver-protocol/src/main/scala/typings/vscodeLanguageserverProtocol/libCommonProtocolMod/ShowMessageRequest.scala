package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashshowMessageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowMessageRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageRequest.method")
  @js.native
  val method: windowSlashshowMessageRequest = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShowMessageRequest.type")
  @js.native
  val `type`: ProtocolRequestType[ShowMessageRequestParams, MessageActionItem | Null, scala.Nothing, Unit, Unit] = js.native
}
