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
  
  @scala.inline
  def apply(): CallHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallHierarchy]
  }
  
  @scala.inline
  implicit class CallHierarchyMutableBuilder[Self <: CallHierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallHierarchy(value: DynamicRegistration): Self = StObject.set(x, "callHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallHierarchyUndefined: Self = StObject.set(x, "callHierarchy", js.undefined)
  }
}
