package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabSwitchEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the name of the sheet that is currently active. */
  def getNewSheetName(): String
  
  /** Gets the name of the sheet that was active before the tab switch event occurred. */
  def getOldSheetName(): String
}
object TabSwitchEvent {
  
  inline def apply(
    getEventName: () => TableauEventName,
    getNewSheetName: () => String,
    getOldSheetName: () => String,
    getViz: () => Viz
  ): TabSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getNewSheetName = js.Any.fromFunction0(getNewSheetName), getOldSheetName = js.Any.fromFunction0(getOldSheetName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TabSwitchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabSwitchEvent] (val x: Self) extends AnyVal {
    
    inline def setGetNewSheetName(value: () => String): Self = StObject.set(x, "getNewSheetName", js.Any.fromFunction0(value))
    
    inline def setGetOldSheetName(value: () => String): Self = StObject.set(x, "getOldSheetName", js.Any.fromFunction0(value))
  }
}
