package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotworkspaceFolderMod.WorkspaceFoldersInitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeParams
  extends StObject
     with _InitializeParams
     with WorkspaceFoldersInitializeParams
object InitializeParams {
  
  inline def apply(capabilities: ClientCapabilities): InitializeParams = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], processId = null, rootUri = null)
    __obj.asInstanceOf[InitializeParams]
  }
}
