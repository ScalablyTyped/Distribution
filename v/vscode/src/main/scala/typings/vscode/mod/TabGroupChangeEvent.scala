package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabGroupChangeEvent extends StObject {
  
  /**
    * Tab groups that have changed, e.g have changed
    * their {@link TabGroup.isActive active} state.
    */
  val changed: js.Array[TabGroup]
  
  /**
    * Tab groups that have been closed.
    */
  val closed: js.Array[TabGroup]
  
  /**
    * Tab groups that have been opened.
    */
  val opened: js.Array[TabGroup]
}
object TabGroupChangeEvent {
  
  inline def apply(changed: js.Array[TabGroup], closed: js.Array[TabGroup], opened: js.Array[TabGroup]): TabGroupChangeEvent = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupChangeEvent]
  }
  
  extension [Self <: TabGroupChangeEvent](x: Self) {
    
    inline def setChanged(value: js.Array[TabGroup]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedVarargs(value: TabGroup*): Self = StObject.set(x, "changed", js.Array(value*))
    
    inline def setClosed(value: js.Array[TabGroup]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedVarargs(value: TabGroup*): Self = StObject.set(x, "closed", js.Array(value*))
    
    inline def setOpened(value: js.Array[TabGroup]): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedVarargs(value: TabGroup*): Self = StObject.set(x, "opened", js.Array(value*))
  }
}
