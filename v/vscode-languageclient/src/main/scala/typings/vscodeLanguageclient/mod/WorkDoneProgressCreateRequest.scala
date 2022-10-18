package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.windowSlashworkDoneProgressSlashcreate
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCreateParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCreateRequest {
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCreateRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCreateRequest.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcreate = js.native
  
  @JSImport("vscode-languageclient", "WorkDoneProgressCreateRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
