package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationPayload
  extends StObject
     with Payload {
  
  var payload: Any
}
object MutationPayload {
  
  inline def apply(payload: Any, `type`: String): MutationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationPayload] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
