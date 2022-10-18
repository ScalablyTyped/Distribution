package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashconfiguration
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigurationRequest {
  
  @JSImport("vscode-languageclient", "ConfigurationRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ConfigurationRequest.method")
  @js.native
  val method: workspaceSlashconfiguration = js.native
  
  @JSImport("vscode-languageclient", "ConfigurationRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[ConfigurationParams & PartialResultParams, js.Array[Any], scala.Nothing, Unit, Unit] = js.native
}
