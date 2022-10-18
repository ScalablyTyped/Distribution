package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidChangeConfiguration
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeConfigurationNotification {
  
  @JSImport("vscode-languageclient", "DidChangeConfigurationNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeConfigurationNotification.method")
  @js.native
  val method: workspaceSlashdidChangeConfiguration = js.native
  
  @JSImport("vscode-languageclient", "DidChangeConfigurationNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeConfigurationParams, DidChangeConfigurationRegistrationOptions] = js.native
}
