package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventObject extends StObject {
  
  /**
    * The type of event that is sent.
    */
  var `type`: String
}
object EventObject {
  
  @scala.inline
  def apply(`type`: String): EventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  @scala.inline
  implicit class EventObjectMutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
