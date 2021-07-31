package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationPayload
  extends StObject
     with Payload {
  
  var payload: js.Any
}
object MutationPayload {
  
  @scala.inline
  def apply(payload: js.Any, `type`: String): MutationPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationPayload]
  }
  
  @scala.inline
  implicit class MutationPayloadMutableBuilder[Self <: MutationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
