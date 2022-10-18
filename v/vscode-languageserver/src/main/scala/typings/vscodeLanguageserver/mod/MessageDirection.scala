package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "MessageDirection")
@js.native
object MessageDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection & String
  ] = js.native
  
  /* "both" */ val both: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.both & String = js.native
  
  /* "clientToServer" */ val clientToServer: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.clientToServer & String = js.native
  
  /* "serverToClient" */ val serverToClient: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection.serverToClient & String = js.native
}
