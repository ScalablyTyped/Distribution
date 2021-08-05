package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItem
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster data received
  */
trait RosterReceived
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String
  
  /**
    *    Array contains VoxImplant.RosterItem elements
    */
  var roster: js.Array[RosterItem]
}
object RosterReceived {
  
  inline def apply(id: String, roster: js.Array[RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterReceived]
  }
  
  extension [Self <: RosterReceived](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoster(value: js.Array[RosterItem]): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
    
    inline def setRosterVarargs(value: RosterItem*): Self = StObject.set(x, "roster", js.Array(value :_*))
  }
}
