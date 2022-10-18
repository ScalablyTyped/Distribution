package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSymbolOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * The server provides support to resolve additional
    * information for a workspace symbol.
    *
    * @since 3.17.0
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceSymbolOptions {
  
  inline def apply(): WorkspaceSymbolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSymbolOptions]
  }
  
  extension [Self <: WorkspaceSymbolOptions](x: Self) {
    
    inline def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
    
    inline def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
  }
}
