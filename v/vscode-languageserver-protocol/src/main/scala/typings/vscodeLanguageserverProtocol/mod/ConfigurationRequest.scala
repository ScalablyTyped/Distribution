package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashconfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigurationRequest {
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.method")
  @js.native
  val method: workspaceSlashconfiguration = js.native
  
  @JSImport("vscode-languageserver-protocol", "ConfigurationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ConfigurationParams & PartialResultParams, js.Array[Any], scala.Nothing, Unit, Unit] = js.native
}
