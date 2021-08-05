package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchy extends StObject {
  
  /**
    * Capabilities specific to the `textDocument/callHierarchy`.
    *
    * @since 3.16.0 - Proposed state
    */
  var callHierarchy: js.UndefOr[DynamicRegistration] = js.undefined
}
object CallHierarchy {
  
  inline def apply(): CallHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallHierarchy]
  }
  
  extension [Self <: CallHierarchy](x: Self) {
    
    inline def setCallHierarchy(value: DynamicRegistration): Self = StObject.set(x, "callHierarchy", value.asInstanceOf[js.Any])
    
    inline def setCallHierarchyUndefined: Self = StObject.set(x, "callHierarchy", js.undefined)
  }
}
