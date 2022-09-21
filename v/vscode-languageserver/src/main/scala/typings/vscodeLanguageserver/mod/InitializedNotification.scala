package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.initialized
import typings.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializedNotification {
  
  @JSImport("vscode-languageserver", "InitializedNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "InitializedNotification.method")
  @js.native
  val method: initialized = js.native
  
  @JSImport("vscode-languageserver", "InitializedNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[InitializedParams, Unit] = js.native
}
