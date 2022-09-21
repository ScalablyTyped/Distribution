package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.shutdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShutdownRequest {
  
  @JSImport("vscode-languageclient", "ShutdownRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ShutdownRequest.method")
  @js.native
  val method: shutdown = js.native
  
  @JSImport("vscode-languageclient", "ShutdownRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0[Unit, scala.Nothing, Unit, Unit] = js.native
}
