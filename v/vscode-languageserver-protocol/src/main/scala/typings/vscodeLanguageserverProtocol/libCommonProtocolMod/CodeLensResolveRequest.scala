package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.codeLensSlashresolve
import typings.vscodeLanguageserverTypes.mod.CodeLens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensResolveRequest.method")
  @js.native
  val method: codeLensSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeLensResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[CodeLens, CodeLens, scala.Nothing, Unit, Unit] = js.native
}
