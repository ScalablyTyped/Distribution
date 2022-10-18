package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensWorkspaceClientCapabilities extends StObject {
  
  /**
    * Whether the client implementation supports a refresh request sent from the
    * server to the client.
    *
    * Note that this event is global and will force the client to refresh all
    * code lenses currently shown. It should be used with absolute care and is
    * useful for situation where a server for example detect a project wide
    * change that requires such a calculation.
    */
  var refreshSupport: js.UndefOr[Boolean] = js.undefined
}
object CodeLensWorkspaceClientCapabilities {
  
  inline def apply(): CodeLensWorkspaceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensWorkspaceClientCapabilities]
  }
  
  extension [Self <: CodeLensWorkspaceClientCapabilities](x: Self) {
    
    inline def setRefreshSupport(value: Boolean): Self = StObject.set(x, "refreshSupport", value.asInstanceOf[js.Any])
    
    inline def setRefreshSupportUndefined: Self = StObject.set(x, "refreshSupport", js.undefined)
  }
}
