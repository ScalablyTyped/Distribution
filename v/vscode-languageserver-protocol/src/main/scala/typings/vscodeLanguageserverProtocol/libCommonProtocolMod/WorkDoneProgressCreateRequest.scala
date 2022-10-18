package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressCreateParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.windowSlashworkDoneProgressSlashcreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgressCreateRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCreateRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCreateRequest.method")
  @js.native
  val method: windowSlashworkDoneProgressSlashcreate = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkDoneProgressCreateRequest.type")
  @js.native
  val `type`: ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
}
