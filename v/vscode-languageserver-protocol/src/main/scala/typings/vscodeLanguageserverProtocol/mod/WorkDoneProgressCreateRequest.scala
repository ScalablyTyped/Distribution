package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCreateParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCreateRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCreateRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCreateRequest.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcreate = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkDoneProgressCreateRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
