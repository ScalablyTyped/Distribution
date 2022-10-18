package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.initialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializedNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializedNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializedNotification.method")
  @js.native
  val method: initialized = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InitializedNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[InitializedParams, Unit] = js.native
}
