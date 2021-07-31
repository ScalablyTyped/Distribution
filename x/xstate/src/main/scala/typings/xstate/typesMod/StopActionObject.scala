package typings.xstate.typesMod

import typings.xstate.anon.Id
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopActionObject extends StObject {
  
  var activity: Id
  
  var `type`: Stop
}
object StopActionObject {
  
  @scala.inline
  def apply(activity: Id, `type`: Stop): StopActionObject = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActionObject]
  }
  
  @scala.inline
  implicit class StopActionObjectMutableBuilder[Self <: StopActionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: Id): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
