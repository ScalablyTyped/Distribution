package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.initialize
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeError
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeRequest {
  
  @JSImport("vscode-languageserver", "InitializeRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "InitializeRequest.method")
  @js.native
  val method: initialize = js.native
  
  @JSImport("vscode-languageserver", "InitializeRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[InitializeParams, InitializeResult[Any], scala.Nothing, InitializeError, Unit] = js.native
}
