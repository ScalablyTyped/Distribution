package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidChangeConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeConfigurationNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeConfigurationNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeConfigurationNotification.method")
  @js.native
  val method: workspaceSlashdidChangeConfiguration = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeConfigurationNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidChangeConfigurationParams, DidChangeConfigurationRegistrationOptions] = js.native
}
