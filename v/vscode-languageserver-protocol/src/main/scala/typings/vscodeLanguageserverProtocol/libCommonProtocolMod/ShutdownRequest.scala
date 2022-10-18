package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.shutdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShutdownRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShutdownRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShutdownRequest.method")
  @js.native
  val method: shutdown = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ShutdownRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[Unit, scala.Nothing, Unit, Unit] = js.native
}
