package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelAction
  extends ActionObject[js.Any, js.Any] {
  
  var sendId: String | Double = js.native
}
object CancelAction {
  
  @scala.inline
  def apply(sendId: String | Double, `type`: String): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAction]
  }
  
  @scala.inline
  implicit class CancelActionMutableBuilder[Self <: CancelAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendId(value: String | Double): Self = StObject.set(x, "sendId", value.asInstanceOf[js.Any])
  }
}
