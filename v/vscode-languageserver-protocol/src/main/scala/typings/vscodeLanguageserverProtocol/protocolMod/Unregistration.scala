package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unregistration extends StObject {
  
  /**
    * The id used to unregister the request or notification. Usually an id
    * provided during the register request.
    */
  var id: String = js.native
  
  /**
    * The method to unregister for.
    */
  var method: String = js.native
}
object Unregistration {
  
  @scala.inline
  def apply(id: String, method: String): Unregistration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unregistration]
  }
  
  @scala.inline
  implicit class UnregistrationMutableBuilder[Self <: Unregistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
