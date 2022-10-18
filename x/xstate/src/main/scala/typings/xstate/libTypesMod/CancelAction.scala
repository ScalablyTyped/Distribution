package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAction
  extends StObject
     with ActionObject[Any, Any]
     with _BaseAction[Any, Any, Any] {
  
  var sendId: String | Double
}
object CancelAction {
  
  inline def apply(sendId: String | Double, `type`: String): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAction]
  }
  
  extension [Self <: CancelAction](x: Self) {
    
    inline def setSendId(value: String | Double): Self = StObject.set(x, "sendId", value.asInstanceOf[js.Any])
  }
}
