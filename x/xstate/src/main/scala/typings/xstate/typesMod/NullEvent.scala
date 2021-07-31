package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullEvent extends StObject {
  
  var `type`: typings.xstate.typesMod.ActionTypes.NullEvent
}
object NullEvent {
  
  @scala.inline
  def apply(`type`: typings.xstate.typesMod.ActionTypes.NullEvent): NullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEvent]
  }
  
  @scala.inline
  implicit class NullEventMutableBuilder[Self <: NullEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.xstate.typesMod.ActionTypes.NullEvent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
