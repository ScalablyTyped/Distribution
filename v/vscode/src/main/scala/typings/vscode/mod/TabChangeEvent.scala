package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabChangeEvent extends StObject {
  
  /**
    * Tabs that have changed, e.g have changed
    * their {@link Tab.isActive active} state.
    */
  val changed: js.Array[Tab]
  
  /**
    * The tabs that have been closed.
    */
  val closed: js.Array[Tab]
  
  /**
    * The tabs that have been opened.
    */
  val opened: js.Array[Tab]
}
object TabChangeEvent {
  
  inline def apply(changed: js.Array[Tab], closed: js.Array[Tab], opened: js.Array[Tab]): TabChangeEvent = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setChanged(value: js.Array[Tab]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedVarargs(value: Tab*): Self = StObject.set(x, "changed", js.Array(value*))
    
    inline def setClosed(value: js.Array[Tab]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedVarargs(value: Tab*): Self = StObject.set(x, "closed", js.Array(value*))
    
    inline def setOpened(value: js.Array[Tab]): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedVarargs(value: Tab*): Self = StObject.set(x, "opened", js.Array(value*))
  }
}
