package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.shutdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShutdownRequest {
  
  @JSImport("vscode-languageserver", "ShutdownRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ShutdownRequest.method")
  @js.native
  val method: shutdown = js.native
  
  @JSImport("vscode-languageserver", "ShutdownRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0[Unit, scala.Nothing, Unit, Unit] = js.native
}
