package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidChangeConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeConfigurationNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidChangeConfigurationNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeConfigurationNotification.method")
  @js.native
  val method: workspaceSlashdidChangeConfiguration = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeConfigurationNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeConfigurationParams, DidChangeConfigurationRegistrationOptions] = js.native
}
