package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "MessageDirection")
@js.native
object MessageDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection & String] = js.native
  
  /* "both" */ val both: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.both & String = js.native
  
  /* "clientToServer" */ val clientToServer: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.clientToServer & String = js.native
  
  /* "serverToClient" */ val serverToClient: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection.serverToClient & String = js.native
}
