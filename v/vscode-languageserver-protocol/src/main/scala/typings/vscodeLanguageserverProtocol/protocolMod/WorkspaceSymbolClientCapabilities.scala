package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceSymbolClientCapabilities extends StObject {
  
  /**
    * Symbol request supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
    */
  var symbolKind: js.UndefOr[`1`] = js.native
}
object WorkspaceSymbolClientCapabilities {
  
  @scala.inline
  def apply(): WorkspaceSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSymbolClientCapabilities]
  }
  
  @scala.inline
  implicit class WorkspaceSymbolClientCapabilitiesMutableBuilder[Self <: WorkspaceSymbolClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setSymbolKind(value: `1`): Self = StObject.set(x, "symbolKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKindUndefined: Self = StObject.set(x, "symbolKind", js.undefined)
  }
}
