package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializedParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.initialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializedNotification {
  
  @JSImport("vscode-languageserver-protocol", "InitializedNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "InitializedNotification.method")
  @js.native
  val method: initialized = js.native
  
  @JSImport("vscode-languageserver-protocol", "InitializedNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[InitializedParams, Unit] = js.native
}
