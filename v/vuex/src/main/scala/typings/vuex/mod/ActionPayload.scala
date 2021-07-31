package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionPayload
  extends StObject
     with Payload {
  
  var payload: js.Any
}
object ActionPayload {
  
  @scala.inline
  def apply(payload: js.Any, `type`: String): ActionPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionPayload]
  }
  
  @scala.inline
  implicit class ActionPayloadMutableBuilder[Self <: ActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
