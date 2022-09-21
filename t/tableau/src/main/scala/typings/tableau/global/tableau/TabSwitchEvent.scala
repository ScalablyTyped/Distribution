package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.TabSwitchEvent")
@js.native
open class TabSwitchEvent ()
  extends StObject
     with typings.tableau.tableau.TabSwitchEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  
  /** Gets the name of the sheet that is currently active. */
  /* CompleteClass */
  override def getNewSheetName(): String = js.native
  
  /** Gets the name of the sheet that was active before the tab switch event occurred. */
  /* CompleteClass */
  override def getOldSheetName(): String = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}
