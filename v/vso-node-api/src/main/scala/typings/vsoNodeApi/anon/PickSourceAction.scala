package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickSourceAction extends StObject {
  
  var pickSourceAction: scala.Double = js.native
  
  var pickTargetAction: scala.Double = js.native
  
  var undecided: scala.Double = js.native
}
object PickSourceAction {
  
  @scala.inline
  def apply(pickSourceAction: scala.Double, pickTargetAction: scala.Double, undecided: scala.Double): PickSourceAction = {
    val __obj = js.Dynamic.literal(pickSourceAction = pickSourceAction.asInstanceOf[js.Any], pickTargetAction = pickTargetAction.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSourceAction]
  }
  
  @scala.inline
  implicit class PickSourceActionMutableBuilder[Self <: PickSourceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickSourceAction(value: scala.Double): Self = StObject.set(x, "pickSourceAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickTargetAction(value: scala.Double): Self = StObject.set(x, "pickTargetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
  }
}
