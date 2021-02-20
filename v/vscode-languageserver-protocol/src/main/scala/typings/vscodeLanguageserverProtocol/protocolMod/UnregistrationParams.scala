package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnregistrationParams extends StObject {
  
  var unregisterations: js.Array[Unregistration] = js.native
}
object UnregistrationParams {
  
  @scala.inline
  def apply(unregisterations: js.Array[Unregistration]): UnregistrationParams = {
    val __obj = js.Dynamic.literal(unregisterations = unregisterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregistrationParams]
  }
  
  @scala.inline
  implicit class UnregistrationParamsMutableBuilder[Self <: UnregistrationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnregisterations(value: js.Array[Unregistration]): Self = StObject.set(x, "unregisterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregisterationsVarargs(value: Unregistration*): Self = StObject.set(x, "unregisterations", js.Array(value :_*))
  }
}
