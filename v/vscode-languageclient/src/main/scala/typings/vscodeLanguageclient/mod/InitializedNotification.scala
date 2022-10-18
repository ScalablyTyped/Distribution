package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.initialized
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializedParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializedNotification {
  
  @JSImport("vscode-languageclient", "InitializedNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "InitializedNotification.method")
  @js.native
  val method: initialized = js.native
  
  @JSImport("vscode-languageclient", "InitializedNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[InitializedParams, Unit] = js.native
}
